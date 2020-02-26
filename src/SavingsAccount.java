public class SavingsAccount extends Account{
    public double currentBalance(){
        return super.currentBalance();
    }
    public double intrestRate(double x){
        return x;
    }
    public double monthlyIntrest(double x){
        double y = intrestRate(x);
        return currentBalance() * y;
    }
}
