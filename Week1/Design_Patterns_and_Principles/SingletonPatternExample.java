public class SingletonPatternExample {
    private static SingletonPatternExample instance;

    private SingletonPatternExample() {
        // Private constructor
    }

    public static SingletonPatternExample getInstance() {
        if (instance == null) {
            instance = new SingletonPatternExample();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        SingletonPatternExample singleton = SingletonPatternExample.getInstance();
        singleton.showMessage();
    }
}
