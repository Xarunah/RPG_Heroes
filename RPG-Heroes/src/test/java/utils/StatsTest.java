package utils;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatsTest {

    private Stats statsTest;

    @Before
    public void init () {
        statsTest = new Stats (4,8,9);
    }

    @Test
    public void StrengthTest () {
        assertEquals(statsTest.getStrength(),4);
    }

    @Test
    public void DexterityTest () {
        assertEquals(statsTest.getDexterity(),8);
    }

    @Test
    public void IntelligenceTest () {
        assertEquals(statsTest.getIntelligence(),9);
    }
}
