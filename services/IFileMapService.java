package services;

import java.io.IOException;
import java.util.Map;

public interface IFileMapService<O, T> {

    Map<O, T> readFile(String pathFile) throws IOException;

    void writeFile(String pathFile, Map<O, T> object) throws IOException;
}
