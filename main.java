// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args){
        int a=78;
        long b=73;
        //widening - small to long
        long c=a;
        //narrowing --large to small
        //int d=b; --error
        int d=(int) b;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

    }
        

}
