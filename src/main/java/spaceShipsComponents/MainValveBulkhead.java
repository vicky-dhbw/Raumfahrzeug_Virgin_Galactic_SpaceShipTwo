package spaceShipsComponents;

import com.sun.tools.javac.Main;

public class MainValveBulkhead {

    private final SloshBaffle sloshBaffle;
    private final Valve valve;
    private final InjectorIgniterComponents injectorIgniterComponents;

    public MainValveBulkhead(){
        sloshBaffle=new SloshBaffle();
        valve=new Valve();
        injectorIgniterComponents=new InjectorIgniterComponents();
    }

    public SloshBaffle getSloshBaffle() {
        return sloshBaffle;
    }

    public Valve getValve() {
        return valve;
    }

    public InjectorIgniterComponents getInjectorIgniterComponents() {
        return injectorIgniterComponents;
    }
}
