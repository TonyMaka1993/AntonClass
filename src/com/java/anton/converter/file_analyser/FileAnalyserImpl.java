package anton.converter.file_analyser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import java.util.Arrays;

public class FileAnalyserImpl implements FileAnalyser {
    int count = 0;
    private final String filePath = "C:\\AntonClass\\src\\com\\java\\anton\\converter\\file_analyser\\input.txt";
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
        return new StringTokenizer(filePath, "r").countTokens();
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
        String [] words = filePath.split("");
        Arrays.sort(words);
        int count = 0;
        String longest = "";
        for (String string:words){
            if (string.length()>count) {
                count = string.length();
                longest = string;
            }
        }
        return longest;
    }

    @Override
    public void saveSummary(String filePath) throws IOException {
        getFileName();
        getRowsCount();
        getLetterCount();
        getWordsCount();
        getLongestWord();

     File file = new File ("C:\\AntonClass\\src\\com\\java\\anton\\converter\\file_analyser\\summary.txt");
     if (file.createNewFile()){
         System.out.println("File is created!");
     }
     else{
             System.out.println("File is already exists!");
       }
       FileWriter writer = new FileWriter(file);
     writer.write("Test");
     writer.close();
    }
}