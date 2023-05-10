/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1b;

import java.awt.BorderLayout;
import static java.time.InstantSource.system;
import java.util.Scanner;


public class lophocphan {

 private String TenLHP;
 private int MaLHP;
 private String tenGV;
 private String ThongtinLH;

 public lophocphan () {
    
}
 public lophocphan (String TenLHP, String tenGV, String ThongtinLH, int MaLHP){
     this.TenLHP = TenLHP;
     this.MaLHP = MaLHP;
     this.tenGV = tenGV;
     this.ThongtinLH = ThongtinLH;
   
 }

    public String getTenLHP() {
        return TenLHP;
    }

    public void setTenLHP(String TenLHP) {
        this.TenLHP = TenLHP;
    }

    public int getMaLHP() {
        return MaLHP;
    }

    public void setMaLHP(int MaLHP) {
        this.MaLHP = MaLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongtinLH() {
        return ThongtinLH;
    }

    public void setThongtinLH(String ThongtinLH) {
        this.ThongtinLH = ThongtinLH;
    }

 public void Nhap(){
     Scanner sc = new Scanner(system.in);
     System.out.println("nhap ten lop hoc phan :");
     TenLHP = sc.nextLine();
     System.out.println("nhap ma lop hoc phan :");
     MaLHP = sc.nextInt();
     System.out.println("Nhap ten giang vien :");
     tenGV = sc.nextLine();
     System.out.println("Nhap thong tin lop hoc :");
     ThongtinLH = sc.nextLine();
 }

    @Override
    public String toString() {
        return "lophocphan{" + "TenLHP=" + TenLHP + ", MaLHP=" + MaLHP + ", tenGV=" + tenGV + ", ThongtinLH=" + ThongtinLH + '}';
    }

 
}
