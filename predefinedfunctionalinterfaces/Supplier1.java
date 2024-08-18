package predefinedfunctionalinterfaces;

import java.util.function.Supplier;
import java.lang.Math;


public class Supplier1 
{
    public static void main(String[] args) {
        Supplier<String> supplier = () -> 
        {
            String otp = "";
            for(int i=0;i<6;i++)
            {
                int digit = (int) (Math.random() * 10);
                otp += digit;
            }
            return otp;
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
