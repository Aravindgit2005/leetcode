
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode>st=new HashSet<>();
        while(head!=null){
            if(st.contains(head)){
                return head;
            }
            st.add(head);
            head=head.next;
        }
        return null;
    }
}