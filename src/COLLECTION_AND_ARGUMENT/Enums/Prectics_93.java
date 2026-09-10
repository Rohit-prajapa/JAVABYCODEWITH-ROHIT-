package COLLECTION_AND_ARGUMENT.Enums;
enum Day1{
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THRUSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    Day1(boolean weekday) {
        this.weekday = weekday;
    }

    private boolean weekday;

    public String getType() {
        return weekday? "Weekday": "Weekend";
    }
}
public class Prectics_93 {
    static void main() {
        for (Day1 day : Day1.values()) {
            System.out.println(day + " - " + day.getType());
        }
    }
}
