/**
 * Created by WangJQ on 2015/7/17.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode tail = reverse(slow.next);
        slow.next = null;
        while(head != null && tail != null) {
            if(head.val != tail.val)
                return false;
            head = head.next;
            tail = tail.next;
        }

        return true;
    }

    public ListNode reverse(ListNode start) {
        ListNode pre = null;
        ListNode cur = start;
        ListNode next = start.next;

        while(next != null) {
            cur.next =pre;
            pre = cur;
            cur = next;
            next = next.next;
            cur.next = pre;
        }

        return cur;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
