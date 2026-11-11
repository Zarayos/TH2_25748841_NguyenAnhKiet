
package nguyenanhkiet25748841;

import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int ma) throws Exception {
        if (ma > 0) {
            this.maSV = ma;
        } else {
            throw new Exception("Ma sinh vien phai lon hon 0");
        }
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) throws Exception {
        if (hoTen != null && !hoTen.trim().isEmpty()) {
            this.hoTen = hoTen;
        } else {
            throw new Exception("Ho ten khong duoc rong");
        }
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) throws Exception {
        if (diemLT >= 0 && diemLT <= 10) {
            this.diemLT = diemLT;
        } else {
            throw new Exception("Diem ly thuyet phai tu 0 den 10");
        }
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) throws Exception {
        if (diemTH >= 0 && diemTH <= 10) {
            this.diemTH = diemTH;
        } else {
            throw new Exception("Diem thuc hanh phai tu 0 den 10");
        }
    }

    public SinhVien(int maSV, String hoTen,
                    double diemLT, double diemTH) throws Exception {
        setMaSV(maSV);
        setHoTen(hoTen);
        setDiemLT(diemLT);
        setDiemTH(diemTH);
    }

    public SinhVien() {
        maSV = 0;
        hoTen = "";
        diemLT = 0;
        diemTH = 0;
    }

    public double getAverage() {
        return (getDiemLT() + getDiemTH()) / 2;
    }

    public static SinhVien nhap() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma SV: ");
        int maSV = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap diem LT: ");
        double diemLT = sc.nextDouble();

        System.out.print("Nhap diem TH: ");
        double diemTH = sc.nextDouble();

        return new SinhVien(maSV, hoTen, diemLT, diemTH);
    }

    @Override
    public String toString() {
        return String.format(
                "%-10d %-20s %-10.2f %-10.2f %-10.2f",
                maSV, hoTen, diemLT, diemTH, getAverage()
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien sv1 = null;
        SinhVien sv2 = null;
        SinhVien sv3 = new SinhVien();

        try {
            sv1 = new SinhVien(1, "Hoang", 8, 9);
        } catch (Exception e) {
            System.out.println("Loi sv1: " + e.getMessage());
        }

        System.out.println("\nNhap thong tin sv2:");

        try {
            sv2 = nhap();
        } catch (Exception e) {
            System.out.println("Loi sv2: " + e.getMessage());
        }

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
