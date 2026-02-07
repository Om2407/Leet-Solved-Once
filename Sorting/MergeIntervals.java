import java.util.*;
public class MergeIntervals {
    public int[][] merge(int [][] intervals){

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];

        List<int[]> list = new ArrayList<>();

        for(int i=1; i<intervals.length; i++){

            int s = intervals[i][0];
            int e = intervals[i][1];

            if(s<=end){
                end = Math.max(end, e);
            } else{

                list.add(new int[]{start,end});
                start = s;
                end =e;
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
   public static void main(String[] args) {
        MergeIntervals merger = new MergeIntervals();
        int[][] intervals = { {1,3}, {2,6}, {8,10}, {15,18} };
        int[][] merged = merger.merge(intervals);
        
        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
        }
    }

