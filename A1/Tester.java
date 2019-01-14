public class Tester{

	public static void main(String [] args){
		Student student = new Student();
		
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getStudentNumber());

		student.setFirstName("Justin");
		student.setLastName("Faria");
		System.out.println(student.getFirstName());
		System.out.println(student.getFullName());
	}
}
