public class Parser {

    public String[] parse(String expression) {
        // 1. 공백제거
        // 2. 필터링   : 숫자, 사칙연산(+-*/) 만 허용 , 특수문자 X
        // 3. 맨 앞과끝은 숫자
        // 4. 연속해서 두개의 연산자 X
        return new String[] {"12", "+", "2", "-", "3"};
    }
}

