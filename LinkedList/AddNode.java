
import java.io.*;
import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node next;

        public Node() {
        }

        Node(int data){
            this.data = data;
        }


    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            if(head == null){
                head = new Node(val);
                tail = head;
    
            }else{
                tail.next = new Node(val);
                tail = tail.next;
            }
            size++;
        }

         /*
         void addLast(int val) {
            Node temp = new Node(val);
            if(size == 0){
                tail = head = temp;
            }else{
                tail.next = temp;
                tail = tail.next;
            }
            size++;
        }*/
    }

    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
        System.out.println(list.size);

        if (list.size > 0) {
            System.out.println(list.tail.data);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("addLast")){
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }
            str = br.readLine();
        }

        testList(list);
    }
}