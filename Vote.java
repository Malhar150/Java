// public class HelloWorld {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }
    
// class Sample {
//     public static void main(String[] args) {
//         System.out.println("This is a sample class.");
//     }
// }

// public class Variables{
//     public static void main(String[] args){
//         String name = "Malhar";
//         int age = 20;
//         double height = 5.9;
//         char grade ='A';
//         boolean isStudent = true;
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Height: " + height);
//         System.out.println("Grade: " + grade);
//         System.out.println("Student? " + isStudent);

//         age = 21;
//         System.out.println("Next year I'll be " + age);
//     }
// }

// import java.util.Scanner;
// public class Input{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();
//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();
//         System.out.println("Hello, " + name + "! You are " + age + " years old.");
//         scanner.close();
//     }
// }

// import java.util.Scanner;
// public class Grade{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your marks: ");
//         int marks = sc.nextInt();
//         if (marks < 0 || marks > 100) {
//             System.out.println("Invalid marks!");
//         } else if (marks >= 90) {
//             System.out.println("Grade: A");
//         } else if (marks >= 75) {
//             System.out.println("Grade: B");
//         } else if (marks >= 50) {
//             System.out.println("Grade: C");
//         } else {
//             System.out.println("Grade: F - Failed");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Calculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n1, n2, choice;
//         System.out.print("Enter first number: ");
//         n1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         n2 = sc.nextInt();
//         System.out.println("1. Add");
//         System.out.println("2. Subtract");
//         System.out.println("3. Multiply");
//         System.out.println("4. Divide");
//         System.out.print("Enter your choice: ");
//         choice = sc.nextInt();
//         if (choice == 1) {
//             System.out.println("Result: " + (n1 + n2));
//         } else if (choice == 2) {
//             System.out.println("Result: " + (n1 - n2));
//         } else if (choice == 3) {
//             System.out.println("Result: " + (n1 * n2));
//         } else if (choice == 4) {
//             if (n2 == 0) {
//                 System.out.println("Error: Cannot divide by zero!");
//             } else {
//                 System.out.println("Result: " + ((double) n1 / n2));
//             }
//         } else {
//             System.out.println("Invalid choice!");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Vote{
//     public static void main(String[] args){
//         int age;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age:");
//         age =sc.nextInt();  
//         if (age >= 18) {
//             System.out.println("Can vote");
//         } else {
//             System.out.println("Wait " + (18 - age) + " more years");
//         }
//         sc.close();
//     }
// }

// public class Count{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }
//     }
// }

// public class Table{
//     public static void main(String[] args){
//         int sum = 0;
//         for(int i=1;i<=10;i++){
//             System.out.println("4 x " + i + " = " + (4 * i));
//             sum = sum + (4 * i);
//         }
//         System.out.println("Total:"+ sum);
//     }
// }

// import java.util.Scanner;
// public class ATM{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int pin = 1234;
//         int entered = 0;
//         for(int i = 0;i<=2;i++){
//             System.out.print("Enter your PIN: ");
//             entered = sc.nextInt();
//             if (entered == pin) {
//                 System.out.println("PIN accepted.");
//                 break;
//             }
//             System.out.println("Incorrect PIN.");
//         }
//         if (entered != pin) {           
//             System.out.println("Card blocked!");
//         }
//         sc.close();
//     }
// }

// public class Array{
//     public static void main(String[] args) {
//         int[] marks = {80, 75, 92, 60, 88};

//         int sum = 0;
//         for (int i = 0; i < marks.length; i++) {
//             System.out.println("Student " + (i + 1) + ": " + marks[i]);
//             sum = sum + marks[i];
//         }

//         System.out.println("Total: " + sum);
//         System.out.println("Average: " + ((double) sum / marks.length));
//     }
// }

// import java.util.Scanner;
// public class Main {
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];  
//         System.out.println("Enter 5 numbers:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         System.out.println("Enter 5 numbers:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         int max = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("Sum = " + sum);
//         System.out.println("Largest = " + max);
//         System.out.println("Average = " + ((double) sum / arr.length));
//         sc.close();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int[] original = {10, 20, 30, 40};
//         System.out.print("Original: ");
//         for (int i = 0; i < original.length; i++) {
//             System.out.print(original[i] + " ");
//         }
//         System.out.println();  // move to next line
//         int[] reversed = new int[original.length];
//         for (int i = 0; i < original.length; i++) {
//             reversed[i] = original[original.length - 1 - i];
//         }
//         System.out.print("Reversed: ");
//         for (int i = 0; i < reversed.length; i++) {
//             System.out.print(reversed[i] + " ");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {12, 45, 7, 30, 22};
//         int min = arr[0];                   // assume first is smallest
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];               // found a smaller one
//             }
//         }
//         System.out.println("Smallest = " + min);
//     }
// }

// public class Count{
//     public static void main(String[] args){
//         int[] marks = {20,40,60,80,100};
//         int passed = 0;
//         for(int m: marks){
//             if(m>=50){
//                 passed++;
//             }
//         }
//         System.out.println("Passed: " + passed);
//     }
// }

// public class Search{
//     public static void main(String[] args) {
//         int[] marks = { 20,60,30,70,92};
//         int target = 92;
//         int foundAt = -1;              // -1 means "not found" (no real index is -1)
//         for (int i = 0; i < marks.length; i++) {
//             if (marks[i] == target) {
//                 foundAt = i;
//                 break;                 // found it, so stop looking
//             }
//         }
//         if (foundAt == -1) {
//             System.out.println("Not found");
//         } else {
//             System.out.println("Found at index " + foundAt);
//         }
//     }
// }



    




