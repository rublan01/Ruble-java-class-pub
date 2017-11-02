package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author rublan01
 */
public class Ex3Driver {
  public static final String PATH = "data/";
  /**
   * main application function
   * @param args 
   */
  public static void main(String[] args) {
    int[][] matrix1 = null;
    int[][] matrix2 = null;
    int[][] result = null;
    try {
      matrix1 = readFile(PATH + "matrix1.txt");
      matrix2 = readFile(PATH + "matrix2.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
    System.out.println("Matrix 1");
    printMatrix(matrix1);
    System.out.println("Matrix 2");
    printMatrix(matrix2);
    if (matrix1[0].length == matrix2.length) {
      result = multiply(matrix1, matrix2);
    } else {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, "{0}", "Impossible to multiply matrices");
      System.exit(0);
    }
    System.out.println("Result");
    printMatrix(result);
    try {
      writeMatrix(result, PATH + "result.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
  }
  /**
   * Print a matrix
   * @param matrix to print
   */
  public static void printMatrix(int[][] matrix) {
    for (int[] row: matrix) {
      for (int item: row) {
        System.out.printf("%5d", item);
      }
      System.out.printf("%n");
    }
  }
  /**
   * Write a matrix to the file
   * @param matrix 
   * @param filename 
   * @throws java.io.FileNotFoundException 
   */
  public static void writeMatrix(int[][] matrix, String filename) throws FileNotFoundException {
      PrintWriter writer;
      writer = new PrintWriter(filename);
      for (int x=0; x<matrix.length; x++) {
          for (int y=0; y<matrix.length; y++) {
              writer.print(matrix[x][y] + ' ');
          } writer.println();
    }
  }
  /**
   * Read a matrix from a file
   * @param filename
   * @return matrix read from a file
   * @throws java.io.FileNotFoundException
   */
  public static int[][] readFile(String filename) throws FileNotFoundException {
      int[][] matrix;
      File inFile = new File(filename);
      Scanner in = new Scanner(inFile);
      
      int intLength = 0;
      String[] length = in.nextLine().trim().split("//s+");
      for (int i = 0; i < length.length; i++) {
          intLength++;
      } in.close();
      
      matrix = new int[intLength][intLength];
      in = new Scanner(inFile);
      
      int lineCount = 0;
      while (in.hasNextLine()) {
          String[] currentLine = in.next().trim().split("//s+");
          for (int i = 0; i < currentLine.length; i++) {
              matrix[lineCount][i] = Integer.parseInt(currentLine[i]);
          } lineCount++;
          
      } return matrix;
      /*
    10. Open the input file and create a Scanner object to read its content
    20. Read two values (rows and columns) from the first line, if possible
    30. Create a new 2-D array
    40. Read data from the file, one line at a time, using the Scanner object
    50. Split each line into individual tokens and put them into your array
    60. Return the array
    */
  }
  /**
   * Multiply two matrices
   * @param matrix1
   * @param matrix2
   * @return the resulting matrix
   */
  public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
      int[][] matrix1a = matrix1;
      int[][] matrix2a = matrix2;
      int[][] prod = new int[r1][c2];
      for (int i = 0; i < r1; i++) {
          for (int j = 0; j < c2; j++) {
              for (int k = 0; k < c1; k++) {
                  prod[i][j] += matrix1a[i][k] * matrix2a[k][j];
              }
          }
      }
  }
}
