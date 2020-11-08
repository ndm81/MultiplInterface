interface Firstinterface{
    void myMethod();
}

interface Secondinterface{
    void myMethod1();
}

class Myclass implements Firstinterface,Secondinterface{
    public void myMethod(){System.out.println("This is my First Interface Method");}

    public void myMethod1(){
        System.out.println("This is my Second Interface Metohd");
    }}

    class Main{
        public static void main(String[] args) {
            Myclass obj=new Myclass();
                           obj.myMethod();
                           obj.myMethod1();
        }
    }