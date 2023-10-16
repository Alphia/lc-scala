package edu.xjtu

object AddTwoNumbers {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    (l1, l2) match
      case (null, null) => null
      case (null, _) => ListNode(l2.x, addTwoNumbers(null, l2.next))
      case (_, null) => ListNode(l1.x, addTwoNumbers(l1.next, null))
      case _ => (l1.x + l2.x) match
        case sum if sum >= 10 => ListNode((l1.x + l2.x) % 10, addTwoNumbers(addTwoNumbers(l1.next, ListNode(1)), l2.next))
        case _ => ListNode(l1.x + l2.x, addTwoNumbers(l1.next, l2.next))
  }
}
