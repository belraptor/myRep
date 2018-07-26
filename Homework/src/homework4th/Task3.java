package homework4th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student("Petya", 1);
		studentList.add(student1);
		Student student2 = new Student("Vasya", 2);
		studentList.add(student2);
		Student student3 = new Student("Lena", 3);
		studentList.add(student3);
		Student student4 = new Student("Ira", 2);
		studentList.add(student4);
		Student student5 = new Student("Sergey", 3);
		studentList.add(student5);
		Student student6 = new Student("Dima", 4);
		studentList.add(student6);
		Student student7 = new Student("Dima", 5);
		studentList.add(student7);
		Student student8 = new Student("Pasha", 1);
		studentList.add(student8);
		Student student9 = new Student("Masha", 2);
		studentList.add(student9);
		Student student10 = new Student("Roma", 3);
		studentList.add(student10);
		Student student11 = new Student("Alla", 5);
		studentList.add(student11);
		Student student12 = new Student("Artem", 4);
		studentList.add(student12);
		Student student13 = new Student("Alla", 2);
		studentList.add(student13);
		Student student14 = new Student("Dima", 1);
		studentList.add(student14);

		printStudents(studentList, 1);

	}

	public static void printStudents(List<Student> list, int course) {
		System.out.println("The following students study on the " + course + " course");
		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			Student currentStudent = (Student) iter.next();
			if (currentStudent.getCourse() == course)
				System.out.println(currentStudent.getName());
		}

	}

}
