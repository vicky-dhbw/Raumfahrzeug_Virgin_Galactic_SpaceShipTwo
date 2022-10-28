package spaceShipsComponents;

public class CTN {

    private final Case ctnCase;
    private final Throat throat;
    private final Nozzle nozzle;

    public CTN(){
        ctnCase=new Case();
        throat=new Throat();
        nozzle=new Nozzle();
    }

    public Case getCtnCase() {
        return ctnCase;
    }

    public Throat getThroat() {
        return throat;
    }

    public Nozzle getNozzle() {
        return nozzle;
    }
}
