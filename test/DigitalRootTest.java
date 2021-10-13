import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

class DigitalRootTest {

    @Test
    void returnDigitalRootOf7For16() {
        assertThat(DigitalRoot.digital_root(16), is(7));
    }

    @Test
    void returnDigitalRootOf6For456() {
        assertThat(DigitalRoot.digital_root(456), is(6));
    }
}