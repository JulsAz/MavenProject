package week1to4;

import lombok.*;

public enum AgreementStatus {
    DRAFT("черновик"),
    ACTIVE("активен"),
    CLOSED("закрыт");

    private String description;

    AgreementStatus(String description) {
        this.description = description;
    }
}
