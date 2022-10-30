package spaceShipsComponents;

public class OxidizerTank {

    private double fuelAmount;

    public void setFuelAmount(double fuelAmount){
        System.out.println("Tank being filled with "+fuelAmount+" kg of HTPB and liquid nitrous oxide");
        System.out.println();
        this.fuelAmount=fuelAmount;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void burnFuel(double fuelAmount_){
        if(fuelAmount>0){
            fuelAmount-=fuelAmount_;
        }
    }
}
