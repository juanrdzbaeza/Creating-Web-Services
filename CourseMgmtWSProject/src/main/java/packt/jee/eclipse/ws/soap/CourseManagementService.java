package packt.jee.eclipse.ws.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


@WebService
@SOAPBinding(style=Style.RPC, use=Use.LITERAL)
public class CourseManagementService {
	
	public Courses getCourses() {
		List<Course> courses = new ArrayList<Course>();
		courses.add(new Course(1, "Course-1", 4));
		courses.add(new Course(2, "Course-2", 3));
		return new Courses(courses);
	}
	
	public Course getCourse(@WebParam(name="courseId") int courseId) {
		return new Course(1,"Course-1",4);
	}

}
