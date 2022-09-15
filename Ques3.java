import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Input first number: ");
      int num1 = s.nextInt();
      System.out.print("Input second number: ");
      int num2 = s.nextInt();  
      int quotient = num1/num2;
      int remainder = num1%num2;
      System.out.println("Quotient of num1 divided by num2:"+quotient);
      System.out.println("Remainder of num1 divided by num2:"+remainder);
     }
}
