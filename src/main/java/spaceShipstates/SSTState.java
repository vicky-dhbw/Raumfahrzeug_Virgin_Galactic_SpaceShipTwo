package spaceShipstates;

import spaceShips.SpaceShipTwo;

public abstract class SSTState {
    protected SpaceShipTwo spaceShipTwo;

    public boolean boost(){
        System.out.println(" space ship should be released first....");
        return false;
    }

    public boolean apogee(){
        System.out.println("space ship should boost first.....");
        return false;
    }

    public boolean reEnter(){
        System.out.println("space ship should apogee first....");
        return false;
    }

    public boolean glide(){
        System.out.println("space ship should re enter first....");
        return false;
    }

    public boolean landSST(){
        System.out.println("space ship should glide first....");
        return false;
    }

}
