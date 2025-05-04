public class multipleOfNumbers{

public static int findMultiple(int number){
	return number * 5;
}
	
	public static void displayPrimeNumbers() {

	
	for(int i =2; ;i++){
	int prime = 0; 
	int count = 0;

	for(int j = 1; j <=i; i++){
	if(i % j == 0){
	count++
	}
	
	if(count == 2){
	System.out.print(i + j " ");
	 count ++
	 prime++
	}

	if(prime == 50){
	break;
	}
	}	
	}
}
}