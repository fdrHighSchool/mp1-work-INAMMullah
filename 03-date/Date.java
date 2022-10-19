import java.util.Scanner;

/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
   
 public static void main(String[]args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter the month");
    String month = s.nextLine();
    
    System.out.println("Enter the year");
    String year = s.nextLine();
    
    System.out.println("Enter the date");
    String date = s.nextLine();
    
    System.out.println("Enter the day");
    String day = s.nextLine();
    
    System.out.println("American formate :"+day+", "+ month +" " + date +", "+ year);
    System.out.println("European formate :"+day+" " +date +" " +month+ " "+ year);
    
    }
}