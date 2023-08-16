/*Linked list - nth node from the end
Write a Program to find the nth node of a list from the end. If there is no nth node print "There is no nth node in the list", otherwise print the nth node element.
Input Format:

The input should be numbers (until user enters a negative value).

Last line should be the value of nth node.



Output Format:

The output should be numbers in the list in separate line.



Sample Input:

1

2

3

4

-1

2



Sample Output:

Enter the nth node:

3 is the nth node element in the list

Case 1
Case 2
Input (stdin)
1
2
3
4
-1
2

Output (stdout)
Enter the nth node:
3 is the nth node element in the list*/


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

    public int findNthFromEnd(int n) {
        if (head == null) {
            return -1; // List is empty
        }

        Node first = head;
        Node second = head;
        
        // Move second pointer n positions ahead
        for (int i = 0; i < n; i++) {
            if (second == null) {
                return -1; // n is greater than the length of the list
            }
            second = second.next;
        }
        
        // Move first and second pointers together until second reaches the end
        while (second != null) {
            first = first.next;
            second = second.next;
        }
        
        return first.data;
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

        System.out.println("Enter the nth node:");
        int n = scanner.nextInt();
        int nthNode = linkedList.findNthFromEnd(n);
        
        if (nthNode == -1) {
            System.out.println("There is no nth node in the list");
        } else {
            System.out.println(nthNode + " is the nth node element in the list");
        }
    }
}
