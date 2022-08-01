import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        int temp=arr[i];
        n--;
        arr[i]=arr[n];
        arr[n]=temp;
    }
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
