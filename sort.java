import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        //Array sort - Without using inbuilt function
        // int arr[]={2,3,1,5,6,4};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

        //using inbuilt function
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
