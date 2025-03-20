import java.util.ArrayList;
import java.util.Arrays;

import com.itextpdf.text.List;

public class CoreJavaForTA3 {
	
	//Class 	  >> Object 			 >> Method
	//Luxury Cars >> BMW, Audi, Mercedes >> accelarate, break, speed up, speed down, sun roof

	//Relevance of Static where methods belongs to class and not object, therefore no object instantiation required
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoreJavaForTA3 obj = new CoreJavaForTA3();
		//bmw.brakes
		//bmw.accelrate
		//obj.getDataString();

		
		
		String str = obj.getDataString();
		//System.out.println(str);
		
		callableClass obj1 = new callableClass();
		System.out.println(obj1.getStringData());

		
	}
	
	//METHODS
	//TASK -> public, private, protected default
	public void getDataVoid() {
		//method definition
		//System.out.println("void");
		//System.out.println("test");

		//1 to 100 lines of code
	}
	public void sunRoof() {
		//1. Click on the button
		//2. Set the speed
		//3. Wait for the roof to open
	}
	public String getDataString() {
		return "return string";
	}

}
