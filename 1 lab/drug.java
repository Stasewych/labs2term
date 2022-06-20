package ua.lviv.iot.firstLab;

public class Main {
    public static void main(String[] args) {
        Drug Drug1 = new Drug();
        Drug Drug2 = new Drug("Korvalor");
        Drug Drug3 = new Drug("Valerianka", 100);
        System.out.println(Drug1);
        System.out.println(Drug2);
        System.out.println(Drug3);
        System.out.println("Static - "+Drug.getDrugName());
    }
}
