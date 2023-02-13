package Ship;

import java.util.Objects;

public class MilitarySpaceShip extends SpaceShip implements MilitarySpaceShipAbilities {
    String shieldField;
    String lasers;

    public MilitarySpaceShip(int lenght, int width, int height, int fuelTank, String shieldField, String lasers) {
        super(lenght, width, height, fuelTank);
        this.shieldField = shieldField;
        this.lasers = lasers;
    }


    @Override
    public void start() {

    }

    @Override
    public void powerUpShield() {

    }

    @Override
    public void powerDownShield() {

    }

    @Override
    public void move() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void openFire() {

    }

    enum MilitarySpaceShipTeam {
        CAPTAIN,
        PILOT,
        OFFICER,
        SHOOTER,
        SOLDIER,
        COOK;
    }
    //todo вынести в отдельный класс

    class MilitarySpaceShipRoute {
        void spaceportTakeoff() {
            System.out.println("Корабль взлетает с космодрома");
        }

        void refuel() {
            System.out.println("Остановка на дозаправку");
        }

        void landing() {
            System.out.println("Корабль садится");
        }

    }

    @Override
    public String toString() {
        return "Военный корабль{" +
                "Щит: " + shieldField + '\'' +
                ", Лазер: '" + lasers + '\'' +
                ", Длина: " + lenght +
                ", Ширина: " + width +
                ", Высота: " + height +
                ", Объем бака: " + fuelTank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilitarySpaceShip military = (MilitarySpaceShip) o;
        return Objects.equals(shieldField, military.shieldField) && Objects.equals(lasers, military.lasers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldField, lasers);
    }
}
