package pl.coderslab.beans;

public class Ship {
    private final Captain captain;

    public Ship(Captain capitan) {
        this.captain = capitan;
    }

    public Captain getCaptain() {
        return captain;
    }
}
