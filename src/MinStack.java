/**
 * Created by WangJQ on 2015/7/27.
 */
public class MinStack {
    ListNode head;
    int min;

    public void push(int x) {
        if(head == null) {
            head = new ListNode(x);
            min = head.val;
        }
        else {
            ListNode cur = new ListNode(x);
            cur.next = head;
            head = cur;
            if(head.val < min)
                min = head.val;
        }
    }

    public void pop() {
        if(head != null) {
            if(head.val <= min) {
                ListNode cur = head.next;
                if(cur == null)
                    min = Integer.MAX_VALUE;
                else
                    min = cur.val;
                while(cur != null) {
                    if(cur.val <= min)
                        min = cur.val;
                    cur = cur.next;
                }
            }
            head = head.next;
        }
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return min;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
