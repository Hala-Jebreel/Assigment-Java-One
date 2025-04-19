//Hala jebreel
//1210606
//lab section 5
import java.util.Scanner;


public class CheckEquation {
	public static void main(String[] args) {

		double xl = 0;
		double cl = 0;
		double bl = 0;
		double al = 0;
			Scanner in1=new Scanner( System.in);
			System.out.println("enter a name :");//ask user to enter the name
			String name=in1.nextLine();
			if (Equation.isBalanced()!=true) {//if the number is not balanced reenter balanced number
				System.out.println("enter a valid number:");//ask user to enter a valid number 
				int num=in1.nextInt();
			}
		
		
		while (true) {

			
			System.out.println("---------------------------------");
			System.out.println("1- find equation root.");
			System.out.println("2- solve equation.");
			System.out.println("3- combine Equations");
			System.out.println("4- exit .");
			System.out.println("---------------------------------");
			System.out.println(" enter a number from 1 to 4:");//ask user to enter a number from 1-4
			Scanner in =new Scanner(System.in);
			int c = in.nextInt();
			switch (c) {
			case 1:
				Equation.solveEquation(al, bl, cl, xl);// if enter 1 go to solveEquation
				break;
			case 2:
				Equation.findEquationRoot();//if enter 2 go to findEquationRoot
				break;
			case 3:
				Equation.combineEquations();//if enter 3 go to combineEquations 
				break;
			case 4:
				System.out.println("enter a new name  :");//reenter name
				String name1 =in1.nextLine();
				Equation.isBalanced();//go to balanced equation
				System.out.println("bye");//print by
				System.exit(0);//exit system
				break;
			default:
				System.out.println("error input is invalid you should enter a number from 1-4");
				//print an error message to enter a number from 1-4
			}
			
		}

	}
}

