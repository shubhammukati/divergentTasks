package defaultMethods;


interface DefaultInterface 
{
    public void m1();
    public void m2();
    default void m3(){}
    
}

class DefaultClass1 implements DefaultInterface
{
    public void m1(){}
    public void m2(){}
    public void m3(){System.out.println("default method");}
}

public class Default1 
{
    public static void main(String[] args) {
        DefaultClass1 d = new DefaultClass1();
        d.m3();
    }

}
