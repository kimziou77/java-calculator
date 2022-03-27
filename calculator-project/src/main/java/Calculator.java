import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<String> history;

    public void calculate(){

    }

    public void viewHistory(){
        System.out.println("조회기능 구현중 \n");
    }

    public List<Integer> calculate(String expression) {
        String result = "result";
        history.add(result);
        return new ArrayList<>(6);
    }

}
