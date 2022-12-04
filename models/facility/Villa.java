package models.facility;

import models.facility.dependency.ServiceName;

public class Villa extends Facility{

    private String roomTypes;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String roomTypes, double poolArea, int floor) {
        this.roomTypes = roomTypes;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String nameService, double usableArea, double rentCost,
                 int maximumPeople, String rentTypes, String roomTypes, double poolArea, int floor) {
        super(nameService, usableArea, rentCost, maximumPeople, rentTypes);
        this.roomTypes = roomTypes;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String formatCSVFileVilla() {
        return this.formatCSVFileFacility() + "," +
                this.roomTypes + "," +
                this.poolArea + "," +
                this.floor;
    }

    public String getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(String roomTypes) {
        this.roomTypes = roomTypes;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", roomTypes='" + roomTypes + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}';
    }
}
