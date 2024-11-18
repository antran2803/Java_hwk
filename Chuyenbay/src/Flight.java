public abstract class Flight {
    protected String flightID;
    protected String destination;
    protected String departureTime;

    public Flight(String flightID, String destination, String departureTime) {
        this.flightID = flightID;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getFlightID() {

        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    public abstract void fareDetails();
}
