public class finalmethod
{
    final int add(int x, int y)
    {
        int c = x + y;
        System.out.println("Answer: " + c);
        return c;
    }
    public int sampleMethod()
    {
        finalmethod obj = new finalmethod();
        obj.add(2, 3);
    }
}