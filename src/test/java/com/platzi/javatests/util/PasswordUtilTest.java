package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        Assert.assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {
        Assert.assertEquals(WEAK, PasswordUtil.assessPassword("sasjaksjkasjas"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        Assert.assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234567"));
    }

    @Test
    public void strong_when_has_letters_and_numbers_and_symbols() {
        Assert.assertEquals(STRONG, PasswordUtil.assessPassword("abcd123456*!7"));
    }
}