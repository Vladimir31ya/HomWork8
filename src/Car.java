public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Машина завилась");
    }

    @Override
    public void stop() {
        System.out.println("Машину заглушили");
    }
}
