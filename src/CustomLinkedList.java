// Not every algorithm is built into the standard Library
// Instead, you may need to create your own data structure
// with your own algorithms to manipulate your data more
// effectively.

// We can create our own version of a linkedList in
// java using classes, specifically a LinkedList
// class and a node class.
public class CustomLinkedList {
    // First item or the head of the list.
    Node head;
    public void displayContents() {
        // The customLinkedList is not part of the collection
        // interface, so you'll need to iterate using the
        // next pointers in a for loop.
        // With a loop, we often need a variable that keeps track of
             // where we are in the loop

        // create a current variable that keeps track of what node we're looking
        // at. Start it at the head.
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            // Increment Current to the next node in the list
            current = current.next;
        }
        System.out.println();

    }

    // Delete the back half of the LinkedList
    public void deleteBackHalf() {

        if (head == null || head.next == null) {
            head = null;
        }
        // iterate through the linked list. if we reach the middle
        // node, we'll set its next reference equal to null.
        //One common strategy for finding the middle of a linked list
        // is to use 2 pointers, a slow pointer and fast pointer.
        Node slow = head;
        Node prev = null;
        Node fast = head;

        // instead of having current as our tracker, we'll have 2 trackers
        // slow and fast. Both of these will start at the head, but the fast
        // pointer will move twice as fast as the slow pointer
        // When the first pointer reaches the end of the list,
        // the slow pointer will be at the middle element.
        // We'll increment the fast pointer twice by setting fast, equal to
        // fast.next.next. For slow, we'll just increment it one time.

        // Now since we're accessing attributes, we'll need
        // to make sure these variables are not null b4
        // entering the while loop. we don't need to check
        // whether the slow node is null, because it will be
        // behind the fast node. If either of these conditions
        // becomes false, then the first pointer is either at
        // the end of the list or at the last item of the list.
        // This puts our slow pointer at the middle node. we'll
        // want to access the node just before the slow node.
        // so we can set its next pointer equal to null.

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;

        }

            // The previous node will run just behind the slow node.
            // At the end of the while loops execution, all we have
            //to do is set the previous node's next reference to null
            prev.next = null;

    }
}
