import java.util.function.Supplier;

public class JavaFunctionSupplier {

    private final Supplier<Integer> supplier;
    public JavaFunctionSupplier(Supplier<Integer> supplier) {
        this.supplier = supplier;
    }

    public Integer run() {
        return this.supplier.get();
    }

    public static void main(String[] args) {
        var supplier = new JavaFunctionSupplier(() -> 1+2);
        System.out.println(supplier.run());
    }
}
