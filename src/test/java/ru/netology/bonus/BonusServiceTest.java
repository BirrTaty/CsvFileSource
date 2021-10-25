package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"},
    delimiter = '|', numLinesToSkip = 2)
    public void shouldCalculate(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        assertEquals(expected, service.calculate(amount, registered));
    }
}