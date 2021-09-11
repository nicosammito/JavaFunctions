import java.util.function.BiFunction;

public class JavaFunctionBiFunction {

    private final BiFunction<String, String, Integer> biFunction;
    public JavaFunctionBiFunction(BiFunction<String, String, Integer> biFunction) {
        this.biFunction = biFunction;
    }

    public Integer run(String t, String u) {
        return this.biFunction.apply(t, u);
    }

    public static void main(String[] args) {

        var biFunction = new JavaFunctionBiFunction((text1, text2) -> (text1+text2).length());
        System.out.println(biFunction.run("jhsdfhiusfdhuihuidfs", "klhfshkusdfhkuuhkdsf"));

    }
}
