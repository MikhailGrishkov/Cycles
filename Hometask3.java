public class Hometask3 {
    //Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений
    // 1,2,...,10фунтов(1фунт=453г)
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.println(i + " кг" + " равен " + (i*0.453) + " lb");
        }
    }
}
