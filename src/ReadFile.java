import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
    private final File file;
    String content;
    ArrayList<LinkedList> hashTab;

    public ReadFile(String fileName) {
        this.file = new File(fileName);
    }

    public String getContent() throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String test;
        while ((test = br.readLine()) !=null){
            content += "\n" + test;
        };
        return content;
    }

    public void putInList(String word){
        hashTab;
    }
}


