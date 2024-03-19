import java.util.Scanner;

public class Hometask4 {
    //Вычислитьсумму1+1/2+1/3+...+1/n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Сумма: " + sum);

    }
}
