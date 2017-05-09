/**
 * Created by Sameer on 5/9/2017.
 */
public class javapractice {
    public void  m1()
    {
    //    boolean b=false;
        if(!m2())
        {
            System.out.println("i am in if ");
        }else
        {
            System.out.println("i am in else");
        }

    }
    public static boolean m2()
    {
        System.out.println("hello");
        return true;
    }

    public static void main(String[] args) {
        javapractice j=new javapractice();
        j.m1();
    }
}
