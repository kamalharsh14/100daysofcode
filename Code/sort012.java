package Code;
import java.util.*;
public class sort012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int countzero = 0;
        int countone = 0;
        int counttwo = 0;

        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
            if(a[i] == 0){
                countzero++;
            }
            if(a[i] == 1){
                countone++;
            }
            if(a[i] == 2){
                counttwo++;
            }
        }
        
        for(int i = 0 ; i < n ; i ++){
            if(i < countzero){
                a[i] = 0;
            }
            if(i >= countzero && i < (countone+countzero)){
                a[i] = 1;
            }
            if(i >= (countone+countzero) && i < (counttwo + (countone+countzero))){
                a[i] = 2;
            }
        }

        for(int i = 0 ; i < n ; i ++){
            System.out.print(a[i]+" ");
        }

        in.close();
    }
}