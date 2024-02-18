import java.math.BigInteger;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("\n\n\nWhat is the base of your exponent? \n (aka what is the X in equation X^Y)");
    try {
      BigInteger b = new BigInteger(s.nextLine());
      System.out.println("What is the exponent in your... exponent? \n(aka what is Y in equation X^Y)");
      b = b.pow(s.nextInt());
      System.out.println("The number is: " + b.toString());
      int result = 0;
      for (char i : b.toString().toCharArray()) {
        result += Integer.parseInt(String.valueOf(i));
      }
      System.out.println("\nAll the digits in that number add up to make: " + result);
    } catch (Exception e) {
      System.out.println("Something went wrong. Please restart and try again (and make sure you are using valid \nnumbers).");
    }
  }
}
