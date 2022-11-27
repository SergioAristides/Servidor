package com.Cine.CineProyect.Modelos;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Chair {
    char letter;
    int number;

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
