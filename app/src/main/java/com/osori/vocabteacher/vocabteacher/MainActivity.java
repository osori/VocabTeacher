package com.osori.vocabteacher.vocabteacher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.EditText;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    public Word myWord = new Word("apple", "苹果🍎", 1);
    // ArrayList<Word> wordList = new ArrayList<Word>();
    public WordList myWordList = new WordList();
    EditText edit;
    int i = 0;


    //private EditText txtWord = (EditText) layout.findViewById(R.id.txtWord);
    //private EditText txtMeaning = (EditText) layout.findViewById(R.id.txtMeaning);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ArrayList<Integer> test = new ArrayList<Integer>();


        //wordList.add(myWord);
        myWordList.add(new Word("ugly", "丑 (chǒu)", 1));
        myWordList.add(new Word("pretty", "漂亮 (piào liang)", 1));
        myWordList.add(new Word("cherry blossoms", "벚꽃", 2));
        myWordList.add(new Word("programmer", "프로그래머", 2));
        myWordList.add(new Word("snow", "雪（ゆき)", 3));
        myWordList.add(new Word("flower", "花（はな）", 3));
        myWordList.add(new Word("happy", "高兴 (gāo xìng)", 1));
        myWordList.add(new Word("hot pot", "火锅 (huǒ guō)", 1));
        myWordList.add(new Word("spicy", "매운", 2));
        myWordList.add(new Word("chair", "의자", 2));
        myWordList.add(new Word("lamp", "lampara", 4));
        myWordList.add(new Word("honey", "꿀", 2));
        myWordList.add(new Word("furniture", "가구", 2));
        myWordList.add(new Word("pig", "猪 (zhū)", 1));
        myWordList.add(new Word("teacher", "老师 (lǎo shī)", 1));


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);



        webview.loadUrl("https://duckduckgo.com/?q=" + myWord.getWord() + "&ia=images&iax=1");
        //webview.loadUrl("http://www.google.com");


        TextView txtWord = (TextView) findViewById(R.id.txtWord);
        txtWord.setText(myWord.getWord() + "\n" + myWord.getMeaning());



    }

    public void buttonOnClick(View v) {
        TextView txtWord = (TextView) findViewById(R.id.txtWord);

        if(i == myWordList.size()){
            i=0;
        }

        WebView webview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Word w = myWordList.get(i);




        txtWord.setText(w.getWord() + "\n" + w.getMeaning());
        webview.loadUrl("https://duckduckgo.com/?q=" + w.getWord() + "&ia=images&iax=1");

        i++;

    }

    public void add(View v){

        EditText myTxtWord = (EditText)findViewById(R.id.editText);
        EditText myTxtMeaning = (EditText)findViewById(R.id.editText2);

        String strWord = myTxtWord.getText().toString();
        String strMeaning = myTxtMeaning.getText().toString();


        Word newWord = new Word (strWord, strMeaning, 1);

        myWordList.add(newWord);

    }





}