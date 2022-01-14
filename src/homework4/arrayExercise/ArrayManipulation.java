package homework4.arrayExercise;

import java.util.HashSet;
import java.util.Set;

public class ArrayManipulation {

    public void manipulate() {



    int arr1[] = {1, 3, 2, 4, 8, 9, 0};
    int arr2[] = {1, 3, 7, 5, 4, 0, 7, 5};
    Set<Integer> array = new HashSet<>();
        Set<Integer> array2 = new HashSet<>();

        for (int i:arr1) {
            array.add(i);

        }
        for (int j:arr2) {
            array2.add(j);

        }
        System.out.println(array);
        System.out.println(array2);
        Set<Integer> intersection=new HashSet<>(array);
        intersection.retainAll(array2);
        System.out.println("intersaction"+intersection);
        Set<Integer> union=new HashSet<>(array);
        union.addAll(array2);
        System.out.println("union"+union);
        Set<Integer> symetric=new HashSet<>(union);
        symetric.removeAll(intersection);
        System.out.println("symetric diffrence"+symetric);


        //Set<Integer> array3=array.;
        //System.out.println("union"+ array2);





}


    public static void main(String[] args) {
        ArrayManipulation am=new ArrayManipulation();
        am.manipulate();
    }


}
