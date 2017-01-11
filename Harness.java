package partB;
import sequence.*;
/* Trevor Vanderee
 * 5877022
 * 2016-03-07
 * Assignment 3
 * Harness.java
 */
public class Harness {
	public Harness( ){
		ConCharacterSequence test = new ConCharacterSequence("Hello World");
		
		ConCharacterSequence test1a = new ConCharacterSequence("Hello World");
		ConCharacterSequence test1b = new ConCharacterSequence("Hello ");
		ConCharacterSequence test1c = new ConCharacterSequence("hello world");
		
		ConCharacterSequence test2a = new ConCharacterSequence("Hello ");
		ConCharacterSequence test2b = new ConCharacterSequence(" Hello World123 ");
		ConCharacterSequence test2c = new ConCharacterSequence("Hello World");
		
		ConCharacterSequence test3a = new ConCharacterSequence("Hello World");
		ConCharacterSequence test3b = new ConCharacterSequence(" Hello World123 ");
		
		ConCharacterSequence test4a = new ConCharacterSequence(" Hello World ");
		
		ConCharacterSequence test5 = new ConCharacterSequence(" Hi");
		
		ConCharacterSequence test6 = new ConCharacterSequence("Hello World");
		ConCharacterSequence test7 = new ConCharacterSequence("");
		ConCharacterSequence test8 = new ConCharacterSequence("Hello World");
		
		//Equals Method
		System.out.println("Testing equals method");
		System.out.println(test);
		System.out.println("Proposed: true Actual: " +test.equals(test1a));
		System.out.println("Proposed: false Actual: " +test.equals(test1b));
		System.out.println("Proposed: false Actual: " +test.equals(test1c));
		//compareTo
		System.out.println("\nTesting comparTo method");
		System.out.println("Proposed: positive  Actual: " +test.compareTo(test2a));
		System.out.println("Proposed: negative  Actual: " +test.compareTo(test2b));
		System.out.println("Proposed: Zero  Actual: " +test.compareTo(test2c));
		//toLowerCase
		System.out.println("\nTesting toLowerCase method");
		System.out.println("Proposed: hello world  Actual: "+test3a.toLowerCase());
		System.out.println("Proposed: hello world123  Actual: "+test3b.toLowerCase());
		//toUpperCase
		System.out.println("\nTesting toLowerCase method");
		System.out.println("Proposed: HELLO WORLD  Actual: "+test3a.toUpperCase());
		System.out.println("Proposed: HELLO WORLD123  Actual: "+test3b.toUpperCase());
		//trim
		System.out.println("\nTesting trim method");
		System.out.println("Original : Hello World :  Actual:"+test4a.trim()+":");
		//replace
		System.out.println("\nTesting replace method");
		System.out.println("Original: Hello World");
		System.out.println("replacing l with r");
		System.out.println("Ouput: "+ test6.replace('l', 'r'));
		//concat
		System.out.println("\nTesting concat method");
		System.out.println("Expected: Hello world Hi Actual: " + test.concat(test5));
		//charAt
		System.out.println("\nTesting charAt method");
		System.out.println("Expected: r  Actual: " + test.charAt(8));
		System.out.println("Expected:   Actual: " +test.charAt(14));
		//length
		System.out.println("\nTesting length method");
		System.out.println("Expected: 11  Actual: " +test.length());
		System.out.println("Expected: 0  Actual: " +test7.length());
		//subSequence
		System.out.println("\nTesting subSequence method");
		System.out.println("Expected: llo wor  Actual: "+ test8.subSequence(2, 9));		
		System.out.println("Expected: ERROR  Actual: "+ test8.subSequence(2, 12));		
		//Complete
		System.out.println("\nTesting Complete");
	}
	public static void main(String args[]){Harness h = new Harness();}
}
