public class SpecialCheckingAccount extends CheckingAccount{
    private double interest;
    private double minBal;
    public SpecialCheckingAccount(int idNum, double startBal,double cc, double rate, double minBal){
        super(idNum,startBal,cc);
    }
}
