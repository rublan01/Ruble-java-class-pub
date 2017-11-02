package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rublan01
 *
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    task1(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
//    task7();
//    System.out.println(task8(numberLst, 75));
//    task9();
//    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function nHeads() that takes a number (n) 
   * as a parameter and prints the result of coin flips ("Heads" or "Tails" with
   * equal probability) until there are n "Heads" in a row. 
   * Seed the randomizer in the main() function.
   * @param n
   */
  public static void task1(int n) {
      System.out.println("---Task 1---");
      Random num = new Random();
      int headsCount = 0;
      int flipcount = 0;
      int flip;
      while (headsCount < n) {
          flip = num.nextInt(3);
          if (flip%2==0) {
              headsCount++;
              flipcount++;
              System.out.print("H");
          } else {
              headsCount = 0;
              flipcount++;
              System.out.print("T");
          }
      } System.out.println();
      System.out.println("Number of flips: " +flipcount);       
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as 
   * parameters and returns boolean True if the number provided is larger than every 
   * element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
      System.out.println("---Task 2---");
      boolean ans = false;
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] < n) {
              ans = true;
          }
          else {
              ans = false;
          }
      }
      return ans;
  }
  
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold 
   * and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
      System.out.println("---Task 3---");
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] < threshold) {
              count++;
          }
          else {
              count = count;
          }
      } return count;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, 
   * finds the difference between 100 and the largest element of the array and
   * adds this difference to every element in the array. 
   * (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
      System.out.println("---Task 4---");
      int max = 0;
      int difference = 0;
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] > max) {
              max = arr[i];
          } else {
              max = max;
          }
      } difference = 100 - max;
      for (int i = 0; i < arr.length; i++) {
          arr[i] = arr[i] + difference;
          if (arr[i] > max) {
              max = arr[i];
          } else {
              max = max;
          }
      } System.out.print(max);
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter
   * and, assuming the values are scores, prints number of students with 'A', 'B',
   *'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
      System.out.println("---Task 5---");
      int countA = 0;
      int countB = 0;
      int countC = 0;
      int countD = 0;
      int countF = 0;
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] < 59) {
              countF++;
          } else if (arr[i] < 69) {
              countD++;
          } else if (arr[i] < 79) {
              countC++;
          } else if (arr[i] < 90) {
              countB++;
          } else {
              countA++;
          }
      } System.out.println("Number of As: " + countA);
      System.out.println("Number of Bs: " + countB);
      System.out.println("Number of Cs: " + countC);
      System.out.println("Number of Ds: " + countD);
      System.out.println("Number of Fs: " + countF);
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start 
   * entering numbers. 
   * Keep asking and adding numbers to the ArrayList until the user enters 0, 
   * then stop and print all the values in the ArrayList. Use function add() 
   * to add a number to an ArrayList.
   */
  public static void task6() {
      System.out.println("---Task 6---");
      ArrayList<Double> arr = new ArrayList();
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your number twice to start or 0 to quit: ");
      double addnew = input.nextDouble();
      while (addnew != 0) {
          addnew = input.nextDouble();
          arr.add(addnew);
          System.out.println("Enter another number to add or 0 to quit: ");
      } System.out.println(arr);
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize 
   * each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
    throw new UnsupportedOperationException("Task 7 is not implemented yet.");
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    throw new UnsupportedOperationException("Task 8 is not implemented yet.");
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    throw new UnsupportedOperationException("Task 9 is not implemented yet.");
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
    throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }

}
