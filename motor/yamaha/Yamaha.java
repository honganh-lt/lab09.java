package baitap2.motor.yamaha;

import baitap2.motor.Motor;
import lab09.baitap1.vehicle.vehicle.Truck.Truck;
import lab09.baitap1.vehicle.vehicle.Vehicle;
import lab09.baitap1.vehicle.vehicle.car.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Yamaha {
    public static void main(String[] args) {
        List<Motor> list = new ArrayList<Motor>(); //generic
        int chon = 0;
        Scanner inp = new Scanner(System.in);
        do {
            menu();
            System.out.println("\nChọn: ");
            chon = inp.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Chon 1: Input");
                    System.out.println("chon1: Input Car");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Car thu: " + (i + 1));
                        Jupiter jupiter = new Jupiter();
                        jupiter.inputInfor();
                        list.add(jupiter);
                    }
                    //mangr 3 doi tuowng truck
                    System.out.println("chon1: Input Truck");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Truck thu: " + (i + 1));
                        Serius serius = new Serius();
                        serius.inputInfor();
                        list.add(serius);
                    }
                    break;
                case 2:
                    System.out.println("Chon 2: Display");
                    for (Motor motor : list) {
                        motor.diaplayInfor();
                        // System.out.println(motor.toString());
                    }
                    break;
                case 3:
                    System.out.println("Chon 3: Sort");
                    System.out.println("====Truoc khi sap xep:");
                    for (Motor motor : list) {
                        System.out.println(motor.toString());
                    }
                    //sort
                    //    Collections.sort(list,(x1, x2)->(x1.getWarranty()>x2.getWarranty())?-1:(x1.getWarranty()>x2.getWarranty())?-1:0);
                    System.out.println("====Sau khi sap xep");
                    for (Motor motor : list) {
                        System.out.println(motor.toString());
                    }
                    //bubble Sort
                    for (int i = 0; i < list.size() - 1; i++) {
                        for (int j = i + 1; j < list.size(); j++) {
                               // if(list.get(j).getWarranty() > list.get(j+1).getWarranty())
                                {
                            Motor temp = list.get(i);
                            list.set(i, list.get(j));
                            list.set(j, temp);
                        }
                    }
            }
            break;
            case 4:
                System.out.println("Chon 4: Search ");
                break;
            case 5:
                System.out.println("Chon 5: Exit");
                break;
            default:
                System.out.println("Invalid chọn");
        }
        }while (chon!=5);
    }
    static void menu(){
        System.out.println("====Menu=====");
        System.out.printf("\n1. Input \n" +
                "2. Display\n" +
                "3. Sort \n" +
                "4. Search \n" +
                "5.Thoat");
    }
}
