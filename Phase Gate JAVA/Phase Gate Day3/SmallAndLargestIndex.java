import java.util.Arrays;
	public class SmallAndLargestIndex{

	public static int smallestAndLargest(array){

		int largestElement = array[0];
		int indexCounter = 0;

	for(int count = 0; count < array.length; count++){
		if(array[count] > largestElement){
		largestElement = array[count];
		indexCounter = count;
		}

	}
	return indexCounter;

	public static main(String[] args){
		int[] array = {1, 2, 8, 20, 5};


		System.out.println(SmallAndLargestIndex.smallestAndLargest(array)));		


		

}
}

