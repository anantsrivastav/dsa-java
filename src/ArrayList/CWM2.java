package ArrayList;

import java.util.ArrayList;

public class CWM2 {
    public static int ContainerWithMostWater(ArrayList<Integer> container){
        int lp=0;
        int rp= container.size()-1;
        int volume;
        int width;
        int height;
        int max = Integer.MIN_VALUE;

        while(lp<rp){
            width= rp-lp;
            height = Math.min(container.get(lp), container.get(rp));
            volume = height*width;

            if(container.get(lp)<container.get(rp)){
                lp++;
            }
            else{
                rp--;
            }

            if(max<volume){
                max = volume;
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

        System.out.println(ContainerWithMostWater(container));


    }
}
