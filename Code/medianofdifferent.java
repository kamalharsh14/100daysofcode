import java.util.*;

public class medianofdifferent{

    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int m = in.nextInt();

            int ar1[] = new int[n];
            int ar2[] = new int[m];

            for(int i = 0 ; i < n ; i ++){
                ar1[i] = in.nextInt();
            }

            for(int i = 0 ; i < m ; i ++){
                ar2[i] = in.nextInt();
            }

            int i = 0;
            int j = 0;
            int count;
            int medianodd = -1; int medianeven = -1;

            if ((m + n) % 2 == 1)
            {
                for(count = 0;
                    count <= (n + m) / 2;
                    count++)
                {
                    if (i != n && j != m)
                    {
                        medianodd = (ar1[i] > ar2[j]) ?
                              ar2[j++] : ar1[i++];
                    }
                    else if (i < n)
                    {
                        medianodd = ar1[i++];
                    }
                     
                    else
                    {
                        medianodd = ar2[j++];
                    }
                }
                System.out.println(medianodd);
            }

            else
            {
                for(count = 0;
                    count <= (n + m) / 2;
                    count++)
                {
                    medianeven = medianodd;
                    if (i != n && j != m)
                    {
                        medianodd = (ar1[i] > ar2[j]) ?
                              ar2[j++] : ar1[i++];
                    }
                    else if (i < n)
                    {
                        medianodd = ar1[i++];
                    }
                     
                    else
                    {
                        medianodd = ar2[j++];
                    }
                }
                System.out.println((medianodd + medianeven) / 2);
            }
            in.close();
        }
    }
}
