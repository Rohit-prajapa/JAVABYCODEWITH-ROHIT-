package COLLECTION_AND_ARGUMENT.Enums;

public class TestingEnums {
    static void main() {
//        Traffic color=Traffic.RED;
        Day d=Day.MONDAY;
        for (Day value : Day.values()) {
            System.out.println(value);
        }
    }
}
