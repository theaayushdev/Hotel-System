import java.util.Scanner;

class BankAccount {
    private static int accountCount = 0; // Tracking
    private final String accountNumber; // for Unique account number
    private String firstName; // Customers name
    private String lastName; // Customer last name
    private double balance; // balance
    private int depositCount; // deposits made
    private int withdrawalCount; //withdrawals made
    private final double monthlyServiceCharge = 5.0; //service fee

    public BankAccount() {
        this.accountNumber = generateAccountNumber();
    }

    public BankAccount(String firstName, String lastName) {
        this(); 
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    public BankAccount(String firstName, String lastName, double initialBalance) 
    {
        this(firstName, lastName); 
        this.balance = Math.max(0, initialBalance); 
    }

  
    private String generateAccountNumber() {
        accountCount++;
        return "Account" + accountCount; 
    }

    
    public void deposit(double amount) {
        if (amount > 0) 
        {
            balance += amount; 
            depositCount++;
            System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Please enter a valid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Updating balanceee
            withdrawalCount++;
            System.out.printf("Withdrew $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Withdrawal amount exceeds balance or is invalid.");
        }
    }

 
    public void processMonthlyFees() {
        balance -= monthlyServiceCharge; 
        if (balance < 0) {
            System.out.println("Balance fell below zero. Resetting to $0.");
            balance = 0; 
        }
        System.out.printf("Monthly service fee applied: $%.2f. Current balance: $%.2f%n", monthlyServiceCharge, balance);
        depositCount = 0; 
        withdrawalCount = 0;
    }

    
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate; // AIR
    private boolean isActive; //  status

    public SavingsAccount(String firstName, String lastName, double initialBalance, double interestRate) 
    {
        super(firstName, lastName, initialBalance);
        this.interestRate = interestRate;
        this.isActive = initialBalance >= 25; 
    }

    
    public void deposit(double amount) 
    {
        super.deposit(amount);
        checkAccountStatus(); 
    }

    public void withdraw(double amount) {
        if (isActive) {
            super.withdraw(amount);
            checkAccountStatus(); 
        } else {
            System.out.println("Withdrawal denied. Account is inactive.");
        }
    }

    public void applyInterest() 
    {
        double monthlyInterest = (interestRate / 100) / 12 * getBalance(); 
        deposit(monthlyInterest); 
        System.out.printf("Interest applied: $%.2f. New balance: $%.2f%n", monthlyInterest, getBalance());
    }

    
    public void processMonthlyFees() {
        super.processMonthlyFees(); 
        checkAccountStatus(); 
    }

    
    private void checkAccountStatus() {
        isActive = getBalance() >= 25; // Setting active status based on balance
        if (!isActive) {
            System.out.println("Account is now inactive due to low balance.");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Select account  1 for Regular , 2 for Savings ");
        int accountType = scanner.nextInt();
        scanner.nextLine(); 

        if (accountType == 1) 
        {
            createRegularAccount(scanner);
        } else if (accountType == 2) {
            createSavingsAccount(scanner);
        } else {
            System.out.println("Invalid option selected. Please try again.");
        }
        scanner.close(); 
    }

   
    private static void createRegularAccount(Scanner sc) {
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.print("Do you want to set an opening balance? (y/n): ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            System.out.print("Enter opening balance: ");
            double openingBalance = sc.nextDouble();
            BankAccount account = new BankAccount(firstName, lastName, openingBalance);
            performTransactions(account);
        } else {
            BankAccount account = new BankAccount(firstName, lastName);
            performTransactions(account);
        }
    }

    
    private static void createSavingsAccount(Scanner sc) {
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter the opening balance: ");
        double openingBalance = sc.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double interestRate = sc.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(firstName, lastName, openingBalance, interestRate);
        performTransactions(savingsAccount);
    }

    
    private static void performTransactions(BankAccount account) {
        account.deposit(100);
        account.withdraw(50); 
        account.processMonthlyFees(); 
    }
}
