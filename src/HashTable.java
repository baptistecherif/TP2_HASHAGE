import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable {
    private ArrayList<LinkedList<WordAndSorted>> hashTable = new ArrayList<>();
    private final int ALPHABETIC_ORDER_CONSTANT = 256;
    private final int modulo;

    public HashTable(int wordNumber) {
        int tmpModulo = wordNumber / 3;
        for(int i = tmpModulo ; !isPremier(i) ; i++){
            tmpModulo++;
        }
        modulo = tmpModulo;
        for(int index = 0 ; index != modulo; index++){
            hashTable.add(new LinkedList<>());
        }
    }

    private boolean isPremier(int n){
        boolean isPremier = true;
        for(int index = (int) Math.round(Math.sqrt(n)); index > 1 ; index--){
            if(n % index == 0)
                isPremier = false;
        }
        return isPremier;
    }

    //si il n'est pas divisible par les nombres qui sont inférieurs à sa racine carée

    //TODO y a t-il deux mots dans le dico dont la sommes donne le mot courant

    private int indexCalculation(WordAndSorted word){
        int wordIndex = 0;
        int power = word.getWordSorted().length - 1;
        for(int index = 0 ; index != word.getWordSorted().length - 1 ; index++){
            wordIndex += word.getWordSorted()[index] * Math.pow(ALPHABETIC_ORDER_CONSTANT, power);
            wordIndex = wordIndex % modulo;
            power--;
        }
        //System.out.println(modulo);
        return wordIndex;
    }

    public void addToHashTable(WordAndSorted word){
        hashTable.get(indexCalculation(word)).add(word);
    }

    public ArrayList<LinkedList<WordAndSorted>> getHashTable(){
        return hashTable;
    }

    @Override
    public String toString() {
        return hashTable.toString();
    }
}