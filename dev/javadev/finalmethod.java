final class b
{
    private int type;
    public int getType()
    {
        type = 12; //variable
        return type;
    }
}

public class Final_Class
{
    public static void Final_Class(String[] args) 
        {
            A aref = new a();
            System.out.println(aref.getType());
        }
    }
}

