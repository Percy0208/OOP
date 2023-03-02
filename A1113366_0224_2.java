import java.util.Scanner;

public class HW2{
    public static void main(String [] argv) {
        Scanner input = new Scanner (System.in);
        System.out.printf("請輸入攝氏溫度: ");
        double c = input.nextDouble();
        double f = (c*9/5)+32;
        System.out.printf("華氏溫度是:.1f.",f);
    }
}
        