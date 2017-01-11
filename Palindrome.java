package partC;
import BasicIO.*;
import sequence.*;

/*
 * Author: Trevor Vanderee
 * 5877022
 * 2016-03-07
 * Assignment 3
 * Palindrome.java
 */
public class Palindrome {
	private ASCIIDataFile in;
	private ASCIIDisplayer display;
	public Palindrome( ){
		boolean pal;
		in = new ASCIIDataFile();
		display = new ASCIIDisplayer();
		String line;
		while(!in.isEOF()){
			line = in.readString();
			ConCharacterSequence c =new ConCharacterSequence(line);
			c=(ConCharacterSequence)c.trim();
			c=(ConCharacterSequence)c.toLowerCase();
			if(c.compareTo("")>32){
				pal = isPalindrome(c);
				if(pal){
					display.writeString(line + " is a palindrome");
				}else{
					display.writeString(line + " is not a palindrome");
				}
				display.newLine();
			}
		}
		in.close();
		display.close();
	}
	
	private boolean isPalindrome(ConCharacterSequence line){
		boolean pal;
		char[] ch = new char[line.length()];
		for(int i =0; i<line.length(); i++){
			ch[line.length()-1-i]=line.charAt(i);
		}
		ConCharacterSequence flip =new ConCharacterSequence(ch);
		pal = line.equals(flip);
		return pal;
		
	}
	public static void main(String args[]){Palindrome p = new Palindrome();	}
}
