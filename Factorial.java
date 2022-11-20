import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        int num, fact = 1;
        Scanner scan_num = new Scanner(System.in);
        System.out.println("Enter any number ...");
        num = scan_num.nextInt();

        int i = 1;
        while(num >= i){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial number is " + fact);
    }
}
