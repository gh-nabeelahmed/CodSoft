import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cond = true;
        while(cond) {
            System.out.println("Select a base currency:");
            System.out.println("1-₹(Rupee)\n2.$(US dollar)\n3.€(Euro)\n4.£(British pound)\n5.¥(Japanese yen)");
            int base = sc.nextInt();
            System.out.println("Enter an amount to convert:");
            double amount = sc.nextDouble();
            System.out.println("Select a target currency:");
            System.out.println("1-₹(Rupee)\n2.$(US dollar)\n3.€(Euro)\n4.£(British pound)\n5.¥(Japanese yen)");
            int target = sc.nextInt();
            switch(target){
                case 1:
                    System.out.println("Rupee:" + rupee(base,amount));
                    break;
                case 2:
                    System.out.println("US Dollar:" + usDollar(base,amount));
                    break;
                case 3:
                    System.out.println("Euro:" + euro(base,amount));
                    break;
                case 4:
                    System.out.println("British Pound:" + britishPound(base,amount));
                    break;
                case 5:
                    System.out.println("Japanese Yen:" + japanYen(base,amount));
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
            boolean tryCondition = true;
            while(tryCondition) {
                System.out.println("Try Again(0 to No/1 to Yes)?");
                int condNum = sc.nextInt();
                if(condNum == 0){
                    System.out.println("Thankyou!");
                    cond = false;
                    break;
                }
                else if(condNum != 1)
                    System.out.println("Invalid Number...\n");
                else
                    break;
            }
        }
    }

    static double japanYen(int base, double amount) {
        if(base == 1)
            return amount * 1.83;
        else if(base == 2)
            return amount * 153.42;
        else if(base == 3)
            return amount * 165.93;
        else if(base == 4)
            return amount * 199.52;
        else
            return amount;
    }

    static double britishPound(int base, double amount) {
        if(base == 1)
            return amount * 0.0091;
        else if(base == 2)
            return amount * 0.77;
        else if(base == 3)
            return amount * 0.83;
        else if(base == 5)
            return amount * 0.0050;
        else
            return amount;
    }

    static double euro(int base, double amount) {
        if(base == 1)
            return amount * 0.011;
        else if(base == 2)
            return amount * 0.92;
        else if(base == 4)
            return amount * 1.20;
        else if(base == 5)
            return amount * 0.0060;
        else
            return amount;
    }

    static double usDollar(int base, double amount) {
        if(base == 1)
            return amount * 0.012;
        else if(base == 3)
            return amount * 1.08;
        else if(base == 4)
            return amount * 1.30;
        else if(base == 5)
            return amount * 0.0065;
        else
            return amount;
    }

    static double rupee(int base, double amount) {
        if(base == 2)
            return amount * 84.07;
        else if(base == 3)
            return amount * 90.92;
        else if(base == 4)
            return amount * 109.35;
        else if(base == 5)
            return amount * 0.55;
        else
            return amount;
    }
}
