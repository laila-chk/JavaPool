import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner inpt = new Scanner(System.in);
    int count = 0;
    int number;
    int sumOfDigits = 0;

    System.out.print("-> ");
    while (true) {
      try {
        number = inpt.nextInt();

        //===============================

        String num = Integer.toString(number);
        for(int i = num.length() - 1; i >= 0; i--){
          sumOfDigits += Character.getNumericValue(num.charAt(i)); 
        }
        //=================================

        if (sumOfDigits == 2)
          count++;
        for (int i = 2; i * i < sumOfDigits; i++){
          if (sumOfDigits % i == 0){
            count++;
            break;
          }
        }

        if (number == 42)
        break;
      } catch (Exception e) {
        System.out.println("Please Enter numbers Only!");
        break;
      }

    }
    System.out.println("Count of coffee-request : " + count);
  }
}
