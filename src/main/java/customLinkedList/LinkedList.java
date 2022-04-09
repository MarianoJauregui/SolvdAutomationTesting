package customLinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LinkedList {

    private static final Logger LOGGER = LogManager.getLogger(LinkedList.class);
    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

        public static LinkedList add(LinkedList list, int data){

            //We create a new node with the given data
            Node newNode = new Node(data);
            newNode.next = null;

            //If the LinkedList is empty, we make the new node as the head of it
            if(list.head == null){
                list.head = newNode;
            } else {
                Node last = list.head;
                while(last.next != null) {
                    last = last.next;
                }
                last.next = newNode;
            }
            return list;
        }

        public static void printLinkedList(LinkedList list) {
            Node currentNode = list.head;
            LOGGER.info("LinkedList: ");

            while(currentNode != null){
                LOGGER.info(currentNode.data + "-");
                currentNode = currentNode.next;
            }

    }
}
