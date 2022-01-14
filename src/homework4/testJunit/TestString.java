package homework4.testJunit;

import org.junit.Assert;
import org.junit.Test;

public class TestString {
    @Test
    public void teststring1(){
        String str= " www.google.com";
        String sub="com";
       boolean res= str.contains(sub);
       Assert.assertTrue(str.contains(sub));

        System.out.println( " test 1  passed");
    }
    @Test
    public void teststring2(){
        String str= " www.google.com";
        String sub="hello";
        boolean res= str.contains(sub);
        Assert.assertTrue(str.contains(sub));

        System.out.println( "  test2 passed");
    }
    @Test
    public void teststring3(){
        String str= " www.google.com";
        String sub="google";
        boolean res= str.contains(sub);
        Assert.assertTrue(str.contains(sub));

        System.out.println( " test 3  passed");
    }
}
