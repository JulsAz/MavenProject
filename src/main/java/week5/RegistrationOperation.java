package week5;

import lombok.*;
import week1to4.RealtyAgreement;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString

public class RegistrationOperation extends Operation<RealtyAgreement> {
    //Сделать класс RegistrationOperation, типизированный недвижкой, в нем сделать метод createNewAgreement возвращающий новый агримент.

    public RealtyAgreement createNewAgreement() {
        return new RealtyAgreement();
    }
}
