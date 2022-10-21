import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        System.out.print("How many did you lanternfly did you squash over the sumer ");
        int number = input.nextInt();
        
        if (number < 8) {
            System.out.println("Try to do more,You got this!");
        } // end of if statement
        else {
            System.out.println("Highest record well done!");
        } // end of else statement
        
    } // end of main method

} // end of class