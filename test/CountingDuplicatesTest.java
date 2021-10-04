import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingDuplicatesTest {

    @Test
    void StringOfabcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    void StringOfaabbcdeReturnsZero() {
        assertEquals(2, CountingDuplicates.duplicateCount("aabbcde"));
    }

    @Test
    void StringOfaabBcdeReturnsZero() {
        assertEquals(2, CountingDuplicates.duplicateCount("aabBcde"));
    }

    @Test
    void StringOfindivisibilityReturnsZero() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }

    @Test
    void StringOfindivisibilitiesReturnsZero() {
        assertEquals(2, CountingDuplicates.duplicateCount("indivisibilities"));
    }

    @Test
    void StringOfaA11ReturnsZero() {
        assertEquals(2, CountingDuplicates.duplicateCount("aA11"));
    }

    @Test
    void StringOfABBAReturnsZero() {
        assertEquals(2, CountingDuplicates.duplicateCount("ABBA"));
    }
}