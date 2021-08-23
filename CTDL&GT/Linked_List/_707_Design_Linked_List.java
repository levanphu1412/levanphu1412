package Linked_List;



public class _707_Design_Linked_List {

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        MyLinkList m = new MyLinkList();

        System.out.println(m.get(n1, 1));
        n1 = m.addAtHead(n1, 0);
        m.printList(n1);
        n1 = m.addAtTail(n1, 50);
        m.printList(n1);
        n1 = m.addAtIndex(n1, 3, 35);
        m.printList(n1);
        n1 = m.deleteAtIndex(n1, 2);
        m.printList(n1);

    }


    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    public static class MyLinkList {

        public MyLinkList() {

        }

        public void printList(Node headNode) {
            if(headNode == null) {
                System.out.println("List is empty");
            }else {
                Node tem = headNode;
                while(tem != null) {
                    System.out.print(tem.value);
                    tem = tem.next;
                    if(tem != null) {
                        System.out.print("->");
                    }else {
                        System.out.println();
                    }
                }
            }
        }

        /**
         * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
         */
        public int get(Node headNode ,int index) {
            Node tem = headNode;
            int count = 0;
            while (tem != null) {
                if (count == index) {
                    return tem.value;
                }
                count++;
                tem = tem.next;
            }
            return -1;
        }

        /**
         * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
         */
        public Node addAtHead(Node headNode, int val) {
            Node newNode = new Node(val);
            if(headNode != null) {
                newNode.next = headNode;
            }
            return newNode;
        }

        /**
         * Append a node of value val to the last element of the linked list.
         */
        public Node addAtTail(Node headNode, int val) {
            Node newNode = new Node(val);
            if(headNode == null) {
                return newNode;
            }else {
                Node lastNode = headNode;
                while(lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                lastNode.next = newNode;
            }
            return headNode;
        }

        /**
         * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
         */
        public Node addAtIndex(Node headNode, int index, int val) {
            if(index == 0) {
               return addAtHead(headNode, val);
            }else {
                Node newNode = new Node(val);
                Node curNode = headNode;
                int count = 0;
                while(curNode != null) {
                    count++;
                    if(count == index) {
                        newNode.next = curNode.next;
                        curNode.next = newNode;
                        break;
                    }
                    curNode = curNode.next;
                }
            }
            return headNode;
        }

        /**
         * Delete the index-th node in the linked list, if the index is valid.
         */
        public Node deleteAtIndex(Node headNode, int index) {
            if(headNode == null) {
                return null;
            }else {
                if(index == 0) {
                    return headNode.next;
                }else {
                    Node curNode = headNode;
                    Node prevNode = null;
                    int count = 0;
                    boolean isfound = false;
                    while(curNode != null) {
                        if(count == index){
                            isfound = true;
                            break;
                        }

                        prevNode = curNode;
                        curNode = curNode.next;
                        count++;

                    }
                    if(isfound) {
                        if(prevNode == null) {
                            return null;
                        }else {
                            if(curNode != null) {
                                prevNode.next = curNode.next;
                            }
                        }
                    }
                    return headNode;
                }
            }
        }
    }
}

