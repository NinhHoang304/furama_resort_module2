package models.facility;

import models.facility.dependency.ServiceName;

public abstract class Facility {
    private ServiceName nameService;
    private double usableArea;
    private double rentCost;
    private int maximumPeople;
    private String rentTypes;

    public Facility() {
    }

    public Facility(ServiceName nameService, double usableArea, double rentCost,
                    int maximumPeople, String rentTypes) {
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.maximumPeople = maximumPeople;
        this.rentTypes = rentTypes;
    }

    public String formatCSVFileFacility() {
        return this.nameService + "," +
                this.usableArea + "," +
                this.rentCost + "," +
                this.maximumPeople + "," +
                this.rentTypes;
    }

    public ServiceName getNameService() {
        return nameService;
    }

    public void setNameService(ServiceName nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentTypes() {
        return rentTypes;
    }

    public void setRentTypes(String rentTypes) {
        this.rentTypes = rentTypes;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maximumPeople=" + maximumPeople +
                ", rentTypes='" + rentTypes + '\'' +
                '}';
    }
}
