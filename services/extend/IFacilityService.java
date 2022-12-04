package services.extend;

import models.facility.Facility;
import services.IService;

import java.util.Map;

public interface IFacilityService extends IService<Facility> {

    void displayFacility();
    void displayFacilityMaintenance();
}
