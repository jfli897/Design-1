import java.util.HashMap;
import java.util.HashSet;

public class Attendance {

	HashSet<Integer> attendance = new HashSet<Integer>();
	HashMap<Integer,String> map= new HashMap<Integer,String>();
	
	public void studentids(Student s) {
		attendance.add(s.getId());
		
	}
	public void addstudent(Student s) {
		map.put(s.getId(), s.getName());
	}
	
	
	public void attendancelist() {
		for (int s:attendance) {
			
			System.out.print(map.get(s)+", ");
			
	
		}
		System.out.println();
	}
}
