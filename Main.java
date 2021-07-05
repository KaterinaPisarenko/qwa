package IdeaProject.untitled2.src;


public class Main {

    public static void main(String... args) {
        // тип  /ссылка /присваиваем /инстанциирование объекта
        Car   car     =            new Car();
        // С разметкой в строчке выше все в порядке ;)
        car.speed = 1;
        car.showSpeed();
        car.setSpeed(12);
        car.showSpeed();

        car.otherSetSpeed(5);
        car.showSpeed();
    }
}
