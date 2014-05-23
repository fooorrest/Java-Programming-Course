import java.util.Scanner;

public class isitsix
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Is the number 6?");
		int isitsix1 = input.nextInt();

		assert (isitsix1 > 5);
		assert (isitsix1 < 7);

		System.out.printf("You entered %d/n" , isitsix1);
	}
}