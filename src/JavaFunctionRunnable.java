public class JavaFunctionRunnable {

    private final Runnable runnable;

    public JavaFunctionRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    public void run() {
        this.runnable.run();
    }

    public static void main(String[] args) {
        var javaFunction = new JavaFunctionRunnable(() -> {
            System.out.println("Hat geklappt");
            System.out.println(1+2);
        });

        javaFunction.run();
    }

}
