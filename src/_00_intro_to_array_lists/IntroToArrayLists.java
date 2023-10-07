package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> list = new ArrayList<String>();
		//   Don't forget to import the ArrayList (java.util) class
		//2. Add five Strings to your list
		System.out.println("All strings in array list using for-loop:");
		for(int i=0;i<5;i++) {
			list.add("bob"+(i+1));
		//3. Print all the Strings using a standard for-loop
			System.out.println(list.get(i));
		}
		//4. Print all the Strings using a for-each loop
		System.out.println("All strings in array list using for-each loop:");
		for(String i : list) {
			System.out.println(i);
		}
		//for
		//5. Print only the even numbered elements in the list.
		System.out.println("All even numbers in list:");
		for(int i=0;i<4;i++) {
			if(i%2==0) {
				System.out.println(list.get(i+1));
			}
		}
		//6. Print all the Strings in reverse order.
		System.out.println("All strings in reverse order:");
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
		
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("All strings that have the letter 'e' in them:");
		for(int i=0;i<5;i++) {
			if(list.contains("e")) {
				System.out.println(list.get(i));
			}
		}
	}
}
