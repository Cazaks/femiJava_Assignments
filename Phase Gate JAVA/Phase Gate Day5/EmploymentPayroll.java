import java.util.Scanner;
public class EmploymentPayroll{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

	boolean employeePayRoll = true;
		while(employeePayRoll){

	String payroll = """
	welcome to semicolon Emplayment payroll
	========================================
	press:
	1 - Add Employee payroll
	2 - View Employee payroll
	3 - update Employee payroll
	4 - Exit
	""";

		String employ = """
		Sellect
		1 - Input 1
		2 - Input 2
		3 - input 3
		""";

			String inpt2  = """
			Sellect
			1 - Input 1
			2 - Input 2
			0 - Exixt imput select
			""";

System.out.println(payroll);
System.out.println("Select options: ");
int menuSelect = input.nextInt();

switch(menuSelect){
		case 1->{
		boolean employeeOperation = true;
	while(employeeOperation){

		System.out.println("Enter Employee name: ");
		String employeeName = input.next();
		System.out.println("Enter number of hours worked in a week: ");
		double weeklyWork = input.nextDouble();
		
		System.out.println("Enter hourly pay rate: ");
		double hourlyWork = input.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double fedTax = input.nextDouble();
		System.out.println("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();

		System.out.print("Employ added ===============>");

			
		System.out.println(inpt2);
		System.out.println("Select input 2: ");
		int inputSelect = input.nextInt();

		switch(inputSelect){
				case 1->{
				boolean inputSelectOperation1 = true;
			while(inputSelectOperation1){
				System.out.println("Enter Employee name: ");
				String employeeName2 = input.next();
				if(employeeName2 == employeeName){
				System.out.println("Name alread exixt");
				continue;
				}
				
				int selectInput = input.nextInt();
			switch(selectInput){
				case 0 -> inputSelectOperation1 = false;
				//default-> System.out.println("Thanks for continuing.");
					}
				}
				break;
				}
				
				case 2->{
				boolean inputSelectOperation2 = true;
			while(inputSelectOperation2){
				System.out.println("Enter Employee name: ");
				String employeeName2 = input.next();
				System.out.println("Enter number of hours worked in a week: ");
				double weeklyWorkhours = input.nextDouble();
				System.out.println("Enter maximum number of hours worked in a week: ");
				double maxWeeklyHours = input.nextDouble();
				maxWeeklyHours = 160;

				if(weeklyWorkhours == maxWeeklyHours || weeklyWorkhours == 200){
				System.out.println("Mumu, I too know. Na only you get 200hrs.");
				continue;
				}
					//String contn = """
					//Do you wish to conitue?
					
				System.out.println("Do you wish to continue?");

				int selectInput2 = input.nextInt();
			switch(selectInput2){
				case 0 -> inputSelectOperation2 = false;
				//default-> System.out.println("Thanks for continuing.");
					}
				}
				break;
				}
		
		}
	}

		/*case 2->{
			boolean employeeViewOperation = true;
		while(employeeViewOperation){ 
			
			System.out.println("Enter Employee name: ");
			String employeeName = input.next();
			System.out.println("Enter hourly pay rate: ");
			double hourlyWork3 = input.nextDouble();
			System.out.println("Enter pay rate: ");
			double payRate = input.nextDouble();
			System.out.println("Enter gross pay: ");
			double grossPay = input.nextDouble();
			System.out.println("Enter federal tax withholding rate: ");
			double fedTax3 = input.nextDouble();
			System.out.println("Enter state tax withholding rate: ");
			double stateTax3 = input.nextDouble();

			double grossPay = hourlyWork * payRate;
			double fedwithholdingRate = grossPay / 100 * fedTax3;
			double stateWithholdingRate = grossPay / 100 * stateTax3;		
}

}*/
}


	}
}

}
}

