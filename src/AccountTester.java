//APCS2020
//        Upcoming
//        Woohoo, no work due soon!
//        View all
//
//        Share something with your class…
//        Assignment
//        LORI REUBENSTEIN posted a new assignment: Bank Account
//        Posted 10:30 AM
//        Assigned
//
//        Account.java
//        Java
//
//        AccountTester.java
//        Java
//
//        CheckingAccount.java
//        Java
//
//        Bank Account.docx
//        Word
//
//
//        Announcement: "I will be available after school on…"
//        LORI REUBENSTEIN
//        Created Feb 25Feb 25
//        I will be available after school on Wednesday 2/26 in B424
//
//        Assignment
//        LORI REUBENSTEIN posted a new assignment: AP Classroom - Inheritance MCQs
//        Posted Feb 24
//        Assigned
//
//        Assignment
//        LORI REUBENSTEIN posted a new assignment: Inheritance problems set - Code Step by Step
//        Posted Feb 14
//        Assigned
//
//        Material
//        LORI REUBENSTEIN posted a new material: Inheritance notes and sample code
//        Posted Feb 12
//
//        Ch11.ppt
//        PowerPoint
//
//        ClericalStaff.java
//        Java
//
//        FacultyMember.java
//        Java
//
//        StaffMember.java
//        Java
//
//        StaffTester.java
//        Java
//
//        Completed Assignment
//        LORI REUBENSTEIN posted a new assignment: Password Generator
//        Posted Feb 11 (Edited Feb 12)
//        Turned in
//        On AP Classroom there is a FRQ assigned to you. I want you to implement the PasswordGenerator class. Make sure that it works for all of the examples given
//
//        Assignment
//        LORI REUBENSTEIN posted a new assignment: Unit 5 MC questions part A and B - AP Classroom site
//        Due Feb 10
//        Posted Feb 7
//        Missing
//        Due at the beginning of class on Monday
//
//        Completed Assignment
//        LORI REUBENSTEIN posted a new assignment: Complex and Soccer Team classes
//        Due Feb 12
//        Posted Feb 7 (Edited Feb 20)
//        Turned in
//        exercises 17 and 22
//
//        complex and soccerteam.pdf
//        PDF
//
//
//        Announcement: "directions for snack bar from book"
//        LORI REUBENSTEIN
//        Created Feb 5Feb 5
//        directions for snack bar from book
//
//        snack-bar1.jpg
//        Image
//
//        snack-bar2.jpg
//        Image
//
//        snack-bar3.jpg
//        Image
//
//        snack-bar4.jpg
//        Image
//
//        snack-bar-static.jpg
//        Image
//
//        Completed Assignment
//        LORI REUBENSTEIN posted a new assignment: Snack Bar
//        Due Feb 7
//        Posted Feb 5 (Edited Feb 7)
//        Turned in
//        Directions on p 241 of your book
//
//        coin.gif
//        Image
//
//        SnackBar.jar
//        Unknown File
//
//        SnackBar.java
//        Java
//
//        VendingMachine.java
//        Java
//
//        Vendor.java
//        Java
//
//
//public class AccountTester {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        // Create a checking account
//        CheckingAccount ca = new CheckingAccount(1233, 567.50, 2.0);
//        System.out.println("Checking account " + ca.currentBalance());
//        ca.clearCheck(250.0);
//        ca.deposit(50.0);
//        System.out.println("365.5 " + ca.currentBalance());
//
//        SavingsAccount sa = new SavingsAccount(1234, 300.0, .04);
//        System.out.println("Savings account " + sa.currentBalance());
//        sa.deposit(50.0);
//        sa.withdraw(600.0);
//        sa.withdraw(100.0);
//        System.out.println("250.0 " +sa.currentBalance());
//
//        SpecialCheckingAccount sca1 = new SpecialCheckingAccount(1235, 350.0, 2.5, 0.05, 500.0);
//        System.out.println("Special Account " + sca1.currentBalance());
//        sca1.clearCheck(200.0);
//        sca1.deposit(100);
//        System.out.println("247.5 " + sca1.currentBalance());
//
//        SpecialCheckingAccount sca2 = new SpecialCheckingAccount(1236, 850.0, 2.5, .05, 400.0);
//        System.out.println("Special Account " + sca2.currentBalance());
//        sca2.clearCheck(200.0);
//        sca2.deposit(245.0);
//        System.out.println("895.0 " + sca2.currentBalance());
//
//        Account [] accounts = {ca, sa, sca1, sca2};
//        for(Account a: accounts){
//            System.out.println("Account " + a.idNumber());
//            System.out.println("Balance " + a.currentBalance());
//            System.out.println("Interest " + a.monthlyInterest());
//        }
//        System.out.println("Interest: 1.0, .833, 1.0, 3.73");
//
//    }
//
//}