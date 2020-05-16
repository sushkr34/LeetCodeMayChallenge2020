class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode oddPointer = head;
        ListNode evenPointer = head.next;
        ListNode even = head.next;
        while(evenPointer != null && evenPointer.next != null){
            oddPointer.next = oddPointer.next.next;
            oddPointer = oddPointer.next;
            evenPointer.next = evenPointer.next.next;
            evenPointer = evenPointer.next;
        }
        oddPointer.next = even;
        return head;
    }
}