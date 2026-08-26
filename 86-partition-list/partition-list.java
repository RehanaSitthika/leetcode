class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);

        ListNode l = left;
        ListNode r = right;

        while (head != null) {

            if (head.val < x) {
                l.next = head;
                l = l.next;
            } else {
                r.next = head;
                r = r.next;
            }

            head = head.next;
        }

        // End the right list
        r.next = null;

        // Join both lists
        l.next = right.next;

        return left.next;
    }
}