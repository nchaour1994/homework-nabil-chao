package homework4.testJunit;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapContainsVal {
   @Test
    public void testMap1(){
       Map<String,String> map=new HashMap<>();
       map.put("toyota","camery");
       map.put("honda","civic");
       map.put("ford","focus");
       String val="civic";

       //boolean b=map.containsValue(val);
       Assert.assertTrue(map.containsValue(val));
       System.out.println("test 1 passed ");



    }
    @Test
    public void testMap2(){
        Map<String,String> map=new HashMap<>();
        map.put("toyota","camery");
        map.put("honda","civic");
        map.put("ford","focus");
        String val="focus";

        //boolean b=map.containsValue(val);
        Assert.assertTrue(map.containsValue(val));
        System.out.println("test 2 passed ");



    }
    @Test
    public void testMap3(){
        Map<String,String> map=new HashMap<>();
        map.put("toyota","camery");
        map.put("honda","civic");
        map.put("ford","focus");
        String val="toyota";

        //boolean b=map.containsValue(val);
        Assert.assertTrue(map.containsValue(val));
        System.out.println("test 3 passed ");



    }
    @Test
    public void testMap4(){
        Map<String,String> map=new HashMap<>();
        map.put("toyota","camery");
        map.put("honda","civic");
        map.put("ford","focus");
        String val="chevrolet";

        //boolean b=map.containsValue(val);
        Assert.assertTrue(map.containsValue(val));
        System.out.println("test 3 passed ");



    }
}
