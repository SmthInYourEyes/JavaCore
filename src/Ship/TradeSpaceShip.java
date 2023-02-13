package Ship;

import java.util.Objects;

public class TradeSpaceShip extends SpaceShip implements TradeSpaceShipAbilities {

    String cargoComp;
    Boolean largeCargoComp;

    public TradeSpaceShip(int lenght, int width, int height, int fuelTank) {
        super(lenght, width, height, fuelTank);
    }


    public TradeSpaceShip(int lenght, int width, int height, int fuelTank, String cargoComp) {
        super(lenght, width, height, fuelTank);
        this.cargoComp = cargoComp;
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

    enum TradeSpaceShipTeam{
        CAPTAIN,
        PILOT,
        TRADER,
        ACCOUNTANT,
        COOK;
    }

    /**public void tradeWithAliens(){
        System.out.println("Торговать с пришельцами");
    }

    public void callEscort(){
        System.out.println("Нанять конвой");

    }*/



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TradeSpaceShip that = (TradeSpaceShip) o;
        return Objects.equals(cargoComp, that.cargoComp) && Objects.equals(largeCargoComp, that.largeCargoComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoComp, largeCargoComp);
    }
}
