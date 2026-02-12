class Mobile{
    String cname;
    float displaySize;
    int memory;
    double price;
    String color;

    Mobile(String cname,float ds,int memory,double price,String color){
        this.cname=cname;
        this.displaySize=ds;
        this.memory=memory;
        this.price=price;
        this.color=color;
    }
    public void getInfo(){
        System.out.println("Cname :"+cname);
        System.out.println("Display Size :"+displaySize);
        System.out.println("Memory :"+memory);
        System.out.println("price :"+price);
        System.out.println("color :"+color);
        System.out.println("------------------");

    }
    public void call(){
        System.out.println("Calling");
    }

    public void msg(){
        System.out.println("Messaging");
    }

}
