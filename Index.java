import java.util.Scanner;

public class Index {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Welcome to the Body Mass Index Calculator.\n Please enter your Height in cm : ");
	double height = scanner.nextDouble();
	
	System.out.println("Please enter your weight in kg : ");
	double weight = scanner.nextDouble();
	
	double bmi = weight / ((height*height)/10000);
	
	System.out.println(bmi);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
