import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
// Variable assignment : User inputs two numbers. One number is assigned to a variable, the other number is assigned to another variable.
		//The task is to invert the variables, so that the first variable contains the second number, while the first number
		//is in the second variable.
	int a = 50;
	int b = 90;
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println(a);
	System.out.println(b);

	// When User enters a number, its factorial is displayed.
int c = 6;
int result = 1;
if(c <= 0) {
	System.out.println("Are you sure you want to calculate gamma-functions?");
	
}
for(int i = 1; i <= c; i ++) {
	result*= i;
	System.out.println(result);
}

//Our code generates a random three-digit number and has to sum up all its digits. For example, if a number is 349,
//the code has to print the number 16, because 3 + 4 + 9 = 16.
int d = 123;
int sum = 0;
int num = d %10;
int tens = d / 10 % 10;
int hundrs = d / 100;
sum = num + tens + hundrs;
System.out.println(sum);

/* # When a user enters a year, the code detects if it is a leap year or not.

# Leap years have the following characteristics:
# Their number is multiple by 400 or their number is multiple by 4.
# If the year number id multiple by 100, it is not a leap year.*/


int year = 2019;

if( year % 4 != 0) {
	System.out.println("It is not a leap year");
	
}
else{
	 if (year % 100 == 0) {
		 	if(year % 400 == 0) {
		 		System.out.println("It is a leap year");
		 	}
		 	else { System.out.println("It is not a leap year");}}
	 else {
		 System.out.println("Leap year");
	 }
	
}
// Find the maximal sequence of consecutive zeros that surrounded by ones
//at both ends in the binary representation of a number entered by User.
int number = 1889;
System.out.println(Integer.toBinaryString(number));
int [] binary = new int [1000];
int i = 0;
String resultbin = "";
int max_gap = 0;
int counter = 0;
while( number > 0) {
	binary[i]=number%2;
	number = number/2;
	i++;
	
}
for(int j= i -1; j >= 0; j --) {

	if(binary[j] == 1){
		if ( max_gap < counter) {
			max_gap = counter; 
			counter = 0;}
		
		
	}
	else {counter += 1;}
	
	
	resultbin += binary[j];
	
}
System.out.println(resultbin);
System.out.println(max_gap);




	}

}
