import java.util.Arrays;
import java.util.Scanner;

	public class SemicolonAssessment{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
String questions = """
	select the number of question you want to answer		
		press:
		1 - Question one
		2 - Question two
		3 - Question three
		4 - Question four
		5 - Question five
		6 - Question six
		7 - Question seven
		8 - Question eight
		9 - Question nine
		10 - Question ten
		0 - Exit
	""";
	System.out.print(questions);
	System.out.println("Select question");
	int questionSelection = scan.nextInt();
		
	switch(questionSelection){
		case 1->{
			boolean questionOne = true;
		while(questionOne){
			System.out.println("How many continents do we have in the world?: "); 
			System.out.println("options: 7, 3, 10, 10 ");
			int answer1 = scan.nextInt();
			int a = 3;
			int b = 7;
			int c = 10;
			int d = 12;
		
			if(answer1 == 7){
			System.out.println("Correct");
			break;
			}
			else
			if(answer1 != 7){
			System.out.println("Wrong");
			System.out.println("You have one chance to try again");
			System.out.println("How many continents do we have in the world?: ");
			answer1 = scan.nextInt();
			}
		}
		}
		
		case 2->{
			boolean questionTwo = true;
		while(questionTwo){
			System.out.println("What is the Capital of Nigeria?: "); 
			System.out.println("options: This numbers represent the states options 10=Imo, 7=Enugu, 5=Abuja, 12=Lagos: ");
			int answer2 = scan.nextInt();
			int Imo = 10;
			int Enugu = 7;
			int Abuja = 5;
			int Lagos = 12;
		
			if(answer2 == 5){
			System.out.println("Correct");
			break;
			}
			else
			if(answer2 != 5){
			System.out.println("Wrong");
			System.out.println("You have one chance to try again");
			answer2 = scan.nextInt();
			System.out.println("You failed, bye ");
			
			}
		}
		}

		case 3->{
			boolean questionThree = true;
		while(questionThree){
			System.out.println("What is 17 - 9: "); 
			System.out.println("options: 8, 4, 7, 3: ");
			int answer3 = scan.nextInt();
			int opt1 = 8;
			int opt2 = 4;
			int opt3 = 7;
			int opt4 = 3;
		
			if(answer3 == 8){
			System.out.println("Correct");
			break;
			}
			else
			if(answer3 != 8){
			System.out.println("Wrong");
			System.out.println("You have one chance to try again");
			answer3 = scan.nextInt();
			System.out.println("You failed, bye ");
			break;
			}
		}
		}

		case 4->{
			boolean questionFour = true;
		while(questionFour){
			System.out.println("How many classes of food do we have?: "); 
			System.out.println("options: 10, 5, 7, 6: ");
			int answer4 = scan.nextInt();
			int opta = 10;
			int optb = 5;
			int optc = 7;
			int optd = 6;
		
			if(answer4 == 6){
			System.out.println("Correct");
			break;
			}
			else
			if(answer4 != 6){
			System.out.println("Wrong");
			System.out.println("You have one chance to try again");
			answer4 = scan.nextInt();
			System.out.println("You failed, bye ");
			break;
			}
		}
		break;
		}
		case 5->{
			boolean questionFive = true;
		while(questionFive){
			System.out.println("Whos is the President of Nigeria?: "); 
			System.out.println("options: 1=President Amed Tinubu, 2=Trump, 3Obasenjo, 4Jonnathan: ");
			int answer5 = scan.nextInt();
			int opte = 1;
			int optf = 2;
			int optg = 3;
			int opth = 5;
		
			if(answer5 == 1){
			System.out.println("Correct");
			break;
			}
			else
			if(answer5 != 1){
			System.out.println("Wrong");
			System.out.println("You have one chance to try again");
			answer5 = scan.nextInt();
			System.out.println("You failed, bye ");
			break;
			}
		}
		break;
		}
		case 6->{
			boolean questionSix = true;
		while(questionSix){
			System.out.println("How many programming languges do we have?: "); 
			System.out.println("options: 10, 5=many, 7, 6: ");
			int answer6 = scan.nextInt();
			int opti = 7;
			int optj = 5;
			int optk = 10;
			int optl = 6;
		
			if(answer6 == 5){
			System.out.println("Correct");
			break;
			}
			else
			if(answer6 != 6){
			System.out.println("Wrong");
			System.out.println("You have one chance to try again");
			answer6 = scan.nextInt();
			System.out.println("You failed, bye ");
			break;
			}
		}
		
		}
		case 7->{
			boolean questionSeven = true;
		while(questionSeven){
			System.out.println("Who is the immediate past governor of Cross River?: "); 
			System.out.println("options: 1=Adam Osemole, 2=Donal Duke, 3=Ben Ayade, 4=Prince Otu: ");
			int answer7 = scan.nextInt();
			int optm = 1;
			int optn = 2;
			int opto = 3;
			int optp = 4;
		
			if(answer7 == 3){
			System.out.println("Correct");
			break;
			}
			else
			if(answer7 != 3){
			System.out.println("Wrong");
			System.out.println("You have one chance to try again");
			answer7 = scan.nextInt();
			System.out.println("You failed, bye ");
			break;
			}
		}
		}
	
		case 8->{
			boolean questionEight = true;
		while(questionEight){
			System.out.println("How many states are in Nigeria?: "); 
			System.out.println("options: 36, 70, 10, 6: ");
			int answer8 = scan.nextInt();
			int opt36 = 36;
			int optsta70 = 70;
			int optstate10 = 10;
			int optstat6e = 6;
		
			if(answer8 == 36){
			System.out.println("Correct");
			break;
			}
			else
			if(answer8 != 36){
			System.out.println("Wrong");
			System.out.println("You have one chance to try again");
			answer8 = scan.nextInt();
			System.out.println("You failed, bye ");
			break;
			}
		}
		}
		case 9->{
			boolean questionNine = true;
		while(questionNine){
			System.out.println("Donal Trump is the presisent of which country?: "); 
			System.out.println("options: 1=Nigeria, 2=United State, 3=Angola, 4Ghana: ");
			int answer9 = scan.nextInt();
			int optconnig = 10;
			int optconusa = 5;
			int optconang = 7;
			int optcongah = 6;
		
			if(answer9 == 2){
			System.out.println("Correct");
			break;
			}
			else
			if(answer9 != 2){
			System.out.println("Wrong");
			System.out.println("You have one chance to try again");
			answer9 = scan.nextInt();
			System.out.println("You failed, bye ");
			break;
			}
		}
		
		}
		case 10->{
			boolean questionTen = true;
		while(questionTen){
			System.out.println("The following are contries in the world except: "); 
			System.out.println("options: 1=Enugu, 2=China, 3=Nigeria, 4=Italy: ");
			int answer10 = scan.nextInt();
			int opta = 1;
			int optb = 2;
			int optc = 3;
			int optd = 4;
		
			if(answer10 == 1){
			System.out.println("Correct");
			break;
			}
			else
			if(answer10 != 1){
			System.out.println("Wrong");
			System.out.println("You have one chance to try again");
			answer10 = scan.nextInt();
			System.out.println("You failed, bye ");
			break;
			}
		}
		break;
		}
	
		}	
		


	//System.out.print("Choose from question 1 - 10")

	//System.out.print("How many continent are in the world? choose")

	//System.out.print("What is the capital of Nigeria?")
}
}