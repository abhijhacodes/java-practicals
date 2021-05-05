// Body Mass Index Calculator
import java.util.Scanner;

public class BMI{
    public static void main(String[] args) {
        Scanner hw = new Scanner(System.in);

        System.out.print("\nEnter your weight(in pounds): ");
        float weight = hw.nextFloat();
        System.out.print("\nEnter your height(in inches): ");
        float height = hw.nextFloat();

        // converting in standard form to be used in formula
        float weight_kg = weight*(0.45359237f); 
        float height_mtr = height*(0.0254f);

        float bmi = weight_kg/((height_mtr)*(height_mtr)); // bmi formula
        
        System.out.println("\nYour BMI (Body Mass Index) count is: " + bmi);
        
        // conditional statements to show range of bmi (health)
        if (bmi < 18.5) {
            System.out.println("\nYou are underweight");
        }
        else if (bmi > 18.5 && bmi < 25.0) {
            System.out.println("\nYou are healthy");
        }
        else{
            System.out.println("\nYou are overweight");
        }
    }
}
