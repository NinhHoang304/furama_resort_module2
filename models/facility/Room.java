package models.facility;

import models.facility.dependency.ServiceName;

public class Room extends Facility{

    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idFacility, String nameService, double usableArea,
                double rentCost, int maximumPeople, String rentTypes, String freeService) {
        super(idFacility, nameService, usableArea, rentCost, maximumPeople, rentTypes);
        this.freeService = freeService;
    }

    public String formatCSVFileRoom() {
        return this.formatCSVFileFacility() + "," +
                this.freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", freeService='" + freeService + '\'' +
                '}';
    }
}
