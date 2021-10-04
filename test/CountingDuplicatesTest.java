import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingDuplicatesTest {

    @Test
    void StringOfabcdeReturnsZero() {
        assertEquals(CountingDuplicates.duplicateCount("abcde"), 0);
    }

    @Test
    void StringOfaabbcdeReturnsZero() {
        assertEquals(CountingDuplicates.duplicateCount("aabbcde"), 2);
    }

    @Test
    void StringOfaabBcdeReturnsZero() {
        assertEquals(CountingDuplicates.duplicateCount("aabBcde"), 2);
    }

    @Test
    void StringOfindivisibilityReturnsZero() {
        assertEquals(CountingDuplicates.duplicateCount("indivisibility"), 1);
    }

    @Test
    void StringOfindivisibilitiesReturnsZero() {
        assertEquals(CountingDuplicates.duplicateCount("indivisibilities"), 2);
    }

    @Test
    void StringOfaA11ReturnsZero() {
        assertEquals(CountingDuplicates.duplicateCount("aA11"), 2);
    }

    @Test
    void StringOfABBAReturnsZero() {
        assertEquals(CountingDuplicates.duplicateCount("ABBA"), 2);
    }
}