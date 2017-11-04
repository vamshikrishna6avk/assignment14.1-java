/*here by implementing runnable interface and using thread class we are checking whether given number is prime or not*/

package threaddemo; //created package name threaddemo

import java.util.Scanner;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly using its name
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions
class Prime implements Runnable{  //created the class Prime which implements runnable interface
	
	public void run(){     //here created run method which will be executed when the thread is called 
		//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		 
		System.out.println("enter any number");  //here enter any number
		
	    Scanner sc =new Scanner(System.in);//scanning
	    
	     int number = sc.nextInt();//initializing number
	     
		    boolean isPrime = true;   //here we are using a boolean variable isPrime if it is true then 
		     
		 for(int orderNumber = 2; orderNumber < number/2; orderNumber++){ //here using for loop checking whether the given no. prime or not prime number is a factor of one and itself 
			                                                              //if a number is divided by 2 gives the reminder zero it is not a prime
			 if(number % orderNumber == 0){ //if the number which is divided by any number and the reminder is equals to zero  
				 
				 isPrime = false; //then it prints the isPrime as false
				 break; //here it breaks the the condition
			 }
		 }
		 if (isPrime){ //now it checks the the condition by using if else and prints the statements
			 
			 System.out.println(number + " is a prime number");	//prints	 
			 }
   		 
		 else{
			 System.out.println(number + " not a prime number");//prints
		 }
		 }
	}	

 public class ThreadClass{  //here created class ThreadClass

	public static void main(String[] args) { 
		
		 Prime prime  = new Prime();   //creating an object here 
	  
	      Thread t = new Thread(prime); //created thread which starts the runnable run method
	
	         t.start();//here it executes by using start method
	 
	}
 }
