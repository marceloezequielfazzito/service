package com.eduit.service.test;

import com.eduit.service.numeric.Meter;
import com.eduit.service.numeric.NumericLine;
import org.junit.Assert;
import org.junit.Test;

public class NumericLineTest {

    private NumericLine numericLine;
    private Meter fiveMeters;
    private boolean inLine;

    @Test
    public void fiveMetersShouldBeInside(){
        givenANumericLine();
        whenAskIf5MetersIsInLine();
        thenMustBeInside();
    }

    @Test
    public void hundredMetersShouldNotBeInside(){
        givenANumericLine();
        whenAskIf100MetersIsNotInLine();
        thenMustNotBeInside();
    }

    private void thenMustBeInside() {
        Assert.assertEquals(true, inLine);
    }

    private void thenMustNotBeInside() {
        Assert.assertEquals(false, inLine);
    }

    private void whenAskIf5MetersIsInLine() {
        fiveMeters = new Meter(5);
        inLine = numericLine.isInLine(fiveMeters);
    }

    private void whenAskIf100MetersIsNotInLine() {
        fiveMeters = new Meter(100);
        inLine = numericLine.isInLine(fiveMeters);
    }

    private void givenANumericLine() {
        numericLine = new NumericLine(0,10);
    }


}
