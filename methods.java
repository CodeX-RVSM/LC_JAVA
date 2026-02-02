class methods{
    public static void insert(int a[],int val,int index){
        a[index]=val;
    }
    public static void display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        display(arr);
        insert(arr,99,1);
        display(arr);
    }
}

