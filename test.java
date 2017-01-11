package sequence;

public class test {
	public test( ){
		ConCharacterSequence c = new ConCharacterSequence(" Hello World ");
		System.out.println(c.length());
		c = (ConCharacterSequence)c.trim();
		System.out.println(c);
		System.out.println(c.length());
		
	}
	public static void main(String args[]){test t= new test();}
}
