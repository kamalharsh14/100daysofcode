import java.util.*;

class maxarearectangle{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int matrix[][] = new int[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0; j < m ; j ++){
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("Maximum Area = ");
        in.close();
    }

    public int maxArea(int M[][], int n, int m) {
        
        int[] hist = new int[m];
        int maxArea = 0;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(M[i][j]==1) hist[j]++;
                else hist[j] = 0;
            }
            maxArea = Math.max(maxArea, getMaxArea(hist, m));
        }
        
        return maxArea;
    }
    
    int getMaxArea(int hist[], int n)
    {
        Stack<Integer> s = new Stack<>();
         
        int max_area = 0;
        int tp;
        int area_with_top;
      
        int i = 0;
        while (i < n)
        {
            if (s.empty() || hist[s.peek()] <= hist[i])
                s.push(i++);
            else
            {
                tp = s.peek();
                s.pop();
                area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);
                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }
        while (s.empty() == false)
        {
            tp = s.peek();
            s.pop();
            area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);
      
            if (max_area < area_with_top)
                max_area = area_with_top;
        }
      
        return max_area;
 
    }
}