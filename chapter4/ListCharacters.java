package chapter4;

public class ListCharacters {
	public static void main(String[] args) {
		for(char c=0;c<128;c++)if(Character.isLowerCase(c))
			//c=0,mean the ASCII'value of char c is 0;
			System.out.println("value:"+(int)c+"  character:"+c);
			//char c toString printout a char£¬not the ASCII's value
		
	}

}
