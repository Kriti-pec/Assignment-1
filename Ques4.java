import java.util.Scanner;

public class Ques4{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Input first number: ");
    int num1 = s.nextInt();
    System.out.print("Input second number: ");
    int num2 = s.nextInt();
    // Swapping using temporary variable
    System.out.println("Swapping using temporary variable");
    System.out.println("num1 before swapping: " + num1);
    System.out.println("num2 before swapping: " + num2);
    int temporary = num1;
    num1 = num2;
    num2 = temporary;
    System.out.println("num1 after swapping: " + num1);
    System.out.println("num2 after swapping: " + num2);

    // Swapping without using temporary variable
    System.out.println("Swapping without using temporary variable");
    System.out.println("num1 before swapping: " + num1);
    System.out.println("num2 before swapping: " + num2);
    num1 = num2 + num1; // 15
    num2 = num1 - num2; // 5
    num1 = num1 - num2; // 10
    System.out.println("num1 after swapping: " + num1);
    System.out.println("num2 after swapping: " + num2);
  }
}
