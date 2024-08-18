package MethodAndConstructorReference;

class Sample1
{
    Sample1(String s){System.out.println("Hello "+s);}
}

interface Helper1
{
    public Sample1 m1(String s);
}

public class ConstructorReference2 
{
    public static void main(String[] args) 
    {
        Helper1 helper = Sample1::new;
        Sample1 s1 = helper.m1("Nidhi");
        System.out.println(s1);
        
    }
}
