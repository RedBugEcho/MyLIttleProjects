import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;
        boolean running = true;

        while(running){

            System.out.println("1. Check balance.");
            System.out.println("2. Deposit money.");
            System.out.println("3. Withdraw cash.");
            System.out.println("4. Exit.");
            System.out.print("Choose an operation: ");


            if(scanner.hasNextInt()){
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Your balance: " + balance);
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double deposite = scanner.nextDouble();
                        balance += deposite;
                        System.out.println("You deposited: " + deposite);

                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double cash = scanner.nextDouble();
                        if (cash > balance) {
                            System.out.println("Insufficient funds, please try again!");
                        }else {
                            balance -= cash;
                            System.out.println("You withdrew: " + cash);
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using my Java ATM! Goodbye");
                        running = false;
                        break;
                }
            }
        }
    }
}
