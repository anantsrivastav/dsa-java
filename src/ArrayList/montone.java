package ArrayList;

import java.util.ArrayList;

public class montone {
    public static boolean fun(ArrayList<Integer> list){
        int i=0;

        while(i< list.size()-1){
            if(list.get(i)<=list.get(i+1)){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);

        System.out.println(fun(list));
    }
}
