public class Operator implements Add, Sub, Mul, Div {
    enum OperatorType { ADD, SUB, MUL, DIV }
}

interface Add{
    default void add(){}
}
interface Sub{
    default void sub(){}
}
interface Mul{
    default void mul(){}
}
interface Div{
    default void div(){}
}
