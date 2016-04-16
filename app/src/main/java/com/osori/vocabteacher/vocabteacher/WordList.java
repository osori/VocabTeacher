package com.osori.vocabteacher.vocabteacher;
import java.util.ArrayList;


/**
 * Created by Meenereem on 4/16/16.
 */
public class WordList {
    private ArrayList<Word> wordArrayList;

    public WordList(){
        wordArrayList = new ArrayList<Word>();
    }

    public void add(Word w){
        wordArrayList.add(w);
    }

    public Word get(int i){
        return this.wordArrayList.get(i);
    }

    public int size(){
        return this.wordArrayList.size();
    }
}
