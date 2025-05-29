import java.util.Arrays;
public class MetrixRotate{

	public static int[][] arrayOfMetrix(int[][] array){
	
	//int[][] arrays = new int[1][3] [array.length][array.length]; 
	

		int arrayRotate = array;
		int rotateCountIndex = 0;		
		for(int count = 0; count < array.length; count++){
			array[rotateCountIndex][count] = array[rotateCountIndex][count] -1;
			for(int items = 0; items < array.length; items++){
				array[arrayRotate][items] = array[arrayRotate][items];
				if(arrayRotate > array[items]){
				arrayRotate = array[items];
				rotateCountIndex = items;
				}
			}
			
				if(rotateCountIndex != count){
				array[rotateCountIndex] = array[count];
				array[count] = arrayRotate;
				}
			

		}
		return array;


	}

public static void main(String[] args){
		int[][]array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		System.out.println("The rotate of the" + Arrays.deeptoString(arrayOfMetrix.arrayOfNumberSquare(array)));		

}
}