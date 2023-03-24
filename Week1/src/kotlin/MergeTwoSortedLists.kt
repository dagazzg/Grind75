package kotlin

/**
 * Example:
 * var li = kotlin.ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class kotlin.ListNode(var `val`: Int) {
 *     var next: kotlin.ListNode? = null
 * }
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if(list1 == null && list2 != null) return list2
        if(list1 != null && list2 == null) return list1

        if (list1 != null && list2 != null) {
            var list1 = list1
            var list2 = list2
            var head: ListNode?

            if (list1.`val` < list2.`val`) {
                head = list1
                list1 = list1.next
            } else {
                head = list2
                list2 = list2.next
            }
            val originalHead = head

            while (list1 != null && list2 != null) {
                while(list1 != null && list1.`val` < list2.`val`) {
                    head?.next = list1
                    list1 = list1.next
                    head = head?.next
                }
                while(list2 != null && list1 != null && list1.`val` >= list2.`val`) {
                    head?.next = list2
                    list2 = list2.next
                    head = head?.next
                }
            }

            if (list1 == null) {
                head?.next = list2
            } else {
                head?.next = list1
            }
            return originalHead
        }

        return null
    }

}