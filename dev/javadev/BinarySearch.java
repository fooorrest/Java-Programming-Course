import java.util.Arrays; 

public class binarysearch { 

public static void main(String[] args) 
{ 
  double[] lengths = {-3, 10, 5, 24, 45.3, 10.5}; 
  Arrays.sort(lengths); 
  System.out.println("Where is 45.3 in the list? I'll tell you! It's the following number! : " + Arrays.binarySearch(lengths, 45.3)); 
  } 
}