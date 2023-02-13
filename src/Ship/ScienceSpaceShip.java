package Ship;

import java.util.List;
import java.util.Objects;

public class ScienceSpaceShip extends SpaceShip implements ScienceSpaceShipAbilities, TradeSpaceShipAbilities {
    List <String> equip;

    public ScienceSpaceShip(int lenght, int width, int height, int fuelTank) {
        super(lenght, width, height, fuelTank);
    }

    public ScienceSpaceShip(int lenght, int width, int height, int fuelTank, List<String> equip) {
        super(lenght, width, height, fuelTank);
        this.equip = equip;
    }

    @Override
    public void exploreSpace() {

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
    public void tradeWithAliens() {

    }

    @Override
    public void callEscort() {

    }

    enum ScienceSpaceShipTeam{
        CAPTAIN,
        PILOT,
        SCIENTIST,
        STUDENT,
        COOK;
    }

    /**public void exploreSpace() {
        System.out.println("Исследовать  Космос");
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ScienceSpaceShip that = (ScienceSpaceShip) o;
        return Objects.equals(equip, that.equip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), equip);
    }


}
