package com.ly.arithmetic.linkedlist;

import com.ly.arithmetic.entity.ListNode;

/**
 * @Author: luoYu
 * @Date: 2021/4/10 9:18
 * @Description: 算法题：合并有序链表（从小到大）
 * @link 牛客网TOP200 题号：NC33
 * https://www.nowcoder.com/practice/a479a3f0c4554867b35356e0d57cf03d?tpId=117&tags=&title=&diffculty=0&judgeStatus=0&rp=1&tab=answerKey
 * 将两个有序的链表合并为一个新链表，要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序。
 * 思路：（将两个链表的head节点进行比较，小的节点合并到最终链表中，并从原链表中删除）
 * 1、两个有序的链表，从头开始进行比较
 * 2、要保证合并链表过程中，不能丢失掉之前的链表
 * 3、用两个临时节点分别作为两个链表剩余的head节点。
 * 4、比较两个head节点，小的那个加入到合并的最终链表中，作为合并链表的暂时尾节点
 * 5、因此可以用递归进行操作（参数为两个剩余链表的head节点），终止条件就是两个链表其中一个为空。
 */
/*public class MergeTwoLinkedList {

  public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
    ListNode mergeHeadNode = null;



    // write code here
  }

}*/




