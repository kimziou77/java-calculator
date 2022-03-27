import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

@TestMethodOrder(value = MethodOrderer.DisplayName.class)
public class CalculatorTest {
    Calculator calculator = new Calculator();
    String expression = "2 * 3";

    @Test
    @DisplayName("T1 basic_test")
     void basicTest() {
        /* 1. 정수 Test */
        expression = "1 + 5 - 4";
        calculator.calculate(expression);

        /* 2. 실수 Test */
        expression = "1.0 + 5.4 - 4.7";
        calculator.calculate(expression);
        
    }

    @Test
    @DisplayName("T2 add_test")
     void addTest(){
        expression = "1 + 5";
        calculator.calculate(expression);
    }
    @Test
    @DisplayName("T3 sub_test")
     void subTest(){
        expression = "7 - 1";
        calculator.calculate(expression);
    }
    @Test
    @DisplayName("T4 mul_test")
    void mulTest(){
        expression = "6 * 1";
        calculator.calculate(expression);
    }

    @Test
    @DisplayName("T5 div_test")
    void divTest(){
        /* 1. divide by 0 Test */
        expression = "2 / 0";
        calculator.calculate(expression);
    }

    @Test
    @DisplayName("T6 priority_test")
     void priorityTest(){
        /* 1. 곱셈 우선순위 Test */
        expression = "2 + 3 * 2 - 2";
        // result : 8(순차적)       - X
        // result : 6(우선순위 반영) - O
        calculator.calculate(expression);

        /* 2. 나눗셈 우선순위 Test */
        expression = "3 + 9 / 3 - 2";
        // result : 2(순차적)       - X
        // result : 6(우선순위 반영) - O
        calculator.calculate(expression);

    }

    @Test
    @DisplayName("T8 history_test")
    void historyTest() {
        expression = "1 + 5 - 4";
        calculator.calculate(expression);
        expression = "1 + 5 - 4";
        calculator.calculate(expression);
        expression = "1 + 5 - 4";
        calculator.calculate(expression);

        calculator.viewHistory();
    }


    @Test
    @DisplayName("T9 overflow_test")
    void overflow_test(){
        /* TODO: 1. 계산 오버플로우 처리 */
        expression = "3 + 9 / 3 - 2";
        calculator.calculate(expression);
    }
}
