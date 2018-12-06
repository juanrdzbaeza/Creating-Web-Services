
package packt.jee.eclipse.ws.soap.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CourseManagementService", targetNamespace = "http://soap.ws.eclipse.jee.packt/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CourseManagementService {


    /**
     * 
     * @return
     *     returns java.util.List<packt.jee.eclipse.ws.soap.client.Course>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCourses", targetNamespace = "http://soap.ws.eclipse.jee.packt/", className = "packt.jee.eclipse.ws.soap.client.GetCourses")
    @ResponseWrapper(localName = "getCoursesResponse", targetNamespace = "http://soap.ws.eclipse.jee.packt/", className = "packt.jee.eclipse.ws.soap.client.GetCoursesResponse")
    @Action(input = "http://soap.ws.eclipse.jee.packt/CourseManagementService/getCoursesRequest", output = "http://soap.ws.eclipse.jee.packt/CourseManagementService/getCoursesResponse")
    public List<Course> getCourses();

    /**
     * 
     * @param arg0
     * @return
     *     returns packt.jee.eclipse.ws.soap.client.Course
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCourse", targetNamespace = "http://soap.ws.eclipse.jee.packt/", className = "packt.jee.eclipse.ws.soap.client.GetCourse")
    @ResponseWrapper(localName = "getCourseResponse", targetNamespace = "http://soap.ws.eclipse.jee.packt/", className = "packt.jee.eclipse.ws.soap.client.GetCourseResponse")
    @Action(input = "http://soap.ws.eclipse.jee.packt/CourseManagementService/getCourseRequest", output = "http://soap.ws.eclipse.jee.packt/CourseManagementService/getCourseResponse")
    public Course getCourse(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}