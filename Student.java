/* Demonstrate the static data field and static method by creating an appropriate class.
 Demo this class in the main method by creating different objects. */

// creating class to demonstrate static keyword
class Student {

	String name;
	int roll;

	/*college name will be same for all students
	hence using this as static data field*/
	static String clgName = "SCET, SURAT";

	/* static method is executed even before creating any
	Object of the class, hence this static method will get executed
	as soon as the class is loaded */
	static void welcome() {
		System.out.println("\nWelcome to SCET !");
	}

	// constructor
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	static void show_details(Student s) {
		System.out.println("Student name: " + s.name + ", roll number: " + s.roll);
	}

	public static void main(String[] args) {

		// calling the static method without creating any object
		welcome();

		// accessing the static variable of class, which will have same value for all objects
		System.out.println("College name: " + Student.clgName);

		// creating and showing details of different objects
		Student s1 = new Student("Abhishek Jha", 19);
		show_details(s1);
		Student s2 = new Student("Elon Musk", 100);
		show_details(s2);
	}

}