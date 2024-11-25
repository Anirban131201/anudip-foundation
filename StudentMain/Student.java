import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable{
	
	//private properties
	private int id;
	private String name;
	private String[] subjects;
	
	//no-arugent constructor
	public Student() {
		
	}
	
	// Getter and Setter for 'id'
  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }
	
	//Getter and Setter for 'name'
	public String getName() {
		  return name;
	}
	
	public void setName(String name) {
      this.name = name;
  }
	
	//Getter and Setter for 'subjects'
	public String[] getSubjects() {
		  return subjects;
	}
	
	public void setSubjects(String[] subjects) {
      this.subjects = subjects;
  }
	
	@Override
  public String toString() {
      return "Id: "+id+"\nName: "+name+"\nSubjects: "+Arrays.toString(subjects);
  }
}
