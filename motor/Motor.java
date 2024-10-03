package baitap2.motor;

import java.util.Scanner;

public class Motor implements IMotor{
    String code; //ma xe
    String name; //ten loai xe
    double capacity; //dung tich xi lanh
    int num; //Kieu truyen luc laf may so

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getNum() {
        return num;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //Contructor

    public Motor() {
    }

    public Motor(String code, String name, double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.num = num;
    }

    @Override
    public void inputInfor() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter code: ");
        code = inp.next();
        System.out.println("Enter name: ");
        name = inp.next();
        System.out.println("Enter capacity: ");
        capacity = inp.nextDouble();
        System.out.println("Num: ");
        num = inp.nextInt();
    }

    @Override
    public void diaplayInfor() {
        System.out.println("===Thông tin:");
        System.out.println("Code: "+ code);
        System.out.println("Name: "+ name);
        System.out.println("Capacity: "+capacity);
        System.out.println("Num: "+num);
    }

    @Override
    public void changeInfor() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter code new: ");
        code = inp.next();
        System.out.println("Enter name new: ");
        name = inp.next();
        System.out.println("Enter capacity new: ");
        capacity = inp.nextDouble();
        System.out.println("Num new: ");
        num = inp.nextInt();
    }

    @Override
    public String toString() {
        return "Motor{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", num=" + num +
                '}';
    }


//    public int getWarranty() {
//    }
}
