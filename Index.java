import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Body Mass Index Calculator.\nPlease enter your Height in cm : ");
        double height = scanner.nextDouble();

        System.out.println("Please enter your weight in kg : ");
        double weight = scanner.nextDouble();

        double bmi = weight / ((height * height) / 10000);

        if (bmi < 18.5) {
            System.out.println("You are skinny.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Your weight is normal.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("You are obese.");
        } else {
            System.out.println("You are extremely obese.");
        }
    }
}

	
	
	
	
	
	
	
	
	
	
	
	
}
}
