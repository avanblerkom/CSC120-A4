public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    //methods using car class

    boardCar(Car c) {
    
    c.addPassenger(this);
    }

    getOffCar(Car c) {

    c.removePassenger(this):
    }

}
