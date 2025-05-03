import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Test case 1 — One heat wave of length 3
        WeatherData wd1 = new WeatherData();
        wd1.temperatures = new ArrayList<>(Arrays.asList(101.0, 102.0, 103.0, 95.0));
        System.out.println(wd1.longestHeatWave(100.5)); // Expected: 3

        // Test case 2 — Multiple heat waves, pick the longest
        WeatherData wd2 = new WeatherData();
        wd2.temperatures = new ArrayList<>(Arrays.asList(96.0, 97.0, 89.0, 101.0, 102.0, 103.0, 95.0));
        System.out.println(wd2.longestHeatWave(95.5)); // Expected: 3

        // Test case 3 — Heat wave at the end
        WeatherData wd3 = new WeatherData();
        wd3.temperatures = new ArrayList<>(Arrays.asList(90.0, 95.0, 101.0, 102.0));
        System.out.println(wd3.longestHeatWave(100.0)); // Expected: 2

        // Test case 4 — No heat wave
        WeatherData wd4 = new WeatherData();
        wd4.temperatures = new ArrayList<>(Arrays.asList(90.0, 95.0, 98.0, 96.0));
        System.out.println(wd4.longestHeatWave(100.0)); // Expected: 0

        // Test case 5 — Heat wave of exactly 2
        WeatherData wd5 = new WeatherData();
        wd5.temperatures = new ArrayList<>(Arrays.asList(101.0, 102.0, 90.0));
        System.out.println(wd5.longestHeatWave(100.0)); // Expected: 2

        // Test case 6 — Two waves, second is longer
        WeatherData wd6 = new WeatherData();
        wd6.temperatures = new ArrayList<>(Arrays.asList(101.0, 102.0, 90.0, 103.0, 104.0, 105.0));
        System.out.println(wd6.longestHeatWave(100.0)); // Expected: 3

        // Test case 7 — Only one heat wave day, should return 0 (since a heat wave requires 2+ days)
        WeatherData wd7 = new WeatherData();
        wd7.temperatures = new ArrayList<>(Arrays.asList(90.0, 101.0, 95.0));
        System.out.println(wd7.longestHeatWave(100.0)); // Expected: 0

        // Test case 8 — Removing temperatures that are outside the range [85.0, 120.0]
        WeatherData wd8 = new WeatherData();
        wd8.temperatures = new ArrayList<>(Arrays.asList(120.0, 85.0, 95.0, 82.0, 110.0));
        wd8.cleanData(85.0, 120.0);
        System.out.println(wd8.temperatures); // Expected: [120.0, 85.0, 95.0, 110.0]
    }
}