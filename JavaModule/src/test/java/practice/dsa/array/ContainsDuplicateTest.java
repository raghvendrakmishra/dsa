package practice.dsa.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ContainsDuplicateTest {

    private final int[] sample1 = null;
    private final int[] sample2 = {};
    private final int[] sample3 = {1,2,3,4};
    private final int[] sample4 = {1,2,3,1};
    private final int[] sample5 = {1,1,1,1};

    private final ContainsDuplicate object = new ContainsDuplicate();

    @Test
    void usingBruteForce() {
        assertFalse(object.usingBruteForce(sample1));
        assertFalse(object.usingBruteForce(sample2));
        assertFalse(object.usingBruteForce(sample3));

        assertTrue(object.usingBruteForce(sample4));
        assertTrue(object.usingBruteForce(sample5));
    }

    @Test
    void usingHashSet() {
        assertFalse(object.usingHashSet(sample1));
        assertFalse(object.usingHashSet(sample2));
        assertFalse(object.usingHashSet(sample3));

        assertTrue(object.usingHashSet(sample4));
        assertTrue(object.usingHashSet(sample5));
    }

    @Test
    void usingSort() {
        assertFalse(object.usingSort(sample1));
        assertFalse(object.usingSort(sample2));
        assertFalse(object.usingSort(sample3));

        assertTrue(object.usingSort(sample4));
        assertTrue(object.usingSort(sample5));
    }

    
}
