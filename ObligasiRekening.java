public class ObligasiRekening {
    
     public String name;
        public double balance, rate;
        public int term, monthsRemaining;

        public void setTermAndRate(int t){

        if (t>=0 && t<12){
            rate = 0.005; 
            if(t>=12 && t<24)
            rate = 0.010;
            else if(t>=24 && t<36)
            rate = 0.015;
            else if(t>=36 && t<48)
            rate = 0.020;
            else if(t>=48 && t<=60)
            rate = 0.025;
            else{
            System.out.println("Invalid Term");
            t = 0;

            
            if(monthsRemaining > 0){
balance += balance * rate / 12;
monthsRemaining--;
System.out.println("Balance: $" +balance);
System.out.println("Rate: " +rate);
System.out.println("Months Remaining: "
+ monthsRemaining);

}
            else{
            System.out.println("Bond Matured");
            }//endif
            }//end method earnInterest
            }//end class Bond

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public int getTerm() {
            return term;
        }

        public void setTerm(int term) {
            this.term = term;
        }

        public int getMonthsRemaining() {
            return monthsRemaining;
        }

        public void setMonthsRemaining(int monthsRemaining) {
            this.monthsRemaining = monthsRemaining;
        }
    }

