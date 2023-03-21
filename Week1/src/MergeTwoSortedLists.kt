/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var list1 = list1
        var list2 = list2
        var head: ListNode? = null
        if (list1?.`val`!! > list2?.`val`!!) {
            head = list1
            list1 = list1.next
        } else {
            head = list2
            list2 = list2.next
        }

        while(list1 != null && list2 != null) {
            if (list1.`val` > list2.`val`) {
                head.next = list1
                list1 = list1.next
            } else {
                head.next = list2
                list2 = list2.next
            }
        }

        return head
    }

}