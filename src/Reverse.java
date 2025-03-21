
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Input= "dad";
	
		String Output="";
		int j=Input.length()-1;
		for(int i=j;i>=0;i--)
		Output=Output+Input.charAt(i);
		System.out.println(Output);
		if (Input.contentEquals(Output)) 
		{
			System.out.println("It is a Palindrome");
		}
		
		else
		{
			System.out.println("It is not a Palindrome");
	}

	}
	
	
	

}
