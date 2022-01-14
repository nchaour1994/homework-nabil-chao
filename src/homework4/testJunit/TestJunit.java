package homework4.testJunit;


import org.junit.Assert;
import org.junit.Test;

public class TestJunit {


   @Test
    public void test1() {
        int a = 50;
        int b = 80;
        int expectedResault = 400;
        int res = a * b;
        Assert.assertEquals(expectedResault,res);


        System.out.println("test1 passed ");
    }
    @Test
    public void test2() {
        int a = 50;
        int b = 80;
        int expectedResault = 4000;
        int res = a * b;

        Assert.assertEquals(expectedResault,res);
        System.out.println("test2 passed ");
    }
    @Test
    public void test3() {
        int a = 50;
        int b = 80;
        int expectedResault = 4000;
        int res = a * b;

        Assert.assertEquals(expectedResault,res);
        System.out.println("test3 passed ");
    }
    @Test
    public void test4() {
        int a = 50;
        int b = 80;
        int expectedResault = 4000;
        int res = a * b;

        Assert.assertEquals(expectedResault,res);
        System.out.println("test4 passed ");
    }

}
