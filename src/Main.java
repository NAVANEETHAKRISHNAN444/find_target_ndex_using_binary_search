import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
       for(int i=0;i<size;i++) {
           arr[i]=sc.nextInt();
       }
        int target=sc.nextInt();
       int ans=Binary(arr,target);
       System.out.print(ans);
    }
    static int Binary(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;

            if (target<arr[mid]) {
                end=mid-1;
            } else  start=mid+1;
            //else return mid;
        }
        return start;
    }
}