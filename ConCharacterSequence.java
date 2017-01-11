package sequence;

public class ConCharacterSequence implements CharacterSequence {

	private static final long serialVersionUID = 172395542556451129L;
	public char[]  achar;
	
	public ConCharacterSequence( ){
		achar = new char[0];
	}
	public ConCharacterSequence(CharSequence s){
		achar = new char[s.length()];
		for(int i = 0; i<achar.length; i++){
			achar[i] = s.charAt(i);
		}
	}
	public ConCharacterSequence(char[] a){
		achar = a;
	}
	public ConCharacterSequence(char c){
		achar = new char[1];
		achar[0] = c;
	}
	
	public boolean equals(CharSequence cs){
		boolean out = true;
		if(achar.length != cs.length()){
			out = false;
			return out;
		}else{
			for(int i =0; i<achar.length; i++){
				if (achar[i]!=cs.charAt(i)){
					out = false;
					break;
				}
			}
			return out;
		}
	}

	public int compareTo(CharSequence cs) {
		int csI = 0;
		int acI = 0;
		int out;
		for(int i =0; i<achar.length;i++){
			acI += achar[i];
		}
		for(int i =0; i<cs.length();i++){
			csI += cs.charAt(i);
		}
		out = acI- csI;
		return out;
	}

	public CharacterSequence toLowerCase() {
		char[] cc =achar ;
		for (int i =0; i< achar.length; i++){
			if(achar[i]>=65 && achar[i]<=90){
				cc[i] = (char)(achar[i]+32);
			}
		}
		ConCharacterSequence c2 = new ConCharacterSequence(cc); 
		return c2;
	}

	public CharacterSequence toUpperCase() {
		char[] cc = achar ;
		for (int i =0; i< achar.length; i++){
			if(achar[i]>=97 && achar[i]<=122){
				cc[i] = (char)(achar[i]-32);
			}
		}
		ConCharacterSequence c2 = new ConCharacterSequence(cc); 
		return c2;
	}

	public CharacterSequence trim() {
		char[] cc = new char[achar.length];
		int j = 0;
		for (int i =0; i< achar.length; i++){
			if(achar[i]==32){
					i++;
					if(i==achar.length){
						j--;
					}
			}
			if(i!=achar.length){
				cc[j] = achar[i];
			}
			j++;
		}
		char[] c3 = new char[j];
		for(int i =0; i<c3.length; i++){
			c3[i]= cc[i];
		}
		ConCharacterSequence c2 = new ConCharacterSequence(c3); 
		return c2;
	}

	public CharacterSequence replace(char oldChar, char newChar) {
		char[] cc = achar;
		for (int i =0; i< achar.length; i++){
			if(achar[i]==oldChar){
				cc[i] = newChar;
			}
		}
		ConCharacterSequence c2 = new ConCharacterSequence(cc); 
		return c2;
	}

	public CharacterSequence concat(CharSequence tail) {
		char[] c1 = new char[achar.length + tail.length()];
		for(int i = 0; i<achar.length; i++){
			c1[i]= achar[i];
		}
		for(int i = 0; i <tail.length(); i++){
			c1[i+achar.length]= tail.charAt(i);
		}
		ConCharacterSequence c2 = new ConCharacterSequence(c1); 
		return c2;
	}

	public char charAt(int index)throws IndexOutOfBoundsException {
		try{
			return achar[index];
		}catch(IndexOutOfBoundsException e){
			return ' ';
		}
	}

	public int length() {
		return achar.length;
	}

	public CharacterSequence subSequence(int start, int end) {
		char[] c1 = new char[end-start];
		ConCharacterSequence c = new ConCharacterSequence("ERROR: INVALID NUMBERS");
		
		if (start>end||start>achar.length||end>achar.length){
			return c;
		}
		for (int i = start; i<end; i ++){
			c1[i-start]=achar[i];
		}
		ConCharacterSequence c2 = new ConCharacterSequence(c1); 
		return c2;
	}
	public String toString(){
		String out = "";
		for(int i =0; i< achar.length; i++){
			out += achar[i];
		}
		return out;
	}
}