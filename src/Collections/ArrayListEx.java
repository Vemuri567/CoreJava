package Collections;


import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<Integer>(Arrays.asList(1,3,4,2,3,1,6,4));
        System.out.println(a.contains(4));
        System.out.println(a.contains(9));
        a.set(0,5);
        a.add(7);
        for(int i=0;i<=a.size()-1;i++){
            System.out.println(a.get(i));
        }
        for(int value:a){
            System.out.println("Values in ArrayList from foreachloop:"+value);
        }
        Set<Integer> b=new LinkedHashSet<Integer>(a);
        for(int value:b)
        {
            System.out.println("After initializing the values into set:"+value);
        }
        List<Integer> array=new ArrayList<Integer>();
        array.add(1);
        array.add(3);
        array.add(2);
        array.add(4);
        System.out.println(array);
       int size=array.size();
       for(int i=0;i<=size-1;i++){
           System.out.println(array.get(i));
       }
    }
}
