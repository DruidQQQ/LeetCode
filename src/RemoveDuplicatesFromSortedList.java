/**
 * Created by WangJQ on 2015/7/20.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode cur = head;
        ListNode next = head.next;

        while(next != null) {
            if(cur.val == next.val) {
                cur.next = next.next;
                next = next.next;
            }
            else {
                cur = cur.next;
                next = next.next;
            }
        }

        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
