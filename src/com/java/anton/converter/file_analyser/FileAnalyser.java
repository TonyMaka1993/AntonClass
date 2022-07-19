package anton.converter.file_analyser;

import java.io.IOException;

public interface FileAnalyser {
    String getFileName();
    int getRowsCount() throws IOException;
    int getLetterCount() throws IOException;
    int getWordsCount() throws IOException;
    String getLongestWord();
    void saveSummary(String filePath) throws IOException;
}