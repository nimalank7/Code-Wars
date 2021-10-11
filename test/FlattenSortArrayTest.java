import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class FlattenSortArrayTest {

    @Test
    void returns51ForSorting15InDescendingOrder() {
        assertThat(FlattenSortArray.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}), equalTo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

}