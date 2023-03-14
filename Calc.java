import java.util.Scanner;

public class Calc{
    static public void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Num n1 = new Num();
        Num n2 = new Num();
        Num res = new Num();
        String opt = "Y";

        while(opt.equals("y") || opt.equals("Y")){
                
            System.out.printf("%nEnter value 1: ");
            n1.setValue(sc.nextInt());
            System.out.printf("%nEnter value 2: ");
            n2.setValue(sc.nextInt());
        
            res.setValue(n1.getValue() + n2.getValue());

            System.out.printf("%nThe sum of %d and %d is equal to %d %n", n1.getValue(), n2.getValue(), res.getValue());
            System.out.printf("%nDo you want to add another value? [Y or N] ");
            opt = sc.next();
            System.out.printf("%n%n");
        }
        sc.close();
    }
}
