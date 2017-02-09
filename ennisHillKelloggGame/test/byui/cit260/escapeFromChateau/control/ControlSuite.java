/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromChateau.control;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author amikellogg
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({byui.cit260.escapeFromChateau.control.MathStoneTest.class, byui.cit260.escapeFromChateau.control.InventoryControlTest.class, byui.cit260.escapeFromChateau.control.MapControlTest.class, byui.cit260.escapeFromChateau.control.MathLockControlTest.class, byui.cit260.escapeFromChateau.control.GameControlTest.class, byui.cit260.escapeFromChateau.control.MathAntidoteControlTest.class})
public class ControlSuite {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
