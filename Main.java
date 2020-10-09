import java.util.Scanner;
/**
 * computes the dot product of 2 3d vectors
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //creates array for user to enter first 3 values
    int firstVector[] = new int[3];

    //gets first vector from user
    System.out.println("Please enter the 3 values for the first vector");
    for(int i = 0; i < firstVector.length; i++){
      firstVector[i] = input.nextInt();
    }
    
    //creates array for last 3 values
    int secondVector[] = new int[3];

    //gets secondvector from user
    System.out.println("Please enter the 3 values for the second vector");
    for(int i = 0; i < secondVector.length; i++){
      secondVector[i] = input.nextInt();
    }

    //creates variable to store dot product
    int dot = 0;

    //calculates dot product
    for(int i = 0; i < secondVector.length; i++){
      dot = dot + firstVector[i] * secondVector[i];
    }
    
    //displays dot product to user
    System.out.println("The dot product is " + dot);
  }
}
