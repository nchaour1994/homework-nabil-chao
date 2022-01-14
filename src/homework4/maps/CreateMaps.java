package homework4.maps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateMaps {

    public static void main(String[] args) {

        Map<String,String > book=new HashMap<>();
        book.put("title","unbroken");
        book.put("author","laura hillenbrand");
        book.put("publisher","Random House");
        book.put("pages","374");
       //System.out.println(book);
        for (Map.Entry enter:book.entrySet()) {
            System.out.println(enter.getKey()+"    "+enter.getValue());
        }
        System.out.println(book.get("author"));
        System.out.println("----------------------");

        Map<Integer,String> array=new HashMap<>();
       array.put(1,"john");
        array.put(2,"karla");
        array.put(3,"albert");
        array.put(4,"jennifer");
       // System.out.println(array);
        for (Map.Entry enter: array.entrySet()){
            System.out.println(enter.getKey()+"      "+enter.getValue());
        }
        System.out.println("----------------------");
        ArrayList<String>carsToyota=new ArrayList<>();
        carsToyota.add("camery");
        carsToyota.add("yaris");
        carsToyota.add("prius");
        carsToyota.add("corolla ");
        ArrayList<String> carsHonda=new ArrayList<>();
        carsHonda.add("civic");
        carsHonda.add("fit");
        carsHonda.add("pilot");
        carsHonda.add("accord");
        ArrayList<String> carsFord=new ArrayList<>();
        carsFord.add("mustang");
        carsFord.add("ranger");
        carsFord.add("F-150");
        carsFord.add("Explorer");
        Map<String,List<String>>cars=new HashMap<>();
        cars.put("toyota",carsToyota);
        cars.put("honda",carsHonda);
        cars.put("ford",carsFord);
        for (Map.Entry enter:cars.entrySet()) {
            System.out.println(enter.getKey()+"    "+enter.getValue());
        }
        System.out.println("----------------------");
        ArrayList<Integer> evenNumber =new ArrayList<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);
        ArrayList<Integer> oddNumber =new ArrayList<>();
        oddNumber.add(1);
        oddNumber.add(3);
        oddNumber.add(5);
        oddNumber.add(7);
        Map<String ,List<Integer>> number=new HashMap<>();
        number.put("even number ",evenNumber);
        number.put("odd number",oddNumber);
        for (Map.Entry enter:number.entrySet()
             ) {
            System.out.println(enter.getKey()+"    "+enter.getValue());
        }
        System.out.println("----------------------");
        ArrayList<String> listSet=new ArrayList<>();
        listSet.add("hashSet");
        listSet.add("LinkedHashSet");
        ArrayList<String> list=new ArrayList<>();
        list.add("arrayList");
        list.add("linkedList");
        list.add("vector");
        list.add("stack");
        ArrayList<String> queue=new ArrayList<>();
        queue.add("priorityQueue");
        Map<String,List<String>> collection =new HashMap<>();
        collection.put("sets",listSet);
        collection.put("lists",list);
        collection.put("queues",queue);
        for (Map.Entry enter:collection.entrySet()
             ) {
            System.out.println(enter.getKey()+"    "+enter.getValue());
        }








        }


    }



