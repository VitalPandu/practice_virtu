
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthOfString = sc.nextInt();
        int[] array = new int[lengthOfString];

        for (int i = 0; i < lengthOfString; i++) {
            array[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int x= sc.nextInt();
        int z = sc.nextInt();

        System.out.println(pthSmallest(lengthOfString, array, p,x,z));

    }
    static int pthSmallest(int n,int[] arr,int p,int x,int z){
       int temp[] = new  int[n];
        for(int i=0; i<n;i++){
            if ((arr[i]%x) == z){
                temp[i] = arr[i];
            }
        }
        Arrays.sort(temp);
        for ( int i = 0; i < n; i++) {
            if(arr[i] == temp[1]){
                return i;
            }
        }
        return  0;
    }
}
