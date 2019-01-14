public class Student{

	private String firstName, lastName, fullName;
	private Integer studentID;

	public Student(){
		firstName = "No first name specified";
		lastName = "No last name specified";
		studentID = 0;
	}
	public Student(String first, String last, Integer SID){
		firstName = first;
		lastName = last;
		studentID = SID;
	} 
	String getFullName(){
		fullName = firstName + " " + lastName;
		return fullName;
	}
	void setFirstName(String first){
		firstName = first;
	}
	void setLastName(String last){
		lastName = last;
	}
	String getFirstName(){
		this.firstName = firstName;
		return firstName;
	}
	String getLastName(){
		this.lastName = lastName;
		return lastName;
	}
	void setStudentNumber(Integer studentNum){
		studentID = studentNum;
	}
	Integer getStudentNumber(){
		this.studentID = studentID;
		return studentID;
	}
}
