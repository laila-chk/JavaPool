
public class Program {

  public static void main(String[] args) {
    int number = 479598;
    String num = Integer.toString(number);
    int sum = 0;
    for(int i = num.length() - 1; i >= 0; i--){
      sum += Character.getNumericValue(num.charAt(i)); 
    }
    System.out.println(sum);
  }
}
