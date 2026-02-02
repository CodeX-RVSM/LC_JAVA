public class members {
    static int a;

    public static void main(String[] args) {
        int a=10;

        System.out.println(a);
        // System.out.println(a);//always priority to local variable 
        System.out.println(members.a);

    }
}
