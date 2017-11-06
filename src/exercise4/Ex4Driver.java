package exercise4;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author rublan01
 */
public class Ex4Driver {
    public static void main(String[] args) {
        task1(3);
        task2("Dog");
        task3('c');
        task4("Animal");
        task5(1, 2);
        task6("Word", 3);
        Random rnd = new Random();
        rnd.setSeed(252);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = rnd.nextInt(100);
        }
        task7(arr);
    }
  /*
  Define a function that takes 1 integer as a parameter and returns an integer. 
    Write 2 unit tests to verify the function validity.
        public Integer task2(String);
 */
    public static int task1(int n) {
        return n + 5;
    }

 /*   
Define a function that takes 1 string as a parameter and returns an integer. 
    Write 2 unit tests to verify the function validity.
public Integer task2(String);
    */
    public static int task2(String countL) {
        int count = countL.length();
        return count;
    }
    /*
Define a function that takes 1 character as a parameter and returns an integer. 
    Write 2 unit tests to verify the function validity.
public Integer task3(Character);
    */
    public static int task3(Character c) {
        int num = 0;
        num = c + 1;
        return num;
    }
    /*
Define a function that takes 1 string as a parameter and returns a character. 
    Write 2 unit tests to verify the function validity.
public Character task4(String);
    */
    public static char task4(String word) {
        char ch = ' ';
        word.charAt(0);
        return ch;
    }
    /*
Define a function that takes 2 integers as a parameter and returns an integer. 
    Write 2 unit tests to verify the function validity.
public Integer task5(Integer, Integer);
    */
    public static int task5(int x, int y) {
        int sum = x + y;
        return sum;
    }
    /*
Define a function that takes a string and an integer as parameters and returns a Character. 
    Write 2 unit tests to verify the function validity.
public Character task6(String, Integer);
    */
    public static char task6(String word, int num) {
        char ch = ' ';
        num++;
        ch = word.charAt(0);
        return ch;
    }
    /*
Define a function that takes an array of integers as a parameter and returns an integer. 
    Write 2 unit tests to verify the function validity.
public Integer task7(Integer[]);
    */
    public static int task7(int[] arr) {
        int first = 0;
        first = arr[0];
        return first;
    }
    /*
Define a function that takes an array of integers and an integer as parameters and 
    returns a boolean. Write 2 unit tests to verify the function validity.
public Boolean task8(Integer[], Integer);
    */
    public static boolean task8(int[] arr, int n) {
        int first = 0;
        int plus;
        first = arr[0];
        plus = first + n;
        return plus;
    }
    /*
Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task9(ArrayList<String>);
Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
public Integer task10(HashMap<>);
  */
}
