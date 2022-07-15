package TypewiseAlert;

public enum BreachTypes {
	
	NORMAL(""),
    TOO_LOW("THE TEMPERATURE IS TOO LOW"),
    TOO_HIGH("THE TEMPERATURE IS TOO HIGH");

    public String getMsg() {
        return msg;
    }

    private String msg;

    BreachTypes(String msg) {
        this.msg = msg;
    }

}
