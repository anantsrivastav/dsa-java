package ArrayList;

import java.util.ArrayList;

public class CWM {
    public static int containerWithMostWater(ArrayList<Integer> container){

        int max = Integer.MIN_VALUE;
        int volume =0;
        for(int i=0;i<container.size(); i++){
            for(int j=i+1; j<container.size();j++){
                int height = Math.min(container.get(i), container.get(j));
                int width = j- i;
                volume = height*width;

                if(volume>max){
                    max = volume;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> container = new ArrayList<>();
        container.add(1);
        container.add(8);
        container.add(6);
        container.add(2);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(3);
        container.add(7);

        System.out.println(containerWithMostWater(container));      //========= O(n^2) TC==============
        }



}
