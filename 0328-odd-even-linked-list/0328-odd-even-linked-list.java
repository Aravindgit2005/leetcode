class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null) return null;

        ArrayList<Integer> arr = new ArrayList<>();

        // Store odd position values
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            arr.add(temp.val);
            temp = temp.next.next;
        }

        if (temp != null) {
            arr.add(temp.val);
        }

        temp = head.next;

        while (temp != null && temp.next != null) {
            arr.add(temp.val);
            temp = temp.next.next;
        }

        if (temp != null) {
            arr.add(temp.val);
        }

        temp = head;
        int i = 0;

        while (temp != null) {
            temp.val = arr.get(i++);
            temp = temp.next;
        }

        return head;
    }
}
