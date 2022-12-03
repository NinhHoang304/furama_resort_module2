package services;

import java.util.List;

public interface IFileService<Object> {

    List<Object> readFile(String pathFile);

    void writeFile(String pathFile, List<Object> objects);
}
