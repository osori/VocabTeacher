package com.osori.vocabteacher.vocabteacher;

/**
 * Created by Ilkyu on 4/16/16.
 */
public class Word {
    private String word = null;
    private String meaning = null;
    private int language = 0;

    public Word(String word, String meaning, int language) {
        this.word = word;
        this.meaning = meaning;
        this.language = language;
    }

    public String getWord(){
        return word;
    }

    public void setWord(String word){
        this.word = word;
    }


    public String getMeaning(){
        return meaning;
    }

    public void setMeaning(String meaning){
        this.meaning = meaning;
    }

    public int getLanguage(){
        return language;
    }

    public void setLanguage(int language){
        this.language = language;
    }
}
