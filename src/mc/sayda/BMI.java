package mc.sayda;

import java.util.Scanner;

public class BMI { 
	
	//Here is where the different Strings for what is printed into the console are stored, as they never change they do not need to be inside of the run argument
	
	static String selectText = "Is Height type Meters? true / false"; 
	
	static String lengthText = "Type your Height: "; 
	
	static String weightText = "Type your Weight: "; 
	
	static String continueText = "\nContinue? (y/n)"; 
	

  public static void main (String [] args ) { 
	  
	  Scanner scanner = new Scanner(System.in);
	  
	  String choice = "y";
	  
	  while(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
		  
		  //This is the Boolean statement for what kind of measurement type you want to enter
		  
		  System.out.println(selectText);
		  boolean select = scanner.nextBoolean();
		  
		  //This is where you define the Height (or Length) of the person who's BMI we are calculating 

		  System.out.println(lengthText);  
		  double length = scanner.nextDouble();
		  
		  //This is where you define the Weight of the person who's BMI we are calculating 
		  
		  System.out.println(weightText);  
		  double weight = scanner.nextDouble();
		  
		  //This is the if statement that changes the type of number that is inputed depending on what kind of measurement type we selected
		  
		  if (select == false) {
			  length = length / 100;
		  } 
		  
		  //This is where the BMI is calculated: (weight / length * length = BMI)
		  
		  double result = weight / (length * length);
		  
		  //This is where the result of the BMI calculation is printed into the console
		  
		  if (result < 18.5) {
			  
			  System.out.printf("You're underweight");
			  
		  } else if (result <= 24.9) {
			  
			  System.out.printf("You're idealweight");
			  
		  } else if (result < 29.9) {
			  
			  System.out.printf("You're overweight");
			  
		  } else {
			  
			  System.out.printf("You're over the recommended weight");
			  
		  }

		  System.out.printf("\nYour BMI is: %.2f\n", result);
		  
		  System.out.println(continueText);  
		  choice = scanner.next();
		
	  	  }
	 }
}
		  
	  
	  
