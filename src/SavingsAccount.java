public class SavingsAccount extends Account {
    private double interest;
    public SavingsAccount(int id, double startBal,double rate){
        super(id,startBal);
        interest = rate;
    }
    public void withdraw(double x) {
        if (x <= super.currentBalance()) {
            super.decreaseBalance(x);
        }
    }
    @Override
    public double monthlyInterest() {
        return (super.currentBalance() * interest) / 12;
    }
}