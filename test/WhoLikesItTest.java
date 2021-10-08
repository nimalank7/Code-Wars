import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class WhoLikesItTest {

    @Test
    void returnsCorrectStringForNoStringArguments() {
        assertThat(WhoLikesIt.whoLikesIt(), is("no one likes this"));
    }

    @Test
    void returnsCorrectStringForStringOfPeter() {
        assertThat(WhoLikesIt.whoLikesIt("Peter"), is("Peter likes this"));
    }

    @Test
    void returnsCorrectStringForJacobAlex() {
        assertThat(WhoLikesIt.whoLikesIt("Jacob", "Alex"), is("Jacob and Alex like this"));
    }

    @Test
    void returnsCorrectStringForMaxJohnMark() {
        assertThat(WhoLikesIt.whoLikesIt("Max", "John", "Mark"), is("Max, John and Mark like this"));
    }

    @Test
    void returnsCorrectStringForAlexJacobMarkMax() {
        assertThat(WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"), is("Alex, Jacob and 2 others like this"));
    }
}