package TypewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TypewiseAlertTest 
{
    @Test
    public void infersBreachAsPerLimits()
    {
      assertTrue(TypewiseAlert.inferBreach(12, 20, 30) ==
        BreachTypes.TOO_LOW);
    }
    
    @Test
    public void infersBreachAsPerHighLimits()
    {
      assertTrue(TypewiseAlert.inferBreach(35, 20, 30) ==
    		  BreachTypes.TOO_HIGH);
    }
    
    @Test
    public void infersBreachAsPerNormalLimits()
    {
      assertTrue(TypewiseAlert.inferBreach(25, 20, 30) ==
    		  BreachTypes.NORMAL);
    }
    
    //================================================
    
    @Test
    public void checkAlert_controller_Passive_cooling() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTargets.TO_CONTROLLER,CoolingTypes.PASSIVE_COOLING,31));
    }

    @Test
    public void checkAlert_controller_Med_cooling() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTargets.TO_CONTROLLER,CoolingTypes.MED_ACTIVE_COOLING,35));
    }
    @Test
    public void checkAlert_controller_High_ACIVE_COOLING() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTargets.TO_CONTROLLER,CoolingTypes.HI_ACTIVE_COOLING,49));
    }
    @Test
    public void checkAlert_mail_Passive_cooling() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTargets.TO_MAIL,CoolingTypes.PASSIVE_COOLING,28));
    }

    @Test
    public void checkAlert_mail_active_cooling() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTargets.TO_MAIL,CoolingTypes.HI_ACTIVE_COOLING,46));
    }
    @Test
    public void checkAlert_mail_mid_active_cooling() {
        assertTrue(TypewiseAlert.checkAndAlert(AlertTargets.TO_MAIL,CoolingTypes.MED_ACTIVE_COOLING,35));
    }
}
