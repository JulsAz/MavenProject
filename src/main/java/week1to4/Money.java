package week1to4;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@ToString
public class Money {

    private long amount;
    private String currency;

}
