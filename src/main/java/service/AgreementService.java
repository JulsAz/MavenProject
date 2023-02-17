package service;


//3. В пакете service создать AgreementService. У него создать метод void close(Agreement agreement) который
// устанавливает статус CLOSED и в зависимости от статуса выводит в консоль: “удаляем черновик”, “закрываем аккредитив”, “аккредитив закрыт”

import week1to4.Agreement;
import week1to4.AgreementStatus;

public class AgreementService {
    public void close(Agreement agreement) {
        switch (agreement.getAgreementStatus()) {
            case DRAFT:
                System.out.println("удаляем черновик");
                break;
            case ACTIVE:
                System.out.println("закрываем аккредитив");
                break;
            case CLOSED:
                System.out.println("аккредитив закрыт");
                break;
        }
        agreement.setAgreementStatus(AgreementStatus.CLOSED);
    }
}
