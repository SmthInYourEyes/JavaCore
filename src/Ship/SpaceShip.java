package Ship;

import java.util.*;

public abstract class SpaceShip {
    int lenght;
    int width;
    int height;
    int fuelTank;

    public SpaceShip(int lenght, int width, int height, int fuelTank) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.fuelTank = fuelTank;
    }

  /**  class ShipMovement {
        void start() {
            System.out.println("Корабль разгоняется");
        }

        void go() {
            System.out.println("Корабль летит");
        }

        void brake() {
            System.out.println("Корабль тормозит");
        }
    }*/

  static List<MilitarySpaceShip> squadron1 = new ArrayList<>();
  static List<MilitarySpaceShip> squadron2 = new ArrayList<>();
  static  Map<String, List<MilitarySpaceShip>> flotilla = new HashMap<>();


    @Override
    public String toString() {
        return "Ship{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpaceShip ship = (SpaceShip) o;
        return lenght == ship.lenght && width == ship.width && height == ship.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght, width, height);
    }
}


/** int f = 0;
 while (f < trade.fuelTank) {
 f++;
 System.out.println("Бак торгового корабля заправлен на " + f + " тонн топлива");
 if (f == trade.fuelTank) {
 System.out.println("Бак торгового корабля заправлен");
 }
 }*/