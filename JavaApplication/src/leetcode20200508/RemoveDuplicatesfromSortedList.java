/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode20200508;

/**
 *
 * @author m2912
 */
public class RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            int value1 = curr.val;
            int value2 = curr.next.val;
            if(value1 == value2){
                ListNode tmpListNode = curr.next.next;
                curr.next = tmpListNode;
            }
            //注意有重複兩次以上的情形 如 1 -1- 1 - 2
            else{
                curr = curr.next;
            }
            
        }
        return tmp;
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
