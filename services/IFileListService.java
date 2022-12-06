package services;

import java.io.IOException;
import java.util.List;

public interface IFileListService<O> {

    List<O> readFile(String pathFile) throws IOException;

    void writeFile(String pathFile, List<O> objects) throws IOException;
}
