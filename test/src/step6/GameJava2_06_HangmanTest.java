package step6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameJava2_06_HangmanTest {

    @Test
    public void playGame() {
    }

    @Test
    public void checkChar() {
    }

    @Test
    public void drawMan() {
    }

    @Test
    public void readChar() {
    }

    @Test
    public void testUnitTest(){
        //init
        GameJava2_06_Hangman hangman = new GameJava2_06_Hangman();
        boolean inputValue = true;
        //expected
        String expected = "Yes";

        //run
        String result = hangman.testUnit(inputValue);

        //assert
        Assert.assertEquals(expected, result);

    }

    @Test
    public void testUnitTest_false(){
        //init
        GameJava2_06_Hangman hangman = new GameJava2_06_Hangman();
        boolean inputValue = false;
        //expected
        String expected = "No";

        //run
        String result = hangman.testUnit(inputValue);

        //assert
        Assert.assertEquals(expected, result);

    }
}