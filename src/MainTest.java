import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {
    // Normal cases
    @Test
    void testAndTrueTrue() {
        assertTrue(Main.and(true, true), "AND should be true when both are true");
    }

    @Test
    void testOrFalseTrue() {
        assertTrue(Main.or(false, true), "OR should be true when one is true");
    }

    @Test
    void testImplicationTrueFalse() {
        assertFalse(Main.implication(true, false), "Implication should be false when A is true and B is false");
    }

    // Edge cases
    @Test
    void testBiconditionalBothFalse() {
        assertTrue(Main.biconditional(false, false), "Biconditional should be true when both are false");
    }

    @Test
    void testNotTrue() {
        assertFalse(Main.not(true), "NOT true should be false");
    }

    @Test
    void testAndFalseFalse() {
        assertFalse(Main.and(false, false), "AND should be false when both are false");
    }
}
