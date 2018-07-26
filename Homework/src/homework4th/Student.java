package homework4th;

public class Student {
	private String name;
	private int course;

	Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=\t" + name + ",    \tcourse=\t" + course + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
}
