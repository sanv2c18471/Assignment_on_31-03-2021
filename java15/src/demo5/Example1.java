package demo5;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {
public static void main(String[] args) {
	ArrayList <Student> al = new ArrayList<Student>();{
		al.add(new Student(101,"john",92f));
		al.add(new Student(105,"sam",94f));
		al.add(new Student(102,"peter",98f));
		al.add(new Student(103,"merry",93f));
		al.add(new Student(104,"anni",91f));
		System.out.println("The sorting will be based on marks");
		Collections.sort(al,(a,b)->{
			return a.marks.compareTo(b.marks);
		});
		for(Student s : al) {
			System.out.println("id: "+s.id+" "+"Name: "+s.name+" "+"Marks: "+s.marks);
		}
	}
	System.out.println("The sorting will be based on id");
	Collections.sort(al,(a,b)->{
		return a.id.compareTo(b.id);
	});
	for(Student s : al) {
		System.out.println("id: "+s.id+" "+"Name: "+s.name+" "+"Marks: "+s.marks);
	}
	System.out.println("The sorting will be based on String");
	Collections.sort(al,(a,b)->{
		return a.name.compareTo(b.name);
	});
	for(Student s : al) {
		System.out.println("id: "+s.id+" "+"Name: "+s.name+" "+"Marks: "+s.marks);
	}
}
}
class Student{
	//int id;
	Integer id;
	String name;
	Float marks;
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}