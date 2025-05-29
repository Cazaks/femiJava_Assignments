import java.util.Arrays;
	public class FactorsOfInteger{
	
	public static int factorsOf(int number){
	

	int factor_counter = 0;
	for(int factors = 0; factors < number.length; factors++){

	if(number % factors == 0){
	values = number;
	factor_counter = factor_counter + 1;
	}
	}

	return factor_counter;


}

	
}

