import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(value = MethodOrderer.DisplayName.class)
public class ParserTest {
    Parser parser = new Parser();
    String expression = "2 * 3";

    @Test
    @DisplayName("T1 basic_parse_test")
    void stringParseTest() {
        expression = "12 + 2 - 3";
        String[] result = parser.parse(expression);
        String[] expect = {"12", "+", "2", "-", "3"};
        assertArrayEquals(result, expect);
    }
    @Test
    @DisplayName("T2 regex_test")
    void regexTest() {

    }
}
