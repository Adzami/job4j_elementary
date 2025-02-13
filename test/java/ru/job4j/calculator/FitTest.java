package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMaleHeight180ThenIdealWeight92() {
        double result = Fit.idealWeight(180, Gender.MALE);
        assertThat(result).isEqualTo(92.0, withPrecision(0.01));
    }

    @Test
    void whenFemaleHeight170ThenIdealWeight69() {
        double result = Fit.idealWeight(170, Gender.FEMALE);
        assertThat(result).isEqualTo(69.0, withPrecision(0.01));
    }

    @Test
    void whenHeightIsZeroThenThrowException() {
        assertThatThrownBy(() -> Fit.idealWeight(0, Gender.MALE))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be greater than zero");
    }

    @Test
    void whenHeightIsNegativeThenThrowException() {
        assertThatThrownBy(() -> Fit.idealWeight(-170, Gender.FEMALE))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be greater than zero");
    }
}