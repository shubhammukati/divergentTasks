package MethodAndConstructorReference;

class Sample
{
    Sample(){System.out.println("Sample class constructor Executing ");}
}

interface Helper
{
    public Sample get();
}

public class ConstructorReference1 
{
    public static void main(String[] args) 
    {
        Helper helper = Sample::new;
        Sample s1 = helper.get();
        Sample s2 = helper.get();
        Sample s3 = helper.get();
        Sample s4 = helper.get();
        System.out.println(s3);
        System.out.println(s1);
        System.out.println(s4);
        System.out.println(s2);
        
    }

}
