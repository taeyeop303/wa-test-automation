// java/com/test_automation/calculator/DisplayMyNameTest.java

package com.test_automation.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisplayMyNameTest {
    private final DisplayMyName displayMyName = new DisplayMyName();

    @Test
    @DisplayName("Display My Name Test")
    public void testDisplayMyName() {
        String expectedName = "201935032 김태엽";
        assert displayMyName.getName().equals(expectedName);
    }
}
