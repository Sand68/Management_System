import java.util.Scanner;
public class Regular extends Employee {
	
	/**
	 * Description: This class will extend Employee class and let the user input salary with the help of Overridden readInfo() and will print values through Overridden printInfo
	 */
	
	
	protected double salary;

	public Regular(String firstName, String lastName, String email, long phoneNumber, int employeeNumber, double salary) {
		super(firstName, lastName, email, phoneNumber, employeeNumber);
		this.salary = salary;
	}
	
	//method to read input from user
	@Override
	public void readInfo(Scanner input) {
		super.readInfo(input);
		System.out.printf("Enter annual salary: ");
		double anualSalary = input.nextDouble();
		double monthlySalary = (anualSalary)/12;
		this.salary = Math.round(monthlySalary * 100.0) / 100.0;
	}
	
	//method to read input from user
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.format("   %.2f |\n",this.salary);
	}

}
