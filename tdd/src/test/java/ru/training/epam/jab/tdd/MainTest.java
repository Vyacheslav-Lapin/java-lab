package ru.training.epam.jab.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class MainTest {

    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @ParameterizedTest(name = "Sum of {0} and {1} should be {2}")
    @DisplayName("Roman numeral")
    @CsvSource({ "1, 2, 3", "5, 6, 11", "10, 50, 60"})
    void sumWorksCorrectly(int x, int y, int z) {
        assertThat(main.sum(x, y), is(z));
    }
}