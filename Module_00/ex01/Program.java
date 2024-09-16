import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    //Böhm-Jacopini theorem :  sequence (straight-line code), selection (decision: if/else), and iteration (loop).
    //sequence:
    Scanner inpt = new Scanner(System.in);
    int j = 1;

    try {
      System.out.print("-> ");
      int number = inpt.nextInt();

    //selection:
      if (number <= 1)
      System.err.println("IllegalArgument");

    //iteration:
      for (int i = 2; i * i < number; i++){
        if (number % i == 0){
          System.out.println("False " + j);
          System.exit(0);
        }
        j++;
      }
    } catch (Exception e) {
      System.out.println("Please Enter a valid number"); 
    }
    System.out.println("True " + j);


  }
}

//resources for poor memory:
//https://en.wikipedia.org/wiki/Primality_test
