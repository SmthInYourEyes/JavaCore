package Ship;

public interface SpaceShipAbilities {

    public static void restoreFuel(int a){
        int i = 0;
        while ( i < a){
            i++;
            System.out.println("Бак корабля заправлен на " + i + " тонн топлива");
            if (i == a) {
                System.out.println("Бак корабля заправлен");
            }
        }
    };
    void start();
    void powerUpShield();
    void powerDownShield();
    void move();
    void brake();
}
