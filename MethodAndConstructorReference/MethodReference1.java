package MethodAndConstructorReference;

public class MethodReference1 
{
    public static void m1()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public void m2()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Instance method Reference");
        }
    }

    public static void main(String[] args) 
    {
        // Runnable runnable = MethodReference1::m1; for static method
        MethodReference1 m = new MethodReference1();
        Runnable runnable2 = m::m2;
        Thread thread1 = new Thread(runnable2);
        thread1.start();

        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }

        
    }

}
