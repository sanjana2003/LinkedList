/*Delete an element in linked list
Write a program to delete an element at the beginning of the linked list. Get the value continuously from the user until the user enters a negative value.
Input Format:

The input should be numbers (until user enters a negative value)



Output Format:

The output should be numbers in the list in separate line.



Sample Input:

1

2

3

4

-1



Sample Output:

2

3

4

Case 1
Case 2
Case 3
Input (stdin)
1
2
3
4
-10

Output (stdout)
2
3
4*/

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        while (true) {
            int value = scanner.nextInt();
            if (value < 0) {
                break;
            }
            linkedList.insertAtEnd(value);
        }

        linkedList.deleteAtBeginning();
        linkedList.display();
    }
}
