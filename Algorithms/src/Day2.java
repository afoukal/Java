
public class Day2 {

	public static void main(String[] args) {
		
//Calculate areas of some figures
		//	Circle : input radius, get area
		double radius = 15;
		double area;
		area = Math.PI * radius * radius;
		
		//Rectangle: input height and width, get area
		int heigth = 12;
		int width = 14;
		int recArea;
		recArea = heigth * width;
		
		//Square: input width, get area
		int sqwidth = 5;
		int sqArea;
		sqArea = sqwidth *sqwidth;
		
//Write a Python program to multiply two integers without using the * operator in python
		int num = 7;
		int num2 = 3;
		int iterator = 0;
		int result = 0;
		while (iterator < num) {
			result += num2;
			iterator +=1;
		}
		System.out.println(result);
		
//Write a Python program to convert seconds to day, hour, minutes and seconds.
		int sec = 125200;
		int hours;
		int minutes;
		int seconds;
		hours = sec / 3600;
		System.out.println(hours);
		minutes = ( sec - hours*3600)/60;
		System.out.println(minutes);
		seconds = sec - hours*3600 - minutes*60;
		System.out.println(hours + " : " + minutes + " :" +seconds);
//# The equation for the Fibonacci sequence:

//The task is to display all the numbers from start to n of the Fibonacci sequence 
		int fibnum = 10;
		int t1 = 0;
		int t2 = 1;
	
		System.out.println("First " + fibnum + " terms:");
		for( int i = 0; i < fibnum; i ++) {
			System.out.println(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			
		}
// # You have a dictionary of cities. Create dictionary of distances

//from pprint import pprint

//cities = {
   // 'Los Angeles': (550, 370),
    //'Chicago': (510, 510),
    //'Dallas': (480, 480)
//}*/	// ????	
		
	}

}
