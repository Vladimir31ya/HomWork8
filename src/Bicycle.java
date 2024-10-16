public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Кто-то крутит педали");
    }

    @Override
    public void stop() {
        System.out.println("Велик сломали");
    }
}
