/*
program : proform arithmetic operation
@aouther : Anikesh Chouhan
@Date : 20 oct 2022
*/

//power Calculation
static void power(float num) 
	{
		float sum;
		
		sum = num*num;
		
		System.out.println("power of the number is : " +sum);
	}
	calcuCalculation
	static void calculator(float num)  /// calculator Calculation
	{
		float sum;
		
		sum = (num*num)*num;
		
		System.out.println("calculator of the number is : " +sum);
	}
			
	public static void main(String args[])  
	{
		Scanner sc = new Scanner(System.in);
		
		// Declaring variables   
		float num;
		int choice;
		 
		
		System.out.println("Enter the number: ");   // input
		num = sc.nextFloat();
		
		System.out.println(" Type 1 for power ");
		System.out.println(" Type 2 for calculator ");
		System.out.println(" Type 3 to exit ");
		System.out.println(" Enter your choice ");
		
		choice = sc.nextInt();
		
		switch(choice)   
		{
			case 1 : power(num);
			break;
			case 2 : calculator(num);
			break;
			case 3 : System.exit(0);
			break;
			default : System.out.println("Wrong Input");
			
		}  // End of switch 
	}  // end of main
}  // end of class
}
