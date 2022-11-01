package Arrays;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val){
        val = val;
    }
}
class MyLinkedList {
    ListNode head;
    int size;


    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);

    }

    public int get(int index)  {
        // if index is invalid
        if (index < 0 || index >= size) return -1;

        //ListNode cur = head.next;
        ListNode cur = head;

        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur.val;

    }

    public void addAtHead(int val) {
//        ListNode newNode = new ListNode(val);
//        newNode.next = head.next;
//        head = newNode;
//        size++;
        addAtIndex(0, val);

    }

    public void addAtTail(int val) {
//        ListNode atEnd = new ListNode(val);
//        ListNode tail = new ListNode(0);
//        tail.next = head.next;
//
//        while(tail.next != null){
//            tail = tail.next;
//        }
//        tail.next = atEnd;
//        size++;
        addAtIndex(size, val);

    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;

        if (index < 0) index = 0;
        ++size;

       // ListNode cur = head.next;
        ListNode pred = head;

        for(int i = 0; i < index; i++){
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);

        toAdd.next = pred.next;
        pred.next = toAdd;

    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        size--;

        ListNode pred = head;

        for(int i = 0; i < index; i++){
            pred = pred.next;
        }
//        ListNode newNode = new ListNode(0);
//        newNode.next = cur.next;
//        cur.next = newNode;
        pred.next = pred.next.next;

    }
}


// * Your MyLinkedList object will be instantiated and called as such:
//  MyLinkedList obj = new MyLinkedList();
// int param_1 = obj.get(index);
// obj.addAtHead(val);
// obj.addAtTail(val);
//  obj.addAtIndex(index,val);
// obj.deleteAtIndex(index);
