package Planes;

import java.util.Objects;

abstract public class Plane {
    private final String model;
    private final int maxSpeed;
    private final int maxFlightDistance;
    private final int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel() {
        return this.model;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getMaxFlightDistance() {
        return this.maxFlightDistance;
    }

    public int getMinLoadCapacity() {
        return this.maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + this.model + '\'' +
                ", maxSpeed=" + this.maxSpeed +
                ", maxFlightDistance=" + this.maxFlightDistance +
                ", maxLoadCapacity=" + this.maxLoadCapacity +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return this.maxSpeed == plane.maxSpeed &&
                this.maxFlightDistance == plane.maxFlightDistance &&
                this.maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(this.model, plane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.model, this.maxSpeed, this.maxFlightDistance, this.maxLoadCapacity);
    }
}
