import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
		int n;
		int giaithua=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so nguyen n: ");
		n= sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			giaithua*=i;
		}
		System.out.println("giai thua cua "+n+" la "+giaithua);
}
}