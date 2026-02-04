class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]>list=new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] curr=intervals[i];
            int st=curr[0];
            int[] arr=list.get(list.size()-1);
            int r=arr[1];
            if(st<=r){
                list.remove(list.size()-1);
                
                list.add(new int[]{arr[0],Math.max(curr[1],arr[1])});
            }
            else{
                list.add(curr);
            }
        }
        int[][] res=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;

    }
}