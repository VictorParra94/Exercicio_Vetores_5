import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? = ");
        int lenght = sc.nextInt();
        int[] numbers = new int[lenght];

        for (int i=0; i<lenght; i++){
            System.out.print("Enter a number = ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Pair Numbers:");
        for (int i=0; i<lenght; i++){
            if (numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
