import java.util.Scanner;

public class Hometask1 {
    //Составить программу вывода любого числа любое заданное число раз
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number =sc.nextInt();
        System.out.println("Введите введите количество раз, которое следует вывести заданное число");
        int manyTimes = sc.nextInt();

        for (int i=0; i<manyTimes; i++){
            System.out.print(number + " ");
        }
    }
}
