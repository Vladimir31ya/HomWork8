public class Boat implements Vehicle {

    @Override
    public void start() {
        System.out.println("Гребут веслами");
    }

    @Override
    public void stop() {
        System.out.println("Закинули удочки");
    }
}
