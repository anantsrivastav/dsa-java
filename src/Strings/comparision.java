package Strings;

public class comparision {
    public static void main(String[] args) {

        String[] fruit = {"Mango, Banana, Orange, Apple"};

        String largest = fruit[0];

        for(int i=0;i <fruit.length; i++){
            if(largest.compareToIgnoreCase(fruit[i])<0){
                largest = fruit[i];
            }
        }
    }
}
