import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
	System.out.println("Enter 2 Numbers ");
	Scanner sc=new Scanner(System.in);
	int fno=sc.nextInt();	
	int sno=sc.nextInt();
	System.out.println("Enter your choice \n 1 for Addition \n 2 for Subtractaion \n 3 for Multiplication \n 4 for Division ");
	int choice=sc.nextInt();
	int result=0;
	
	switch(choice){
	case 1:
	result=fno+sno;
	break;
	case 2:	
	result=fno-sno;
	break;
	case 3:	
	result=fno*sno;
	break; 
        case 4:	
	result=fno/sno;
	break;

 	default:
        System.out.println("Enter Correct Choice ");
	}

        System.out.println("Your Result is "+result);

    }
}
