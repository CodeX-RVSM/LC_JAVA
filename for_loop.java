import java.util.*;

public class for_loop {
    public static void main(String[] args) {
        System.out.println("Enter size of array :");
        // int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        int arr[]=new int[n];
        //take values form user 

        System.out.println("Enter values for array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        //WAP to print min and max form array 
        // int max=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        

        // int max=arr[0];
        // for(int a:arr){
        //     System.out.println(a);
        // }
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println("Max :"+max);

        
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        System.out.println("Min :"+min);

        // System.out.println("Values from array:");
        // for(int a:arr){
        //     System.out.println(a);
        // }
        

        //Normal for loop
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }
}
