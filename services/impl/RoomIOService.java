package services.impl;

import models.facility.Room;
import services.IFileMapService;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RoomIOService implements IFileMapService<Room, Integer> {
    @Override
    public Map<Room, Integer> readFile(String pathFile) throws IOException {
        Map<Room, Integer> roomList = new LinkedHashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] entry = line.split(",");
            Room room = new Room(entry[0], entry[1], Double.parseDouble(entry[2]), Double.parseDouble(entry[3]),
                    Integer.parseInt(entry[4]), entry[5], entry[6]);
            roomList.put(room, Integer.parseInt(entry[7]));
        }
        bufferedReader.close();
        return roomList;
    }

    @Override
    public void writeFile(String pathFile, Map<Room, Integer> rooms) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile));

        for (Map.Entry<Room, Integer> entry : rooms.entrySet()) {
            bufferedWriter.write(entry.getKey().formatCSVFileRoom() + "," +entry.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
