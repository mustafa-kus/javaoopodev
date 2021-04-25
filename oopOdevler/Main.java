package oopOdevler;

import sun.security.util.Event.ReporterCategory;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.Add(1,"Commercial");
		categoryManager.List();
		CourseManager courseManager=new CourseManager();
		courseManager.Add(1, 1, "Java", "Engin", 0);
		courseManager.List();
	}

}
