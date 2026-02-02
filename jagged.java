
class jagged {
    public static void main(String[] args) {
        
        int jagged[][]={{1,2,3,4},{4,5,6,7,8},{9,0}};
        //1 2 3 4 
        //4 5 6 7 8 
        //9 0 
        // from user 
        // int jagged[][]={new int[4],new int[5],new int[2]};
        //0 0 0 0 
        //0 0 0 0 0
        //0 0

        for(int i=0;i<jagged.length;i++){

            for(int j=0;j<jagged[i].length;j++){
                System.out.print(jagged[i][j]+" ");
            }
            System.out.println();
        }

    }
}
