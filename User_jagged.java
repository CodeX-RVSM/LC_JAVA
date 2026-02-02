import java.util.*;

class User_jagged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // int jagged[][]={{1,2,3,4},{4,5,6,7,8},{9,0}};
        //1 2 3 4 
        //4 5 6 7 8 
        //9 0 
        // from user 
        // int jagged[][]={new int[4],new int[5],new int[2]};
        //0 0 0 0 
        //0 0 0 0 0
        //0 0

        System.out.println("Enter no of rows :");
        int row=sc.nextInt();

        int jagged[][]=new int[row][];
        //iteration all rows

        for(int i=0;i<row;i++){
            System.out.println("Enter col no for row no"+(i+1));
            jagged[i]=new int[sc.nextInt()];
            System.out.println("Enter values for cal now :");
            for(int j=0;j<jagged[i].length;j++){
                jagged[i][j]=sc.nextInt();
            }
            System.out.println("Value from Array :");

            for(int i=0;i<jagged.length;i++){
                for(int j=0;j<jagged[i].length;j++){
                    System.out.print(jagged[i][j]+"");

                }
                System.out.println();


            }
        }

    }
}
