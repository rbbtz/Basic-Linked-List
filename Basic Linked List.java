public class LinkedList {
  private Node head;  // head of the list

  // nested class to define node
  private class Node {
    int data;
    Node next;
  }

  // constructor to create an empty list
  public LinkedList() {
    head = null;
  }

  // method to insert a new element at the front of the list
  public void addFirst(int element) {
    Node newNode = new Node();
    newNode.data = element;
    newNode.next = head;
    head = newNode;
  }

  // method to remove the first element of the list
  public int removeFirst() {
    if (head == null) {
      throw new NoSuchElementException();
    }
    int element = head.data;
    head = head.next;
    return element;
  }

  // method to check if the list is empty
  public boolean isEmpty() {
    return head == null;
  }
}
