package TypewiseAlert;

public enum CoolingTypes {

	PASSIVE_COOLING(0, 35), HI_ACTIVE_COOLING(0, 45), MED_ACTIVE_COOLING(0, 45);

	public int getLowerLimit() {
		return lowerLimit;
	}

	public int getUpperLimit() {
		return upperLimit;
	}

	private int lowerLimit;
	private int upperLimit;

	CoolingTypes(int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

}
