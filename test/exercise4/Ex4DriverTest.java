/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author anna
 */
public class Ex4DriverTest {
    
    public Ex4DriverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Ex4Driver.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ex4Driver.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task1 method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        int n = 0;
        int expResult = 5;
        int result = Ex4Driver.task1(n);
        assertEquals(expResult, result);
        n = 5;
        expResult = 10;
        result = Ex4Driver.task1(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task2 method, of class Ex4Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        String countL = "Donkey";
        int expResult = 6;
        int result = Ex4Driver.task2(countL);
        assertEquals(expResult, result);
        countL = "Fish";
        expResult = 4;
        result = Ex4Driver.task2(countL);
        assertEquals(expResult, result);
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        Character c = 'Q';
        int expResult = 81;
        int result = Ex4Driver.task3(c);
        assertEquals(expResult, result);
        c = 'a';
        expResult = 97;
        result = Ex4Driver.task3(c);
        assertEquals(expResult, result);      
    }

    /**
     * Test of task4 method, of class Ex4Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        String word = "walking";
        char expResult = 'w';
        char result = Ex4Driver.task4(word);
        assertEquals(expResult, result);
        word = "music";
        expResult = 'm';
        result = Ex4Driver.task4(word);
        assertEquals(expResult, result);    
    }

    /**
     * Test of task5 method, of class Ex4Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");
        int x = 5;
        int y = 4;
        int expResult = 9;
        int result = Ex4Driver.task5(x, y);
        assertEquals(expResult, result);
        x = 15;
        y = 20;
        expResult = 35;
        result = Ex4Driver.task5(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of task6 method, of class Ex4Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        String word = "cat";
        int num = 1;
        char expResult = 'a';
        char result = Ex4Driver.task6(word, num);
        assertEquals(expResult, result);
        word = "sleep";
        num = 4;
        expResult = 'p';
        result = Ex4Driver.task6(word, num);
        assertEquals(expResult, result);
    }

    /**
     * Test of task7 method, of class Ex4Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        int[] arr = null;
        int expResult = 0;
        int result = Ex4Driver.task7(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task8 method, of class Ex4Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        int[] arr = null;
        int n = 0;
        boolean expResult = false;
        boolean result = Ex4Driver.task8(arr, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task9 method, of class Ex4Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        ArrayList<String> strlist = null;
        int expResult = 0;
        int result = Ex4Driver.task9(strlist);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task10 method, of class Ex4Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        HashMap map = null;
        int expResult = 0;
        int result = Ex4Driver.task10(map);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
