package com.epam.utils.utils;

import org.apache.commons.lang3.compare.ComparableUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;

import java.math.BigDecimal;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(NumberUtils.isParsable(str)) {
            BigDecimal number = NumberUtils.createBigDecimal(str);
            return ComparableUtils.is(number).greaterThan(BigDecimal.ZERO);
        }
        return false;
    }
}
