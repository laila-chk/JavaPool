import java.util.Scanner;

//---This exercise guarantees that input data is absolutely correct.---

public class Program {
  public static void main(String[] args) {
    Scanner inpt = new Scanner(System.in);
    int count = 0;
    int number;
    int sumOfDigits = 0;

    while (true) {
      sumOfDigits = 0;
      System.out.print("-> ");
      number = inpt.nextInt();
      if (number == 42)
      break;

      while (number != 0){
        sumOfDigits += number % 10;
        number /= 10;
      }

      if (sumOfDigits == 2)
      count++;
      for (int i = 2, x = 0; i * i < sumOfDigits; i++){
        if (sumOfDigits % i == 0){
          if (x == 1)
          count--;
          break;
        }
        if (x == 0){
          x++;
          count++;
        }
      }

    }
    System.out.println("Count of coffee-request : " + count);
  }
}
