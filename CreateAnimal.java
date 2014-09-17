// This is a comment in Java!

/* This is another comment in Java! */ 

import java.util.Scanner;


public class CreateAnimal {
	public static void main (String args[]) {
		String name; 
		int weight, height, age; 

		System.out.println("Please type the name of your animal!");
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		System.out.println("Please type "+name+"'s weight!");
		weight = in.nextInt(); 
		System.out.println("Please type "+name+"'s height!");
		height = in.nextInt();
		System.out.println("Please type "+name+"'s age!");
		age = in.nextInt();

		System.out.println("----SUMMARY----");
		System.out.println("Your animal's name is "+name);
		System.out.println(name+"'s name is "+weight);
		System.out.println(name+"'s name is "+height);
		System.out.println(name+"'s name is "+age);
	}
}