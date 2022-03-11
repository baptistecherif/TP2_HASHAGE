import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LetterAndWord {
    private final String word;
    private final ArrayList<String> wordLetter;

    public LetterAndWord(String word) {
        this.word = word;
        this.wordLetter = new ArrayList<>();
    }

    public void setSplitWord(){
        char [] charWord = word.toCharArray();
        for(char c : charWord){
            String toString = ""+c;
            wordLetter.add(toString);
        }
    }

    public String getWord(){
        return this.word;
    }

    public ArrayList<String> getSplitWord(){
        setSplitWord();
        Collections.sort(wordLetter);
        return this.wordLetter;
    }


}
