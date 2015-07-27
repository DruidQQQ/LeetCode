/**
 * Created by WangJQ on 2015/7/27.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode cur = head.next;
        ListNode next = head.next.next;
        head.next = null;
        while(next != null) {
            cur.next = head;
            head = cur;
            cur = next;
            next = next.next;
        }

        cur.next = head;
        head = cur;

        return head;
    }

    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode next = head.next;
        head.next = null;
        ListNode newHead = reverseList2(next);
        next.next = head;

        return newHead;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode (int x) { val = x; }
    }
}
