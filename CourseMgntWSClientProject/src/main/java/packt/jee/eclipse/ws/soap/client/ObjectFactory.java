
package packt.jee.eclipse.ws.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the packt.jee.eclipse.ws.soap.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCourse_QNAME = new QName("http://soap.ws.eclipse.jee.packt/", "getCourse");
    private final static QName _GetCoursesResponse_QNAME = new QName("http://soap.ws.eclipse.jee.packt/", "getCoursesResponse");
    private final static QName _GetCourses_QNAME = new QName("http://soap.ws.eclipse.jee.packt/", "getCourses");
    private final static QName _GetCourseResponse_QNAME = new QName("http://soap.ws.eclipse.jee.packt/", "getCourseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: packt.jee.eclipse.ws.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCourseResponse }
     * 
     */
    public GetCourseResponse createGetCourseResponse() {
        return new GetCourseResponse();
    }

    /**
     * Create an instance of {@link GetCourses }
     * 
     */
    public GetCourses createGetCourses() {
        return new GetCourses();
    }

    /**
     * Create an instance of {@link GetCoursesResponse }
     * 
     */
    public GetCoursesResponse createGetCoursesResponse() {
        return new GetCoursesResponse();
    }

    /**
     * Create an instance of {@link GetCourse }
     * 
     */
    public GetCourse createGetCourse() {
        return new GetCourse();
    }

    /**
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.eclipse.jee.packt/", name = "getCourse")
    public JAXBElement<GetCourse> createGetCourse(GetCourse value) {
        return new JAXBElement<GetCourse>(_GetCourse_QNAME, GetCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoursesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.eclipse.jee.packt/", name = "getCoursesResponse")
    public JAXBElement<GetCoursesResponse> createGetCoursesResponse(GetCoursesResponse value) {
        return new JAXBElement<GetCoursesResponse>(_GetCoursesResponse_QNAME, GetCoursesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.eclipse.jee.packt/", name = "getCourses")
    public JAXBElement<GetCourses> createGetCourses(GetCourses value) {
        return new JAXBElement<GetCourses>(_GetCourses_QNAME, GetCourses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.eclipse.jee.packt/", name = "getCourseResponse")
    public JAXBElement<GetCourseResponse> createGetCourseResponse(GetCourseResponse value) {
        return new JAXBElement<GetCourseResponse>(_GetCourseResponse_QNAME, GetCourseResponse.class, null, value);
    }

}
