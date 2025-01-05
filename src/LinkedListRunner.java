public class LinkedListRunner {
    public static void main(String[] args) {
        // Creating a LinkedList from the CustomLinkedList Class;
        CustomLinkedList linkedList = new CustomLinkedList();
        // Use the built-in constructor

        // Create some nodes to put in the list
        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        // FourthNode don't need to set its next pointer
        // to anything, it's already null.

        // Next step: go the CustomLinkedList class and create
        // algorithm that iterates through your custom data structure

        // let's use the function. It's an instance method, so we'll access our
        // linkedList and run it.
        linkedList.displayContents();
        linkedList.deleteBackHalf();
        linkedList.displayContents();


    }
}
