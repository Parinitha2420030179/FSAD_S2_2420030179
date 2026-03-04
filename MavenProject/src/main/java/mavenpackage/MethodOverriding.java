package mavenpackage;

class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bank bank;

        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate() + "%");

        bank = new HDFC();
        System.out.println("HDFC Interest Rate: " + bank.getInterestRate() + "%");
    }
}






