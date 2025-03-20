import java.util.Scanner;

public class PrintArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i<nums.length; i++){
            nums[i] = scan.nextInt();
        }
        scan.close();

        printArray(nums);
    }
    public static void printArray(int[] arr){
        System.out.println("The numbers you entered are: ");
            for(int num: arr){
                System.out.print(num+" ");
            }
        }
}
