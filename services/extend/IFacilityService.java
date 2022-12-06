package services.extend;

import models.facility.Facility;
import services.IService;

public interface IFacilityService extends IService<Facility> {

    void getFacility();

    void getFacilityMaintenance();
}
