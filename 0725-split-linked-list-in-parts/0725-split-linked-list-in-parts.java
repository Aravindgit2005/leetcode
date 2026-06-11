class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        // Find length
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int partSize = length / k;
        int extra = length % k;

        ListNode[] result = new ListNode[k];

        ListNode curr = head;

        for (int i = 0; i < k; i++) {

            result[i] = curr;

            int currentPartSize = partSize;

            if (extra > 0) {
                currentPartSize++;
                extra--;
            }

            // Move to end of current part
            for (int j = 1; j < currentPartSize && curr != null; j++) {
                curr = curr.next;
            }

            // Cut the list
            if (curr != null) {
                ListNode nextPart = curr.next;
                curr.next = null;
                curr = nextPart;
            }
        }

        return result;
    }
}
