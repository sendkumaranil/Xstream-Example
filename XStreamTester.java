import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;


public class XStreamTester {

	public static void main(String[] args) {
		

		
	    XStream xstream = new XStream(new StaxDriver());
	      
		Student student=FetchStudents.getStudentDetails();
		
		 //Object to XML Conversion
	      String xml = xstream.toXML(student);
	      System.out.println(xml);
	      
	    //XML to Object Conversion
	      Student student1 = (Student)xstream.fromXML(xml);
	      System.out.println(student1);
	      
	}

}
class FetchStudents{
	public static Student getStudentDetails(){
		Student student=new Student();
		Address address=new Address();
		
		address.setArea("Domlur");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setCountry("India");
		
		student.setFirstName("Joy");
		student.setLastName("Deep");
		student.setRollNo(123);
		student.setAddress(address);
		
		return student;
	}
}

class Student{
	private int rollNo;
	private String firstName;
	private String lastName;
	private String courseName;
	
	private Address address;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", courseName=" + courseName
				+ ", address=" + address + "]";
	}
	
}
class Address{
	private String area;
	private String city;
	private String state;
	private String country;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	
}
