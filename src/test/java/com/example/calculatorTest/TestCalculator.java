package com.example.calculatorTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCalculator {

    @ParameterizedTest
    @ValueSource(ints = {5, 7})
    void verify_addition_works(xxx){
        assertTrue(xxx == 12);

    @ParameterizedTest
    @CsvSource({5, 2, 4, 5})
    void something_to_do_with_csv()
    }
}
