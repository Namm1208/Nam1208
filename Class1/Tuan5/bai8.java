import java.text.DecimalFormat;
import java.util.Scanner;
public class bai8 {
 
    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
        System.out.println("Nhap so luong phan tu so nguyen: ");
        n = scanner.nextInt();
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhap so nguyen thu " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        } 
        avgNumber = (float) sum / n;
        System.out.println("Trung binh cong la= " + decimalFormat.format(avgNumber));
    }
 
}