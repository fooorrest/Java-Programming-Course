public class Myfirstsortingprogram
{ 

public static void main(String[] args) { 

int[] myfirstarray = { 16, 100, 205, 8, 1, 3, 2, 5, 7, 6, 15, 10, 14 }; 

bubbleSort(myfirstarray); 

for (int value : firstarray) 
{ 
	System.out.printf("%1$d, ", value); 
} 

System.out.println(); 
} 

public static void bubbleSort(int[] array) { 
	for (int i = 0; i < array.length - 1; i++) 
	{ 

		if (array[i] > array[i+1]) { 

			int temp = array[i]; 

			array[i] = array[i+1]; 

			array[i+1] = temp; 

			i=0;  }
		}
	}
}
