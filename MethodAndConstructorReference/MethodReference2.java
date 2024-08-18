package MethodAndConstructorReference;

interface Bucket
{
    public void add(int a, int b);
    
}

public class MethodReference2 
{
    public static void sum(int a,int b)
    {
        System.out.println("The sum of both the elements is :- "+(a+b));
    }
    public static void main(String[] args) 
    {
        Bucket bucket = MethodReference2::sum;
        bucket.add(10, 20);
        
    }
}
