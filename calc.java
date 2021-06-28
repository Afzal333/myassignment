import java.util.Scanner;

class calculator{
	double a;
	double b;
	public calculator(double a,double b) {
		this.a=a;
		this.b=b;
	}
	
	double add() {
		return a+b;
	}
	double sub() {
		return a-b;
			}
	double mul() {
		return a*b;
			}
	double div() {
		return a/b;
			}
	
}
public class calc {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		double x = sc.nextDouble();
		System.out.print("Enter b : ");
		double y = sc.nextDouble();
		System.out.print("Enter the Operator (+,-,*,/): ");
		String op = sc.next();
		double c=0;
		calculator obj = new calculator(x,y);
		switch (op) {
		case "+":
		c=obj.add();	
			break;
		case "-":
			c=obj.sub();	
				break;
		case "*":
			c=obj.mul();	
				break;
		case "/":
			c=obj.div();	
				break;

		default:
			System.out.println("Invalid  Operator");
			break;
		}
		
		System.out.println(x + op +y+ "=" + c);
	}

}
