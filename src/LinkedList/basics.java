package LinkedList;

public class basics {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    }

    public static void main(String[] args) {

        Node a= new Node(7);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(1);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        System.out.println(a.next);

        System.out.println(b.next);

        System.out.println(c.next);

        System.out.println(d.next);

        System.out.println(e.next);

        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//        System.out.println(e.data);
  // 7 -> 3-> 2 ->1
        System.out.println(a.next.data);    //b
        System.out.println(a.next.next.data);   //c
        System.out.println(a.next.next.next.data);     //d

        Node temp= a;

//        for(int i=1;i<=5;i++){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }


        // better way

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
