//Hala jebreel
//1210606
//lab section 5
import java.util.Scanner;

public class Equation {
	public static boolean isBalanced() {
		int r = 0, x;
		Scanner getVal = new Scanner(System.in);
		System.out.println("enter the number to cheak if it is balanced  or not");//ask usre to enter a number to check if balanced or not
		x = getVal.nextInt();
		if (x == -1) { // if the number is -1 exit
			System.exit(0);
		}

		int odd = 0;
		int even = 0;
		while (x > 0) {
			int rem = x % 10;
			if (rem % 2 == 0 && r != rem) {
				even += rem;
			} else if (rem % 2 != 0 && r != rem) {
				odd += rem;
			}
			x /= 10;
			rem = r;
		}
		if (odd == even) {// if even number =odd number is balanced
			System.out.println("the number is balanced or valide");//if even==odd is balanced
			return true;
		} else {
			System.out.println("the number is not balanced or not valide");// if even !=odd print not balanced
			return false;
		}

	}
	public static double solveEquation(double al, double bl, double cl, double xl) {
		Scanner so = new Scanner(System.in);
		System.out.println("enter the value of a , b , c and x");// ask user to enter a value of a b c x for equation
		al = so.nextDouble();// read from user a
		bl = so.nextDouble();// read from user b
		cl = so.nextDouble();// read from user c
		xl = so.nextDouble();// read from user x
		double myEq = al * Math.pow(xl, 2) + bl * xl + cl;// calculation
		System.out.println("the value is : " + myEq);// print the result
		return myEq;// return myEq

	}

	public static void findEquationRoot() {
		Scanner sr = new Scanner(System.in);
		System.out.println("enter the value of t ");// ask user to enter the value of t
		double tl = sr.nextDouble();
		System.out.println("enter the value of y ");// ask user to enter the value of y
		double yl = sr.nextDouble();
		System.out.println("enter the value of u");// ask user to enter the value of u
		double ul = sr.nextDouble();
		double root;
		root = yl * yl - 4 * tl * ul;// equation of the root
		if (root > 0) {
			double r1 = (-yl + Math.pow(root, 0.5)) / (2.0 * tl); // if the root greater than zero you should find 2 roots
			double r2 = (-yl - Math.pow(root, 0.5)) / (2.0 * tl);
			System.out.println("The roots are " + r1 + "and " + r2); // print the  two roots
		} else if (root == 0) {
			double r1 = -yl / (2.0 * tl); // if the root is zero print 1 root
			System.out.println("The root is: " + r1);
		} else {
			System.out.println("roots are not real"); // else there is no root
		}
		

	}



	public static void combineEquations() {
		Scanner com = new Scanner(System.in);
		System.out.println(
				"please enter the valuse of a , b and c for the first equation \n and  enter the valuse of a1,b2 and c3 for the second equation");
		double a0, b0, c0, a1, b1, c1;
		a0 = com.nextDouble();// read from user a to the first equation
		b0 = com.nextDouble();// read from user b to the first equation
		c0 = com.nextDouble();// read from user c to the first equation
		a1 = com.nextDouble();// read from user a to the second equation
		b1 = com.nextDouble();// read from user b to the second equation
		c1 = com.nextDouble();// read from user c to the second equation
		System.out.println(a0 + a1 + "x2 +" + (b0 + b1) + "x +" + (c0 + c1));// print the result
		

	}

}

