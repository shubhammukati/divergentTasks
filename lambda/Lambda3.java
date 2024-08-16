package lambda;

@FunctionalInterface
interface Shubham
{
    public void m1();
    // public void m2();

}

public class Lambda3  {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("object creation of Shubham interface");
        Thread.sleep(3000);
        System.out.println("object created");
        Thread.sleep(3000);
        Shubham s = ()->{
            System.out.println("Im m1 from shubham ");
        };
        System.out.println("calling shubham m1");
        Thread.sleep(3000);
        s.m1();

}
}
