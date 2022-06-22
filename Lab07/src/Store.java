import java.util.Scanner;

public class Store {
	
	/**
	 * Description: This class will simply call the corresponding class and get to read details from 
	 * it and then storing to an array of employee class. and then after all this just printing the values by calling printInfo method accordingly.
	 */
	
	protected Employee[] employees;
	protected boolean inputAgain = true;
	protected int m=0;

	public Store(int size) {
		this.employees = new Employee[size];
	}
	
	public void readDetails(Scanner input){
		//conditions to read the types of Employees
		if(this.m<employees.length){
			do {
				System.out.printf("Enter details of Employee: %d\n", (m+1));
				System.out.printf(
						"\t1. Regular\n" +
						"\t2. Contractor\n");
				System.out.print("Enter type of Employee: ");

				int value = input.nextInt();
				inputAgain= false;

				//if-else condition to determine whether the user is regular or Contractor.
				if(value == 1){
					//creating and initializing the regular class object and assigning it to array of referenced of Employee class
					employees[m] = new Regular(null, null, null, 0, 0, 0);
					employees[m].readInfo(input);


				}else
					if(value == 2){
					//creating and initializing the Contractor class object and assigning it to array of referenced of Employee class
					employees[m] = new Contractor(null, null, null, 0, 0, 0, 0);
					employees[m].readInfo(input);
				}
				
				
			}while(inputAgain == true);
			this.m++;
		}
			
	}
	
	// printing each object details using for loop
	public void printDetails(){
			for (int i = 0; i < this.m; i++) {
				employees[i].printInfo();
			}
	}
	
	//method to print lines.
		public static void printLine(){
			System.out.print("=");
		}

	//method to print the title and some lines
	public static void printTitle(String name){
		for (int i = 0; i <80;i++){printLine();}
		System.out.format("\n                       %s Store Management System\n", name);
		for (int i = 0; i <80;i++){printLine();}
		System.out.print("\nEmp#|                Name |          Email |        Phone |     Salary|\n");
		for (int i = 0; i <80;i++){printLine();}
		System.out.println();
	}
}
