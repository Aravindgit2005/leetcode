class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Map to store the last seen node for a specific prefix sum
        Map<Integer, ListNode> prefixMap = new HashMap<>();
        
        int prefixSum = 0;
        // First pass: map each prefix sum to the latest node that produces it
        for (ListNode curr = dummy; curr != null; curr = curr.next) {
            prefixSum += curr.val;
            prefixMap.put(prefixSum, curr);
        }
        
        // Second pass: update next pointers to skip the zero-sum sequences
        prefixSum = 0;
        for (ListNode curr = dummy; curr != null; curr = curr.next) {
            prefixSum += curr.val;
            // Jump to the node after the zero-sum sequence
            curr.next = prefixMap.get(prefixSum).next;
        }
        
        return dummy.next;
    }
}