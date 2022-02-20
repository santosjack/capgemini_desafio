package questions.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagrama {
	
	public static int calcFactorial (int num) {
		int fact = num;  
		  for (int i = 1; i < num; i++){
		    fact = fact * (num - i);
		  }
		  return fact; 
	}


	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Informe uma palavra: ");	
		String word = inp.next();
		word = word.toLowerCase();
		Boolean isAnagrama = false;
		List<Integer> repChar = new ArrayList<Integer>();
		repChar.add(word.length());
		
		for(char i = 'a'; i <= 'z'; i++) {
			int count = 0;
			for(int j = 0; j < word.length(); j++) {
				if(word.charAt(j) == i) {
					count++;
				}
				
			}
			if(count > 1) {
				repChar.add(count);
			}
			
		}
		
		for(int i = 0; i < repChar.size(); i++) {
			repChar.set(i, calcFactorial(repChar.get(i)));
		}
		
		int product = 1;
		for(int j = 0; j < repChar.size();j++) {
			if(j > 0) {
				product *= repChar.get(j);
			}
		}
		
		
		System.out.println(repChar.get(0)/product);
		
		
 	}

}
