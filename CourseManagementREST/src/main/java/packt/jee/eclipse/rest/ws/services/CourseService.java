package packt.jee.eclipse.rest.ws.services;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import packt.jee.eclipse.rest.ws.dto.Course;
import packt.jee.eclipse.rest.ws.dto.Teacher;


@Path("/course")
public class CourseService {
	
	@GET
	@Produces (MediaType.APPLICATION_JSON)
	@Path("get/{courseId}")
	public Course getCourseJSON (@PathParam("courseId") int id) {
		return createDummyCourse(id);
	}
	
	@GET
	@Produces (MediaType.APPLICATION_XML)
	@Path("get/{courseId}")
	public Course getCourseXML (@PathParam("courseId") int id) {
		return createDummyCourse(id);
	}
	
	private Course createDummyCourse(int id) {
		return new Course(id,"Course-" + id, 5, new Teacher(2, "Teacher1"));
	}
	
	@POST
	@Consumes (MediaType.APPLICATION_FORM_URLENCODED)
	@Path("add")
	public Response addCourseFromForm (@FormParam("name") String courseName, 
			@FormParam("credits") int credits) throws URISyntaxException {
		dummyAddCourse(courseName, credits);
		return Response.seeOther(new URI("../addCourseSuccess.html")).build();
	}

	private int dummyAddCourse(String courseName, int credits) {
		System.out.println("Adding course " + courseName + ", credits = " + credits);
		return 10;
	}
	
	@POST
	@Consumes (MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	@Path("add")
	public Course addCourse (Course course) {
		int courseId = dummyAddCourse(course.getName(), course.getCredits());
		course.setId(courseId);
		return course;
	}
	
}
