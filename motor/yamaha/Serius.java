package baitap2.motor.yamaha;

import baitap2.motor.Motor;

import java.util.Scanner;

public class Serius extends Motor {
    int warranty; //thoi gian bao hanh

    public Serius() {
        super(); //super: kế thừa
    }

    public Serius(int warranty) {
        this.warranty = warranty;
    }

    public Serius(String code, String name, double capacity, int num, int warranty) {
        super(code, name, capacity, num);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    //Override

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter warranty: ");
        warranty = input.nextInt();
    }

    @Override
    public void diaplayInfor() {
        super.diaplayInfor();
        System.out.println("warranty: "+warranty);
    }

    @Override
    public String toString() {
        return "Serius{" +
                "warranty=" + warranty +
                '}';
    }
}
