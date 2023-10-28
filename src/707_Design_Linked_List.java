class ListNode {
        ListNode next;
        int val;
        ListNode () {}
        ListNode (int val) {
            this.val =val;
        }
    }

class MyLinkedList {
    int size;
    ListNode head;
    
    // 虚拟节点！maintain a head to initiate the linkedlist
    public MyLinkedList() {
        size = 0;
        this.head = new ListNode(0);    
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode temp = head;
        for(int i=0; i<= index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
         addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) {
            return;
        }
        ListNode prev = head;
        for(int i=0; i< index; i++) {
            prev = prev.next;
        }
        ListNode after =prev.next;

        ListNode newNode = new ListNode(val);
        newNode.next = after;
        prev.next = newNode;
        size += 1;
    }
    
    public void deleteAtIndex(int index) {
        if (index< 0|| index>=size) {
            return;
        }
        ListNode prev = head;
        for(int i=0; i< index; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size -= 1;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
