import java.util.*;

public class SumofPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList<Integer> prime = new ArrayList<>();
        int sum=0;
        int non_prime_sum=0;
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
                if(count==2){
                    prime.add(arr[i]);
                }
            }
            // this is the part where the sum of elements is calculated when there is no prime numbers in the array
            // if there is no prime numbers, except the largest element in the array, the other elements are taken in to account and sum is
            if(prime.size()==0){
                Arrays.sort(arr);
                for(int i=0;i<n;i++){
                    if(i!=n-1){
                        non_prime_sum=non_prime_sum+arr[i];
                    }
                }
                System.out.println("Sum of non prime Numbers in array Except the largest  number: "+ non_prime_sum);
            }
            Collections.sort(prime);

            for(int i=0;i<prime.size();i++){
                if(i!=prime.size()-1){
                    sum=sum+prime.get(i);

                }
            }
            if(prime.size()>0){
                System.out.println("Sum of prime Numbers in array Except the largest Prime number: "+ sum);
            }
            
        }
    }

