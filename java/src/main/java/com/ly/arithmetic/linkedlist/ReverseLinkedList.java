package com.ly.arithmetic.linkedlist;

import static com.ly.arithmetic.util.Printer.*;
import com.ly.arithmetic.entity.ListNode;
import java.util.Scanner;

/**
 * @Author: luoYu
 * @Date: 2021/4/9 10:25
 * @Description: 算法题：反转链表
 * @link 牛客网TOP200 题号：NC78
 * https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=117&tqId=37777&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high%2Fquestion-ranking&tab=answerKey
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 思路：
 * 1、链表的基本结构是当前节点指向next节点。
 * 2、反转链表就是将next节点指向该节点。
 * 3、但是转变后，next节点会丢失它的next节点，即next.next。
 * 4、因此先临时保存指next.next节点。
 * （一定要注意链表头的next要设置为null）
 */
public class ReverseLinkedList {

  public static ListNode reverseLinkedList(ListNode head) {
    if (head == null) {
      return null;
    }
    // 获取next节点
    ListNode nextNode = head.next;
    //将head的next设置为null（一定要注意这点，不然会在遍历时造成死循环）
    head.next = null;
    // 执行反转操作直到next节点为空，如果为空，则表示已经遍历到尾节点
    while (nextNode != null) {
      // 临时获取next的下一个节点
      ListNode tmpNode = nextNode.next;
      // next的下一个节点执行head，实现反转操作
      nextNode.next = head;
      // 将next节点设置为head，实现向后遍历
      head = nextNode;
      // 将临时节点设置为next节点
      nextNode = tmpNode;
    }
    return head;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ListNode headNode = new ListNode(scanner.nextInt());
    ListNode tmpNode = headNode;
    // 获取输入的数值，直到输入为0
    while (scanner.hasNext()) {
      int value = scanner.nextInt();
      if (value != 0) {
        ListNode node = new ListNode(value);
        tmpNode.next = node;
        tmpNode = node;
      } else {
        break;
      }
    }
    headNode = reverseLinkedList(headNode);
    linkedListPrinter(headNode);
  }
}



