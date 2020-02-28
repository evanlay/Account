public class SpecialCheckingAccount extends CheckingAccount{
    private double interest;
    private double minBal;
    public SpecialCheckingAccount(int idNum, double startBal,double cc, double rate, double minBal1){
        super(idNum,startBal,cc);
        interest = rate;
        minBal = minBal1;
    }
    public void clearCheck(double amount){
        if(super.currentBalance() > minBal){
            super.decreaseBalance(amount);
        }
        else{
            super.clearCheck(amount);
        }
    }
    public double monthlyInterest(){
        if(super.currentBalance() > minBal){
            return super.currentBalance() * interest / 12;
        }
        else{
            return super.monthlyInterest();
        }
    }
}
/*
Output
        Checking account 567.5
        365.5 365.5
        Savings account 300.0
        250.0 250.0
        Special Account 350.0
        247.5 247.5
        Special Account 850.0
        895.0 895.0
        Account 1233
        Balance 365.5
        Interest 1.0
        Account 1234
        Balance 250.0
        Interest 0.8333333333333334
        Account 1235
        Balance 247.5
        Interest 1.0
        Account 1236
        Balance 895.0
        Interest 3.7291666666666665
        Interest: 1.0, .833, 1.0, 3.73
*/