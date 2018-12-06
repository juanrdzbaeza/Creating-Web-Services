package packt.jee.eclipse.ws.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class CourseManagementService {
	
	public List<Course> getCourses() {
		//Here courses could be fetched from database using,
		//for example, JDBC or JDO. However, to keep this example
		//simple, we will return hardcoded list of courses
		List<Course> courses = new ArrayList<Course>();
		courses.add(new Course(1, "Course-1", 4));
		courses.add(new Course(2, "Course-2", 3));
		return courses;
	}
	
	public Course getCourse(int courseId) {
		//Here again, we could get course details from database using
		//JDBC or JDO. However, to keep this example
		//simple, we will return hardcoded course
		return new Course(1,"Course-1",4);
	}
}
