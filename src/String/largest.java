package String;

public class largest {
    public static void main(String[] args) {

        String[] fruit = {"Apple", "Mango", "Banana"};

        String Largest= fruit[0];

        for(int i=1; i<fruit.length;i++){
            if(Largest.compareTo(fruit[i])<0){
                Largest = fruit[i];
            }
        }
        System.out.println(Largest);
    }
}
