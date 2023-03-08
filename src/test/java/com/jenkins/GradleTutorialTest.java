package com.jenkins;
import org.junit.Test;

public class GradleTutorialTest {

    /**
     * Checks GradleTutorial main method gets ran
     * without throwingf an exception
     */
    @Test
    public void  verifyNoExceptionThrown(){
        GradleTutorial.main(new String[]{});
    }

}