package week5;

//"Создать абстрактный класс Operation типизированный абстрактным классом Agreement либо его наследниками.

import lombok.*;
import week1to4.Agreement;

@Getter
@Setter
@AllArgsConstructor
@ToString

abstract class Operation<T extends Agreement> {
}
