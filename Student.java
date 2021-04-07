
public class Student {

	private int id;
	static int uniqueid=0;
	private String name;
	
	public Student(String name) {
		id=uniqueid;
		uniqueid++;
		this.name=name;	
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Attendance CS220= new Attendance();
		Student James= new Student("James");
		Student Walter= new Student("Walter");
		Student Carol= new Student("Carol");
		Student Berry= new Student ("Berry");
		CS220.addstudent(James);
		CS220.addstudent(Walter);
		CS220.addstudent(Carol);
		CS220.addstudent(Berry);
		CS220.studentids(James);
		CS220.studentids(James); 
		CS220.studentids(Walter);
		CS220.studentids(Carol);
		
		CS220.attendancelist();
		
		
	}
}


//In a specific high school, students have to swipe their IDs when they come to class in order to take attendance. 
//The ID numbers are converted to names and then stored. 
//If a student swipes more than once in a day, the system only stores their name once. 
//At the end of the day, the teachers check the results to see who came to class and who didn’t.
//Design a system to keep track of attendance. 
//Note that the machine that helps people swipe to take attendance takes ID numbers as its input. 
