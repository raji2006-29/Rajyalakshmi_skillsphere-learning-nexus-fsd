import java.util.*;

public class LinkedListExample {

    public static void main(String[] args){

        LinkedList<String> list=new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        list.addFirst("Mango");

        list.addLast("Pineapple");

        System.out.println(list);

    }

}

