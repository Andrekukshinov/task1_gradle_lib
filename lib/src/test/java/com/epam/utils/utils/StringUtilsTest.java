package com.epam.utils.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("1", true),
                Arguments.of("10", true),
                Arguments.of("0", false),
                Arguments.of("-1", false),
                Arguments.of("", false),
                Arguments.of(" ", false)
                );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testIsPositiveNumber(String value, boolean expected) {
        boolean actual = StringUtils.isPositiveNumber(value);

        Assertions.assertEquals(expected, actual);
    }
}
