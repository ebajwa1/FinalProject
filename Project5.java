import java.util.Scanner;  
/**
 * Write a description of class Project5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project5
{
  public static void main(String[] args)
  {
    //Scanner class
    Scanner sc = new Scanner(System.in);
    //Asks user to enter amount of money they have
    System.out.println("Enter balance");
    double Balance = sc.nextDouble();
    //Asks user if they want to continue or exit
    System.out.println("Do you want to continue or exit (Enter: true to continue or false to exit)");
    boolean willContinue = sc.nextBoolean();
    //conditional Statement (While loop)
     while(willContinue == true)  
    {  
        //Asks user which action they want to do (input and output statements)
            System.out.println("Welcome to ATM");  
            System.out.println("1 for Withdraw");  
            System.out.println("2 for Deposit");  
            System.out.println("3 for Check Balance");  
            System.out.println("4 to exit");  
            System.out.println(" Choose an option from 1 through 4   ");  
            int option = sc.nextInt();  
        //if statement
        //if user enters 1 they have to enter an amount to withdraw then the method is called to subract is from the balance
            if(option == 1){
            System.out.println( " Enter amount of money you want to withdraw. ");  
            double withdraw = sc.nextDouble(); 
            ATM w = new ATM();
            w.setWithdraw(withdraw);
            System.out.println( " Your balance is now "+w.withdrawMoney(Balance, withdraw));
            Balance = (w.withdrawMoney(Balance, withdraw));
            }
        ///if user enters 2 they have to enter an amount to deposit then the method is called to add it to the balance
            else if(option == 2){
            System.out.print( " Enter amount of money you want to deposit. ");  
            double deposit = sc.nextDouble(); 
            ATM d = new ATM();
            d.setWithdraw(deposit);
            System.out.println( " Your balance is now "+ d.depositMoney(Balance, deposit));
            Balance = (d.depositMoney(Balance, deposit));
            }
        //if user enters 3 method is called to print balance   
            else if(option == 3){
            System.out.print(" Your balance is ");  
            ATM cB = new ATM();
            System.out.println(cB.checkMoney(Balance));  
            
            }
        //if user enters 4 the program executes and prints thank you statement
            if(option != 4){
            willContinue = true;
        }
        else{
            willContinue = false;
            System.out.println("Thank you for using this ATM."); 
        }
        //I wasn't sure where to include the try-catch block
        }
  }
}

