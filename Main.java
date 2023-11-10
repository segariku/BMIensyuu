import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("自身の身長を入力してください。(例: 175cmの場合1.75)");
        double height = scanner.nextDouble();

        System.out.println("自身の体重を入力してください。");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);


       System.out.println(String.format("%.2f", bmi));

       if (bmi < 18.5) {
            System.out.println("やせ型です。");
        } else if (bmi < 25) {
            System.out.println("標準体重です。維持していきましょう。");
        } else if (bmi < 30) {
            System.out.println("肥満1度です。改善しましょう。");
        } else if (bmi < 35) {
            System.out.println("肥満2度です。改善しましょう。");
        } else if (bmi < 40) {
            System.out.println("肥満3度です。改善してください。");
        } else {
            System.out.println("肥満4度です。改善してください。");
        }
    }
}
