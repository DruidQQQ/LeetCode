/**
 * Created by WangJQ on 2015/7/17.
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {

        if(node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
