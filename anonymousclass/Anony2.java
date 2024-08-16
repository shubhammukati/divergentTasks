package anonymousclass;

interface Checker
{
    public void checkerMethodOne();
    public void checkerMethodTwo();
}

public class Anony2 {

    public static Checker formethodOneAndTwo = new Checker()
    {
        public void checkerMethodOne()
        {
            System.out.println("From checker method one");
        }

        public void checkerMethodTwo()
        {
            System.out.println("from checker method two");
        }
    };

    public static void main(String[] args) 
    {
        formethodOneAndTwo.checkerMethodOne();
        formethodOneAndTwo.checkerMethodTwo();
    }

}
