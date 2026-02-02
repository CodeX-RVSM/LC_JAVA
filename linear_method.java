import java.util.*;
public class linear_method {

    public static String lineaString(int arr[],int key){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=true;
                return flag;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={11,22,33,44,55,15};
        System.out.println("Enter a Key");
        int key =sc.nextInt();

        if(lineaString(arr, key)){
            System.out.println("key Found");
        }else{
            System.out.println("key not Found");
        }
        
        
    }
}

