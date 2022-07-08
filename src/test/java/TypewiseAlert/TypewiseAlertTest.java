package TypewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import TypewiseAlert.TypewiseAlert.CoolingType;

public class TypewiseAlertTest 
{
    @Test
    public void infersBreachAsPerLimits()
    {
      assertTrue(TypewiseAlert.inferBreach(12, 20, 30) ==
        TypewiseAlert.BreachType.TOO_LOW);
    }
    
    @Test
    public void infersBreachAsPerHighLimits()
    {
      assertTrue(TypewiseAlert.inferBreach(35, 20, 30) ==
        TypewiseAlert.BreachType.TOO_HIGH);
    }
    
    @Test
    public void infersBreachAsPerNormalLimits()
    {
      assertTrue(TypewiseAlert.inferBreach(25, 20, 30) ==
        TypewiseAlert.BreachType.NORMAL);
    }
    
    //================================================
    
    @Test
    public void classifyTemperatureBreachLowLimits()
    {
      assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING,42) ==
        TypewiseAlert.BreachType.TOO_HIGH);
    }
    
    @Test
    public void classifyTemperatureBreachHighLimits()
    {
      assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING,40) ==
        TypewiseAlert.BreachType.NORMAL);
    }
    
    @Test
    public void classifyTemperatureBreachNormalLimits()
    {
      assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING,35) ==
        TypewiseAlert.BreachType.NORMAL);
    }
}
