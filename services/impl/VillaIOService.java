package services.impl;

import models.facility.Villa;
import services.IFileMapService;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class VillaIOService implements IFileMapService<Villa, Integer> {
    @Override
    public Map<Villa, Integer> readFile(String pathFile) throws IOException {
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] ele = line.split(",");
            Villa villa = new Villa(ele[0], ele[1], Double.parseDouble(ele[2]), Double.parseDouble(ele[3]),
                    Integer.parseInt(ele[4]), ele[5], ele[6], Double.parseDouble(ele[7]), Integer.parseInt(ele[8]));
            villaList.put(villa, Integer.parseInt(ele[9]));
        }
        bufferedReader.close();
        return villaList;
    }

    @Override
    public void writeFile(String pathFile, Map<Villa, Integer> villas) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile));

        for (Map.Entry<Villa, Integer> entry : villas.entrySet()){
            bufferedWriter.write(entry.getKey().formatCSVFileVilla() + "," + entry.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
