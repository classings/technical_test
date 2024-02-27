package org.softserve.challenge;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StringCleanerTest {

    @Test
    public void testValidCase1() {
        String occurrence = "AABBCCD112233";
        String newOccurrence = StringCleaner.removeDuplicates(occurrence);
        assertThat(newOccurrence).isEqualTo("ABCD123");
    }

    @Test
    public void testValidCase2() {
        String occurrence = "HO234LAAaaH223344???????";
        String newOccurrence = StringCleaner.removeDuplicates(occurrence);
        assertThat(newOccurrence).isEqualTo("HO234LAa?");
    }

    @Test
    public void testValidCase3() {
        String occurrence = "KJH76GGfhaUuu98vVccCC";
        String newOccurrence = StringCleaner.removeDuplicates(occurrence);
        assertThat(newOccurrence).isEqualTo("KJH76GfhaUu98vVcC");
    }

    @Test
    public void testValidCase4() {
        String occurrence = "123678123678123uUUiIIDerqJJ";
        String newOccurrence = StringCleaner.removeDuplicates(occurrence);
        assertThat(newOccurrence).isEqualTo("123678uUiIDerqJ");
    }
}