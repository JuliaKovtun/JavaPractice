package Task_10;

public class Day {
    private String dayName;
    private Weather dayWeather;

    public Day(final String dayName, final String dayWeather){
        this.dayName = dayName;
        this.dayWeather = new Weather(dayWeather);
    }

    public String getDayName() { return dayName; }
    public String getDayWeather() { return dayWeather.getWeather(); }
    public void setDayName(final String dayName) { this.dayName = dayName; }
    public void setDayWeather(final String dayWeather) { this.dayWeather.setWeather(dayWeather); }
}
