package SpringBootProject.SpringBootProject;

public class Student {
	
	String name;
	String address;
	int studId;

	public Student(String name, String address, int studId) {
		super();
		this.name = name;
		this.address = address;
		this.studId = studId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	
	
}

