package anton.converter.file_analyser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class FileAnalyserImpl implements FileAnalyser {
    int count = 0;
    private final String filePath = "E:\\AntonClass\\src\\com\\java\\anton\\converter\\file_analyser\\input.txt";
    private static final String FILE_NAME = "input.txt";

    RandomAccessFile file;

    {
        try {
            file = new RandomAccessFile(filePath, "r");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String getFileName() {
        return "fileName: " + FILE_NAME;
    }

    @Override
    public int getRowsCount() throws IOException {
        return 0;
    }

    @Override
    public int getLetterCount() throws IOException {

        return (int) file.length();
    }

    @Override
    public int getWordsCount() throws IOException {
        return  new StringTokenizer(new String(Files.readAllBytes(Paths.get(filePath)))).countTokens();
    }

    @Override
    public String getLongestWord() {
        return null;
    }

    @Override
    public void saveSummary(String filePath) throws IOException {
        getFileName();
        getRowsCount();
        getLetterCount();
        getWordsCount();
        getLongestWord();

        // save
    }
}