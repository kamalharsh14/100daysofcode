import java.util.*;


public class mergeintervals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int intervals[][] = new int[n][2];

        for(int i = 0 ; i < n ; i ++){
            intervals[i][0] = in.nextInt();
            intervals[i][1] = in.nextInt();
        }

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int[]> temp = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] row : intervals){
            if(end >= row[0]){
                end = Math.max(end, row[1]);
            }
            else{
                temp.add(new int[]{start, end});
                start = row[0];
                end = row[1];
            }
        }
        temp.add(new int[]{start, end});
        for(int row[] : temp){
            System.out.println("["+row[0]+" "+row[1]+"]");
        }

        temp.toArray(new int[temp.size()][]);
        in.close();
    }
}