package week1to4;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString
abstract public class Agreement {

    private String reference;
    private Person applicant;
    private Money amount;
    private AgreementStatus agreementStatus;

    public Agreement(AgreementStatus agreementStatus) {
        this.agreementStatus = agreementStatus;
    }

    public Agreement(String reference, Person applicant, Money amount) {
        this.reference = reference;
        this.applicant = applicant;
        this.amount = amount;
    }

}
