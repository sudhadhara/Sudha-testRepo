import java.util.ArrayList;
import java.util.Arrays;

import com.itextpdf.text.List;

public class CoreJavaForTA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] testAbc = {5,4,3,2,6};
		System.out.print(testAbc[0]);

		for(int i=1; i<testAbc.length; i++) {
			System.out.print(", "+testAbc[i]);
		}
		
		
		
		//string is an object
		String str = "I am test automation";
		//split string to array
		String[] arrStr = str.split("am");
		//System.out.println(arrStr[0]);
		//System.out.println(arrStr[1]);
		
		
				String testStr = "auto";
				//System.out.println(testStr);

		for(int i=0; i<testStr.length(); i++) {
			//System.out.print(testStr.charAt(i) + " ");
		}

		
		
	}

}
