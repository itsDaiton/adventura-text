package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CharacterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CharacterTest
{
    Item coChce;
    Item coNechce;
    Item coMiDa;
    Character trader;
    Inventory inventory;
    
    @Before
    public void setUp()
    {
       coChce = new Item("coChce", "popis1", true, false, 0, 0);
       coNechce = new Item("coNechce", "popis2", true, false, 0, 0);
       coMiDa = new Item("coMiDa", "popis3", true, false, 0, 0);
       trader = new Character("trader", true, false, "test");
       trader.setTradingParameters(coMiDa, coChce, "potom", "predtim", "nechci", "chci", false);
       inventory = new Inventory();
    }
    
    @Test
    public void testTrade()
    {
        assertNull(trader.trade(coNechce));
        assertEquals(coMiDa, trader.trade(coChce));
    }
}
