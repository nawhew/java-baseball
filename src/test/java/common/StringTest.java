package common;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    public void splitContain() {
        // given
        String foo = "1,2";

        // when
        String[] splitFoo = foo.split("\\,");

        // then
        assertThat(splitFoo).contains("1", "2");

    }

    @Test
    public void splitOneUnit() {
        // given
        String foo = "1";

        // when
        String[] splitFoo = foo.split("\\,");

        // then
        assertThat(splitFoo).containsExactly("1");

    }


    @Test
    public void eraseParenthesis() {
        // given
        String foo = "(1,2)";

        // when
        String erasedFoo = foo.substring(1, foo.length() -1);

        // then
        assertThat(erasedFoo).isEqualTo("1,2");

    }
}
