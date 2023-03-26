package java;

public class LinkedListCycleTortoiseHare {
    public boolean hasCycle(LinkedListCycle.ListNode head) {
        LinkedListCycle.ListNode slow = head;
        LinkedListCycle.ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }
}
