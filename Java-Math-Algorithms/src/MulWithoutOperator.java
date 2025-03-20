import java.util.Scanner;
public class MulWithoutOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scan.nextInt();

        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        int sum = 0;

        if(b>0){
           for(int i = 0; i<b;i++){
               sum+=a;
           }
        }else{
            for(int i = 0; i < -b; i++){
                sum+=a;
            }
            sum = -sum;
        }
        System.out.println("Result: " + sum);

        scan.close();
    }
}
