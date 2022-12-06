package services.extend;

import models.facility.Facility;
import models.facility.Room;
import models.facility.Villa;
import services.IService;

import java.io.IOException;
import java.util.Map;

public interface IFacilityService extends IService<Facility> {

    void getFacility() throws IOException;

    void getFacilityMaintenance() throws IOException;

    void addNewVilla(Villa villa) throws IOException;

    void addNewRoom(Room room) throws IOException;
}
