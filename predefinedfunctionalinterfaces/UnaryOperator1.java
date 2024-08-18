package predefinedfunctionalinterfaces;

import java.util.function.IntUnaryOperator;


public class UnaryOperator1 
{
    public static void main(String[] args) 
    {
        // if input and output type is same then we should go for unary operator
        IntUnaryOperator f1 = i -> i*i;
        System.out.println();
        System.out.println(f1.applyAsInt(2));
        
    }

}
