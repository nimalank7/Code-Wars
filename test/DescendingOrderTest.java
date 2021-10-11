import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DescendingOrderTest {

    @Test
    void returns51ForSorting15InDescendingOrder() {
        assertThat(DescendingOrder.sortDesc(15), is(51));
    }

    @Test
    void returns987654321ForSorting123456789InDescendingOrder() {
        assertThat(DescendingOrder.sortDesc(123456789), is(987654321));
    }
}