public class MarsRobot {
    String status;
    int speed;
    double temperature;

    void chceckTemperature() {
        if (temperature < -80) {
            status = "Powrót do domu";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status:" + status);
        System.out.println("Prędkość:" + speed);
        System.out.println("Temperatura:" + temperature);

    }
}

