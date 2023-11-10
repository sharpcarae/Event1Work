package lab07;
import java.util.Arrays;
public class lab7 {
	public void sort() {
		
	}
public void start() {

	int[] numbers = {1,3,-5,7,0,4,6,8};
	int sum = 0;
	
	for (int i = 0; i < numbers.length; i++) {
		sum += numbers[i];
		
	}
	for (int i = 0; i < numbers.length; i++) {
		
	}
	System.out.println("Sum of all the elements in the array is: "+ sum);		
	int average = sum/numbers.length;
	System.out.println("Average of the elements in the array is: " + average);
	Arrays.sort(numbers);
	System.out.println("The minimum number is :" +numbers[0]);
	System.out.println("The maximum number is :" + numbers[numbers.length - 1] );	
	int element = 0;
	int index  = 0;
	int i = 0;
	while (i < numbers.length) {
		if (numbers[i] == element) {
			index = i;
			break;
		}
		i++;
	}
	System.out.println("The index of 0 is: " + index);
		

		
		
	}
	}
	


	