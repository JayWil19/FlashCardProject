/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcardapp;

/**
 *
 * @author jtw22
 */
public class FlashCard {
    private String term;
    private String answer;

    public FlashCard() {
    }

    public FlashCard(String term, String answer) {
        this.term = term;
        this.answer = answer;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "FlashCard{" + "term=" + term + ", answer=" + answer + '}';
    }
    
    
}
