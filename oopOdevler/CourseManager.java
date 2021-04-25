package oopOdevler;

import java.util.ArrayList;

public class CourseManager {
	public  ArrayList<Course> courses= new ArrayList<Course>();
	public void Add(int id, int categoryId, String name, String instructor,double status) {
		Course course=new Course();
		course.id=id;
		course.categoryId=categoryId;
		course.name=name;
		course.instructor=instructor;
		course.status=status;
		this.courses.add(course);
		System.out.println("Yeni kurs eklendi");
	}
	public void List() {
		System.out.println("--------Kurslar---------");
		for(Course course: this.courses) {
			System.out.println("Course id="+course.id);
			System.out.println("Category id="+course.categoryId);
			System.out.println("Course Name="+course.name);
			System.out.println("Course Instructor="+course.instructor);
			System.out.println("Course Status="+course.status);
			System.out.println("_______________________________");
		}
		System.out.println("-----------------------------");
	}
}
