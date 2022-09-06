public class CarLoan {
    int CarLoan;
    int loanLength ;
    double interestRate;
    int downPayment;

    CarLoan (int CarLoan, int loanLength, double interestRate, int downPayment) {
        this.CarLoan = CarLoan;
        this.loanLength = loanLength;
        this.interestRate = interestRate;
        this.downPayment = downPayment;
        if (loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        }
        else if (downPayment > CarLoan) {
            System.out.println("The car be paid in full");
        } else {
            int remainingBalance = CarLoan - downPayment;
            int months = loanLength * 12;
            double monthlyBalance = remainingBalance / months;
            double interest = (monthlyBalance * interestRate) / 100;
            double monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }


    public static void main(String[] args) {
        CarLoan loan1 = new CarLoan(50000, 5, 2.74, 20000);
       // CarLoan loan2 = new CarLoan(10000, 3, 6, 12000);
        //System.out.println(loan1);


    }

    
}
