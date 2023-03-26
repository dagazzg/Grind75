package java;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        return visit(head, visited);
    }

    private boolean visit(ListNode head, Set<ListNode> visited) {
        if (visited.contains(head)) return true;
        visited.add(head);
        if (head != null && head.next != null)
            return visit(head.next, visited);
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
