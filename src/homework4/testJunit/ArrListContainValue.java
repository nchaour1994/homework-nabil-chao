package homework4.testJunit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrListContainValue {
   @Test
    public void testArray1(){
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(5,8,9,4,2,9,13));
        int val= 2;
         //boolean b= arr.contains(val);

       Assert.assertTrue(arr.contains(val));
       System.out.println("test 1 passed ");
    }
    @Test
    public void testArray2(){
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(5,8,9,4,2,9,13));
        int val= 78;
        //boolean b= arr.contains(val);

        Assert.assertTrue(arr.contains(val));
        System.out.println("test 2 passed ");
    }
    @Test
    public void testArray3(){
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(5,8,9,4,2,9,13));
        int val= 13;
        //boolean b= arr.contains(val);

        Assert.assertTrue(arr.contains(val));
        System.out.println("test 3 passed ");
    }
}
