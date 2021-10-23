package Task_10;

public class Main {
    public static void main(String[] args) {

        final Day[] week = new Day[]{
                new Day("Monday", "Rainy"),
                new Day("Tuesday", "Cloudy"),
                new Day("Wednesday", "Sunny"),
                new Day("Thursday", "Cloudy"),
                new Day("Friday", "Sunny"),
                new Day("Saturday", "Sunny"),
                new Day("Sunday", "Sunny"),
        };

        for(int i = 0; i < 7; i++){
            System.out.println(week[i].getDayName() + ": " + week[i].getDayWeather());
        }
    }
}
