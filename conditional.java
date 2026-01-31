import java.util.Scanner;


class conditional{
    public static void main(String[] args) {
        //if , if else, else if , ladder,switch
        //calculator
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Numbers :");
        float a=sc.nextInt();
        float b=sc.nextInt();

        System.out.println("Calculator");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter Your Choice");

        int Choice=sc.nextInt();

        // break  option in java ->

        switch (Choice) {
            case 1->System.out.println("Addition is :"+(a+b));
            case 2->System.out.println("Substraction is :"+(a-b));
            case 3->System.out.println("Multiplication is :"+(a*b));
            case 4->{
            if(b==0||a==0){
                System.out.println("cannot divide by zero");
            }else{
            System.out.println("Division is :"+(a/b));}}
            default->System.out.println("Invalid choice...");
        }
    }
}
