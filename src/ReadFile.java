import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
    private final File file;
    String content;
    ArrayList<LinkedList<LetterAndWord>> hashTab = new ArrayList<>();

    public ReadFile(String fileName) {
        this.file = new File(fileName);
    }

    public String getContent() throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String words;
        while ((words = br.readLine()) !=null){
            content += "\n" + words;
        };
        return content;
    }

    public void putInList(String word){
        LinkedList<LetterAndWord> lk = new LinkedList<LetterAndWord>();
        lk.add();
        hashTab.add();
    }
}


