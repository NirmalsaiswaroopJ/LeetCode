class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        int prev=0;
        int count=0;
        for (int i=0;i<meetings.length;i++){
            if (meetings[i][0]>prev){
                count+=meetings[i][0]-prev-1;
            }
            prev=Math.max(meetings[i][1],prev);
        }
        count+=days-prev;
        return count;
    }
}