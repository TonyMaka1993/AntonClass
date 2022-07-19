package anton.converter.file_analyser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileAnalyser analyser = new FileAnalyserImpl();
        System.out.println(analyser.getLetterCount());
        System.out.println(analyser.getWordsCount());
        System.out.println(analyser.getFileName());
    }
}