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
//                 System.out.println("Result: " + (n1 / n2));
//             }
//         } else {
//             System.out.println("Invalid choice!");
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;
public class Vote{
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        age =sc.nextInt();  
        if (age >= 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("Wait " + (18 - age) + " more years");
        }
        sc.close();
    }
}


