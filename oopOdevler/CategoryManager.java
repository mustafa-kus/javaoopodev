package oopOdevler;

import java.util.ArrayList;

public class CategoryManager {
	public ArrayList<Category> categories=new ArrayList<Category>(); 
	public void Add(int id, String name) {
		Category category=new Category();
		category.id=id;
		category.name=name;
		System.out.println("Yeni kategori eklendi.");
	}
	public void List() {
		System.out.println("--------Kategoriler---------");
		for(Category category:categories) {
			System.out.println(category.name);
			
		}
		System.out.println("------------------");
	}
}
