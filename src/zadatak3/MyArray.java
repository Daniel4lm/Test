package zadatak3;

public class MyArray {
	
	int[] array;
	
	public MyArray(int[] array) {
		this.array = array;
	}
	
	int getSmallestElement() {
		
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}		
		return min;
	}
	
	int getLargestElement() {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}		
		return max;
	}
	
	int sumAllElements() {
		int sum = 0;
		for(int i = 1; i < array.length; i++) {
			sum += array[i];
		}		
		return sum;
	}
	
	void printAllElements() {
		
		for(int i = 1; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}		
	}

}
