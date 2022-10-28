package spaceShipsComponents;

public class HybridRocketSystem {
    private final CTN ctn;
    private final OxidizerTank oxidizerTank;
    private final MainValveBulkhead mainValveBulkhead;

    public HybridRocketSystem(){
        ctn=new CTN();
        oxidizerTank=new OxidizerTank();
        mainValveBulkhead=new MainValveBulkhead();
    }

    public CTN getCtn() {
        return ctn;
    }

    public OxidizerTank getOxidizerTank() {
        return oxidizerTank;
    }

    public MainValveBulkhead getMainValveBulkhead() {
        return mainValveBulkhead;
    }
}
