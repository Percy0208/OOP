import java.util.Scanner;

public class HW1{
    public static void main(String [] argv) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入一個整數：");
        int a = input.nextInt();
        if (a % 2 == 0){
           System.out.println("是偶數");
        } else{
           System.out.println("是奇數");
        } 
    }
}          

  
 
 
