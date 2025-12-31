package in.coding.challenge93;

public enum Day {
    SATURDAY(false),
    SUNDAY(true),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(false);

    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "weekday" : "weekend";
    }
}
