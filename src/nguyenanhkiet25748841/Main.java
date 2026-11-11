
package nguyenanhkiet25748841;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Tao sinh vien 1
        SinhVien sv1 = null;

        try {
            sv1 = new SinhVien(1, "Hoang", 8, 9);
        } catch (Exception e) {
            System.out.println("Loi sv1: " + e.getMessage());
        }

        // Nhap sinh vien 2 bang phuong thuc nhap()
        SinhVien sv2 = null;

        System.out.println("Nhap thong tin sv2:");

        try {
            sv2 = SinhVien.nhap();
        } catch (Exception e) {
            System.out.println("Loi sv2: " + e.getMessage());
        }

        // Nhap sinh vien 3 bang Setter
        SinhVien sv3 = new SinhVien();

        System.out.println("\nNhap thong tin sv3:");

        try {
            System.out.print("Nhap ma SV: ");
            sv3.setMaSV(sc.nextInt());
            sc.nextLine();

            System.out.print("Nhap ho ten: ");
            sv3.setHoTen(sc.nextLine());

            System.out.print("Nhap diem LT: ");
            sv3.setDiemLT(sc.nextDouble());

            System.out.print("Nhap diem TH: ");
            sv3.setDiemTH(sc.nextDouble());

        } catch (Exception e) {
            System.out.println("Loi sv3: " + e.getMessage());
        }

        // Xuat thong tin sinh vien
        System.out.println("\n========== THONG TIN SINH VIEN ==========");

        System.out.printf("%-10s %-20s %-10s %-10s %-10s%n",
                "Ma SV", "Ho ten", "Diem LT", "Diem TH", "Diem TB");

        if (sv1 != null) {
            System.out.println(sv1);
        }

        if (sv2 != null) {
            System.out.println(sv2);
        }

        System.out.println(sv3);
    }
}
