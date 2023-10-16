package edu.xjtu

import org.scalatest.flatspec.AnyFlatSpec

class AddTwoNumbersSpec extends AnyFlatSpec {


  def equalListNode(left: ListNode, right: ListNode): Boolean = {
    (left, right) match
      case (null, null) => true
      case (null, _) => false
      case (_, null) => false
      case _ => left.x == right.x && equalListNode(left.next, right.next)
  }

  it should "be equal for 342+465 and 807" in {
    val l1 = ListNode(2, ListNode(4, ListNode(3)))
    val l2 = ListNode(5, ListNode(6, ListNode(4)))

    assert(equalListNode(AddTwoNumbers.addTwoNumbers(l1, l2), (ListNode(7, ListNode(0, ListNode(8))))))
  }

  it should "be equal for 9999999+9999 and 10009998" in {
    val l1 = ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9)))))))
    val l2 = ListNode(9, ListNode(9, ListNode(9, ListNode(9))))

    assert(equalListNode(AddTwoNumbers.addTwoNumbers(l1, l2), (ListNode(8, ListNode(9, ListNode(9, ListNode(9, ListNode(0, ListNode(0, ListNode(0, ListNode(1)))))))))))
  }
}
