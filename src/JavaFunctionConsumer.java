import java.util.function.Consumer;

public class JavaFunctionConsumer {

    private final Consumer<String> consumer;
    public JavaFunctionConsumer(Consumer<String> consumer) {
        this.consumer = consumer;
    }

    public void run(String t) {
        this.consumer.accept(t);
    }

    public static void main(String[] args) {

        var consumer = new JavaFunctionConsumer(System.out::println);
        consumer.run("Das ist ja super!");

    }


}
