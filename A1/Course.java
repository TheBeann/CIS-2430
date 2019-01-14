public class Course{
	
	private String cCode, cTitle, cGrade;

	public Course(){
		cCode = "No course code specified";
		cTitle = "No course title specified";
	}
	public Course(String courseCode, String courseTitle){
		cCode = courseCode;
		cTitle = courseTitle;
	}
	String getCourseCode(){
		this.cCode = cCode;
		return cCode;
	}
	void setCourseCode(String courseCode){
		courseCode = cCode;
	}
	String getCourseTitle(){
		this.cTitle = cTitle;
		return cTitle;
	}
	void setCourseTitle(String courseTitle){
		courseTitle = cTitle;
	}
	double getCourseCredit(){

	}
	void setCourseCredit(double credit){

	}
	ArrayList<Course> getPrerequisites(){

	}
	void setPrerequisites (ArrayList<Course> preReqList){

	}
	void setCourseStatus(String courseStatus){

	}
	String getCourseStatus(){

	}
	void setCourseGrade(String grade){
		cGrade = grade;
	}
	String getCourseGrade(){
		this.cGrade = cGrade;
		return cGrade;
	}
	void setSemesterTaken(String semester){

	}
	String getSemesterTaken(){

	}
}
