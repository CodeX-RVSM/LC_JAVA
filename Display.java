class Display{
    public static void insert(int a[],int val,int index){
        a[index]=val;
    }
    public static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String arrs[]){
        int arr[]={1,2,3,4,5,6};
        
        System.out.println("After Insertion :");
        display(arr);
        insert(arr,99,1);
        
        
    }
}


