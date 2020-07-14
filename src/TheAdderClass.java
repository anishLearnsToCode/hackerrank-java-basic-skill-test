abstract class Calculator {
    abstract int add(int a, int b);
}

class Adder extends Calculator {

    @Override
    int add(int a, int b) {
        return a + b;
    }
}

public class TheAdderClass {
}


