package com.ly.arithmetic.util;

import com.ly.arithmetic.entity.ListNode;

/**
 * @Author: luoYu
 * @Date: 2021/4/10 9:58
 * @Description: 用于将数据输出在控制台
 */
public class Printer {

  /**
   * 从头遍历并打印单向链表的值
   */
  public static void linkedListPrinter(ListNode node){
    System.out.print(node.value);
    if (node.next != null){
      System.out.print(" ");
      linkedListPrinter(node.next);
    }
  }

}
