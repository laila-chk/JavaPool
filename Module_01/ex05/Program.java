import java.util.Scanner;

//"Absolute correctness of data is guaranteed" - The subject
public class Program {
  public static void main(String[] args) {
    Scanner ipt = new Scanner(System.in);
    String[][] data = new String[3][10];
    String input;

    for (int i = 0; i < 3; i++){
      for (int j = 0; j <= 10; j++){
        input = ipt.nextLine();
        if (input.equals(".")){
          j = 0;
          break;
        }else {
          data[i][j] = input;
        }
      }
    }

  }
}
