import java.util.Scanner;
  class Main {
	public static void main(String[] args)
	 {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Username: ");
		String username =scan.next();
		
	
	System.out.println("Enter the Password: ");
		String password =scan.next();
		String s1="Java";
		String s2="Mava";
		String s3="Sql";
		String s4="Jsp";
		String s5="Spring";
		String s6="Qsp";
	if((username.equals(s1)) && (password.equals(s2)))
	{ 
	System.out.println("Welcome to the application!!!!");
	}
	
else if((username.equals(s3) ) && (password.equals(s4) ))
	{ 
	System.out.println("Welcome to the application!!!!");
	}
	
else if((username.equals(s5)) && (password.equals(s6)))
	{ 
	System.out.println("Welcome to the application!!!!");
	}
	else
		{
				System.out.println("Sorry...username and password are wrong...!!!");
	}
	
}
}