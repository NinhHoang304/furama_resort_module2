package services.extend;

import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import services.IService;

import java.util.Map;

public interface IFacilityService extends IService<Facility> {

    void displayFacility();

    void displayFacilityMaintenance();
}
