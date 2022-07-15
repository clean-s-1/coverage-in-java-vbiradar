package TypewiseAlert;

public class TypewiseAlert 
public static BreachTypes inferBreach(double value, double lowerLimit, double upperLimit) {
		if (value < lowerLimit) {
			return BreachTypes.TOO_LOW;
		}
		if (value > upperLimit) {
			return BreachTypes.TOO_HIGH;
		}
		return BreachTypes.NORMAL;
	}

	public static boolean checkAndAlert(AlertTargets alertTargets, CoolingTypes coolingType, double temperature) {
		BreachTypes breachTypes = inferBreach(temperature, coolingType.getLowerLimit(), coolingType.getUpperLimit());
		return alertForBreach(alertTargets, breachTypes);
	}

	private static boolean alertForBreach(AlertTargets alertTarget, BreachTypes breachTypes) {
		switch (alertTarget) {
		case TO_CONTROLLER:
			return sendToController(breachTypes);
		case TO_MAIL:
			return sendToEmail(breachTypes.getMsg());
		}
		return false;
	}

	public static boolean sendToController(BreachTypes breachType) {
		int header = 0xfeed;
		System.out.printf(header + " : " + breachType);
		return true;
	}

	public static boolean sendToEmail(String message) {
		String recepient = "a.b@c.com";
		System.out.println("To:" + recepient);
		System.out.println("To:" + message);
		return true;
	}
}
