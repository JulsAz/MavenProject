package week1to4;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class RealtyAgreement extends Agreement {

    private RealtyObject realtyObject;

    public RealtyAgreement(String reference, Person applicant, Money amount) { super(reference, applicant, amount); }

    public RealtyAgreement(AgreementStatus agreementStatus) {
        super(agreementStatus);
    }

}
