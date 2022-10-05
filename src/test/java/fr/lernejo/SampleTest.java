package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {
    private final Sample sample = new Sample();

    @Test
    void fact_value_zero() {
        int value = 0;
        int result = sample.fact(value);
        Assertions.assertThat(result)
            .as("Factor of " + value)
            .isEqualTo(1);
    }

    @Test
    void fact_with_value_negative_10() {
        int value = -10;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(value));
    }


    void operation_addi(int var1, int var2, int expectedResult) {
        int addi_result = sample.op(Sample.Operation.ADD, var1, var2);
        Assertions.assertThat(addi_result)
            .as("Addition of " + var1 + " and " + var2)
            .isEqualTo(expectedResult);
    }

    void operation_multi(int var1, int var2, int expectedResult) {
        int multi_result = sample.op(Sample.Operation.MULT, var1, var2);
        Assertions.assertThat(multi_result)
            .as("Multiplication of " + var1 + " and " + var2)
            .isEqualTo(expectedResult);
    }

}
