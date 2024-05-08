class InvalidAge extends Exception
{
    int flag;
    InvalidAge(int age){
        flag = age;
    }
    public String String(){
        return "InvalidAgeException: "+flag;
    }
}

public class demo
{
    public static void main(String args[])
    {
        try
        {
            int age=12;
            if(age<18)
            {
                throw new InvalidAge(age);
            }
        }
        catch(InvalidAge e)
        {
          System.out.println("Inelligible to vote! " +e);
        }
    }
}
