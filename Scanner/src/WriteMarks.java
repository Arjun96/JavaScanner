import java.io.*;
import java.util.*;

public class WriteMarks {
  
  public static void main(String [] args) throws Exception{
    
    Scanner scan = new Scanner(System.in);
    PrintWriter writer = new PrintWriter("marks.txt");
    
    int mark = 0;
    double average = 0;
    int mark_count = 0;

    System.out.print("Please enter a mark for a student out of 100. "
                    + "Enter -99 to quit");
    mark = scan.nextInt();
    
    while (mark != -99){
      writer.println("Mark for Student " + (mark_count+1) + ": " + mark + "%");
      average += mark;
      mark_count++;
      System.out.print("Please enter a mark for the next student out of 100: "
                      + "Enter -99 to quit");
      mark = scan.nextInt();
    }
    scan.close();
    System.out.println("Thank you");
    average = average/mark_count;
    writer.println("\nClass Average: " + average + "%");
    writer.close();
    
  }
  
}
