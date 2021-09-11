import java.util.function.Function;

public class JavaFunctionFunction {

    private final Function<String, Integer> function;
    public JavaFunctionFunction(Function<String, Integer> function) {
        this.function = function;
    }

    public Integer run(String t) {
        return this.function.apply(t);
    }

    public static void main(String[] args) {
        var function = new JavaFunctionFunction(String::length);
        System.out.println(function.run("Das ist ja super!"));
    }

}
