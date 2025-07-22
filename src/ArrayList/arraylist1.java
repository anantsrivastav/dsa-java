package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);   //0(1) time of adding the element in the array list

        System.out.println(list);

       int a=  list.get(0);
        System.out.println(a);

        list.remove(1);
        System.out.println(list); // delete

        // set element

        list.set(2,7);
        System.out.println(list);

        System.out.println(list.contains(3));


        // maximum of the array
        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            max = Math.max(max,list.get(i));
        }

        System.out.println(max);

        //swapping of two number

        int temp = list.get(1);
        list.set(1, list.get(2));
        list.set(2, temp);

        for(int i=0; i< list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }

}
