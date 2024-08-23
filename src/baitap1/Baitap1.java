
package baitap1;

import java.util.Scanner;

public class Baitap1 {

    
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen tu ban phim");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("Tong hai so nguyen la: "+(x+y));
        System.out.println("Hieu hai so nguyen la: "+(x-y));
        System.out.println("Tich hai so nguyen la: "+(x*y));
        System.out.println("Thuong hai so nguyen la: "+(x/y));
        System.out.println("Phan du cua hai so nguyen la: "+(x%y));
                
    }
    
}
