package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

//Exercise 07
public class Topic_11_Student { 
	String id;
	String name;
	int age;
	int score;
	
	//Constructor
	public Topic_11_Student(String id, String name, int age, int score) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	

	public void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Score: " + score + "\n");
	}
	
	public static void main(String[] args) {
		Topic_11_Student[] students = new Topic_11_Student[3];
		students[0] = new Topic_11_Student("01", "KJY", 18, 8);
		students[1] = new Topic_11_Student("02", "CSH", 11, 4);
		students[2] = new Topic_11_Student("03", "LSH", 12, 9);
		
		for ( Topic_11_Student i : students) {
			i.display();
		}
	}
}
