
/**
 * Write a description of class ATM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//2nd class
public class ATM
{
  //Class field for ATM
  private double Balance;
  private double withdraw;
  private double deposit;
  private double check_Balance;
  //Default constructor for ATM
    public ATM ()
  {
      Balance = -1;
      this.withdraw = -1;
      this.deposit = -1;
      this.check_Balance = -1;
  }
  //non default constructor for ATM
  public ATM (double withdraw, double deposit, double check_Balance)
  {
      this.Balance = check_Balance;
      this.withdraw = withdraw;
      this.deposit = deposit;
      this.check_Balance = check_Balance; 
  }
  //returns amount balance
  public double getbalance() {
    return Balance;
  }
  //sets balance
  public void setbalance(double b)
  {
      Balance = b;
  }
  //returns amount you want to withdraw
  public double getWithdraw() {
    return withdraw;
  }
  //sets amount of money you want to withdraw
  public void setWithdraw(double w)
  {
      withdraw = w;
  }
  //returns amount you want to deposit
  public double getDeposit() {
    return deposit;
  }
  //sets amount of money you want to deposit
  public void setDeposit(double d)
  {
      deposit = d;
  }
  //returns balance
  public double getcheck_Balance() {
    return check_Balance;
  }
  //sets balance
  public void setcheck_Balance(double cB)
  {
      check_Balance = cB;
  }
    /**
    * This method returns the subtraction of balance and withdraw
    *
    * @param    b, w          numbers to subtract
    * @return   subraction of numbers
    */ 
    public static double withdrawMoney(double b, double w){
    double subract = (b - w);
    return subract;
    }
  /**
    * This method returns the sum of balance and deposit
    *
    * @param    b, d         numbers to add
    * @return   sum of numbers
    */ 
    public static double depositMoney(double b, double d){
       double sum = (b + d);
       return sum;
    }
  /**
    * This method returns the balance
    *
    * @param    b,          balance requested
    * @return   balance
    */ 
    public static double checkMoney(double b){
       return b;
    }
}
