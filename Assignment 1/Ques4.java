public record Ques4() {
    public static void main(String[] args) {
        int num1 = 78;
        int num2 = 7;
        // Swapping using temporary variable
        System.out.println("Swapping using temporary variable");
        System.out.println("num1 before swapping: "+num1);
        System.out.println("num2 before swapping: "+num2);
        int temporary = num1;
        num1 = num2;
        num2 = temporary;
        System.out.println("num1 after swapping: "+num1);
        System.out.println("num2 after swapping: "+num2);

         // Swapping without using temporary variable
         System.out.println("Swapping without using temporary variable");
         System.out.println("num1 before swapping: "+num1);
         System.out.println("num2 before swapping: "+num2);
         num1 = num2+num1; //15
         num2 = num1-num2; // 5
         num1 = num1-num2; //10
         System.out.println("num1 after swapping: "+num1);
         System.out.println("num2 after swapping: "+num2);
       }
}
