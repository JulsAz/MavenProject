package week5;
//Аннотациями добавить каждому классу геттеры, сеттеры, конструктор без аргументов, со всеми аргументами, билдер, тустринг

import service.AgreementService;
import week1to4.*;

public class Main {

    public static void main(String[] args) {

        Money amount1 = new Money(1000, "RUB");
        Person applicant1 = new Person("OOO Фора", "123");

        Agreement firstAgreement = new RealtyAgreement("ROP00000001", applicant1, amount1);
        Agreement secondAgreement = new RealtyAgreement("ROP00000002", new Person("ООО Потеряшка", "567"),
                new Money(1, "USD"));

        System.out.println(firstAgreement);
        System.out.println(secondAgreement);

        // enam part
        //В классе Main методе main создаем Agreement со статусом, создаем сервис, передаем методу close сервиса созданный агримент"
        Agreement thirdAgreement = new RealtyAgreement(AgreementStatus.CLOSED);
        AgreementService agreementService = new AgreementService();
        agreementService.close(thirdAgreement);
    }


}


