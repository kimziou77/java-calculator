import java.util.Scanner;

public class Main {
    static final int VIEW_HISTORY = 1;
    static final int CALCULATE = 2;
    static final int EXIT = 3;
    public static void main(String[] args) {
        String menu = new StringBuilder()
                .append("1. 조회\n")
                .append("2. 계산\n")
                .append("3. 종료")
                .toString();

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(menu);
            System.out.print("선택 : ");
            int select = scanner.nextInt();
            switch(select){
                case VIEW_HISTORY:
                    calculator.viewHistory();
                    break;
                case CALCULATE:
                    calculator.calculate();
                    break;
                case EXIT:
                    System.out.println("종료합니다 \n");
                    return;
                default:
                    System.out.println("Enter 1 or 2 or 3 \n");
                    break;
            }
        }
    }
}
