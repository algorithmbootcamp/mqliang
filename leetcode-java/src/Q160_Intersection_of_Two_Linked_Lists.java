import java.util.HashSet;
import java.util.Set;

public class Q160_Intersection_of_Two_Linked_Lists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) return headB;
            set.add(headB);
            headB = headB.next;
        }
        return null;
    }

}
