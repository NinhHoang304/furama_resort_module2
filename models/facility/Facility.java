package models.facility;

import models.facility.dependency.ServiceName;

public abstract class Facility {

    private String nameService;
    private double usableArea;
    private double rentCost;
    private int maximumPeople;
    private String rentTypes;

    public Facility() {
    }

    public Facility(String nameService, double usableArea, double rentCost, int maximumPeople, String rentTypes) {
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

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
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
    public boolean equals(Object obj) {
        if (obj instanceof Facility){
            Facility other = (Facility) obj;
            if (this.nameService.equals(other.nameService)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.nameService.hashCode();
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
