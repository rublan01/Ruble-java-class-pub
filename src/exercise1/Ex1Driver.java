package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * @author rublan01
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
//    task8(numbers);
//    task9();
//    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
      System.out.println("---Task 1---");
      System.out.println("Hello World");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    System.out.println("---Task 2---");
    for (int i = 1; i<= 100; i++) {
        if (i%3==0){
            System.out.println("foo");
        } else if (i%5==0) {
            System.out.println("bar");
        } else if (i%3==0 && i%5==0) {
            System.out.print("huh");
        } else {
            System.out.println(i);
        }
    }
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
      System.out.println("---Task 3---");
      int total = 0;
      for (int i=1; i<=100; i++) {
          if (i%7==0) {
              total += i;
          }
      }
      System.out.println("The sum of all multiples of 7 between 1 and 100 is " +total);
      
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
      System.out.println("---Task 4---");
      int totalSum = 0;
      for (int i=1; i <= 20; i++) {
            totalSum += i;
        } System.out.println("The sum of all numbers between 1 and 20 is " +totalSum);
      int totalProd = 1;
      for (int j=1; j <= 20; j++) {
          totalProd *= j;
        } System.out.println("The product of all numbers between 1 and 20 is " +totalProd);
      }
      
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
      System.out.println("---Task 5---");
      String name = new String();
      StringBuilder initials = new StringBuilder();
      System.out.print("Enter your name: ");
      Scanner input = new Scanner(System.in);
      name  = input.nextLine();
      boolean addNext = true;
      if (name != null) {
          for (int i=0; i < name.length(); i++) {
              char c = name.charAt(i);
              if (c == ' ') {
                  addNext = true;
              } else if (addNext) {
                  initials.append(c);
                  addNext = false;
              }
          }
      System.out.println("Your initials are " +initials);
      }
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
      System.out.println("---Task 6---");
      int[] cubed;
      cubed = new int[10];
      for(int i = 0; i < cubed.length; i++) {
          cubed[i] = (i * i * i);
          System.out.print(cubed[i] +" ");
      }
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask
   * the user for an integer and tell if that number is in the array
   */
  public static void task7() {
      System.out.println();
      System.out.println("---Task 7---");
      Random rnd = new Random();
      rnd.setSeed(252);
      int searchInt;
      int[] randArray = new int[100];
      for (int i = 0; i < randArray.length; i++) {
          randArray[i] = rnd.nextInt(100);
      } System.out.println("Enter an integer: ");
      Scanner input = new Scanner(System.in);
      searchInt = input.nextInt();
      String answer = "checking";
      for (int i = 0; i < randArray.length; i++) {
          if (i == searchInt) {
              answer = "Number was found";
          } else {
              answer = "Number was not found";
          }
      } System.out.println(answer);
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    throw new UnsupportedOperationException("Task 8 is not implemented yet.");
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    throw new UnsupportedOperationException("Task 9 is not implemented yet.");
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }

}
