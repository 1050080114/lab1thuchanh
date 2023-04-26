/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
    
        // Nhap thong tin cac xe
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Nhap thong tin xe " + (i+1) + ":");
            System.out.print("Ten chu xe: ");
            String ownerName = scanner.nextLine();
            System.out.print("Loai xe: ");
            String vehicleType = scanner.nextLine();
            System.out.print("Dung tich xy lanh: ");
            double cylinderCapacity = scanner.nextDouble();
            System.out.print("Tri gia xe: ");
            double vehicleValue = scanner.nextDouble();
            scanner.nextLine(); 
    
            vehicles[i] = new Vehicle(ownerName, vehicleType, cylinderCapacity, vehicleValue);
        }
    
        // In bang ke khai tien thue truoc ba cua cac xe
        System.out.println("Bang ke khai tien thue truoc ba cua cac xe:");
        System.out.println("-------------------------------------------------");
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "Ten chu xe", "Loai xe", "Dung tich xy lanh", "Tri gia xe", "Thue phai nop");
        System.out.println("-------------------------------------------------");
        for (Vehicle vehicle : vehicles) {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", vehicle.getOwnerName(), vehicle.getVehicleType(), vehicle.getCylinderCapacity(), vehicle.getVehicleValue(), vehicle.getTax());
        }
        System.out.println("-------------------------------------------------");
    }    
    
}
