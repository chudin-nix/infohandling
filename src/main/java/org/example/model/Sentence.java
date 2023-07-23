package org.example.model;

import java.util.List;

public class Sentence {
    private List<Lexeme> wordList;
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public List<Lexeme> getWordList() {
        return wordList;
    }

    public void setWordList(List<Lexeme> wordList) {
        this.wordList = wordList;
    }
}
