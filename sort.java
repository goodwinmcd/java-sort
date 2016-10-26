import java.util.Random;

class sortClass{
	
	private int[] array;

	public sortClass(int[] arrayP){
		array = arrayP;
	}

	public void insertionSort(){
		int currentNum = array[0];
		int nextNum = array[0];
		int temp;
		for(int i=0; i<array.length; i++){
			for(int j=i; j<array.length; j++){
				currentNum = array[i];
				nextNum = array[j];
				if(nextNum < currentNum){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public void bubbleSort(){
		int temp;
		for(int i=0; i<array.length; i++){
			for (int j=0; j<array.length - i - 1; j++){
				if(array[j]>array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	public void printArray(){
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
}

public class sort{
	public static void main(String[] args){
		int[] array = new int[20];
		Random randomGen = new Random();
		for (int i=0; i<20; i++){
			array[i]=randomGen.nextInt(1000);
		}
		sortClass myClass = new sortClass(array);
		myClass.printArray();
		myClass.bubbleSort();
		myClass.printArray();
	}
}
