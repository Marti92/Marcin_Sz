public class MarsApplication {
    public static void main(String[] args) {

        MarsRobot Stefan = new MarsRobot();



        Stefan.status = "eksploracja";
        Stefan.speed = 2;
        Stefan.temperature = -60;

        Stefan.showAttributes();
        System.out.println("Zwiększanie prędkości do 3.");
        Stefan.speed = 3;
        Stefan.showAttributes();
        System.out.println("Zmiana temperatury na -90.");
        Stefan.temperature = -90;
        Stefan.showAttributes();
        System.out.println("Sprawdzanie temperatury.");
        Stefan.chceckTemperature();
        Stefan.showAttributes();

        MarsRobot opportunity = new MarsRobot();

        opportunity.status = "Postoj";
        opportunity.speed = 4;
        opportunity.temperature = -82;
        System.out.println(opportunity.status);
        System.out.println(opportunity.speed);
        System.out.println(opportunity.temperature);




    }
}
