package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Sinhvien arr[] = new Sinhvien[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Sinhvien(null,i,null,null,i);
			arr[i].name = sc.nextLine();
			arr[i].old = sc.nextInt();
			sc.nextLine();
			arr[i].adress =sc.nextLine();
			sc.nextLine();
			arr[i].sdt =sc.nextLine();
			sc.nextLine();
			arr[i].dtb=sc.nextFloat();
			sc.nextLine();
			}
			System.out.println("---------------------------");
			
			for (int i = 0; i < arr.length; i++) {
				Sinhvien p = arr[i];
				
			}
			}
}
