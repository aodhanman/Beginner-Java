package examples;

import java.util.Scanner;

public class Nato {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your letter: ");

		String let = sc.next().toUpperCase();
		
		String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L",
				"M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		String[] call = {"Alpha ","Bravo ","Charlie ","Delta ","Echo ","Foxtrot ","Golf ","Hotel ","India ","Juliet ","Kilo ","Lima "
				,"Mike ","November ","Oscar ","Papa ","Quebec ","Romeo ","Sierra ","Tango ","Uniform ","Victor ","Whiskey ","X-ray ","Yankee ","Zulu "};	
		
		for(int i = 0; i < letters.length;i ++){
			if(let.equals(letters[i])){
				System.out.println("Phonetic letter is: " + call[i]);
			}
		}
		
	}

}
