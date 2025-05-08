import java.util.*;
public class Calculate1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter any opretore which is you want to calculate(+,-,*,/,%)");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':System.out.println(a+b);
                break;
                case'-':System.out.println(a-b);
                break;
                case'*':System.out.println(a*b);
                break;
                case'/':System.out.println(a/b);
                break;
                case'%':System.out.println(a%b);
        
            default:System.out.println("Invalid input ");
                
        }
        sc.close();

    }
}
