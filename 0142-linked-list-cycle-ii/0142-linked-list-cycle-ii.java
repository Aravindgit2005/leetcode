
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode>st=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(st.contains(temp)){
                return temp;
            }
            st.add(temp);
            temp=temp.next;
        }
        return null;
    }
}