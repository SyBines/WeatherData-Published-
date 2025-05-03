import java.util.ArrayList;

public class WeatherData
{
    ArrayList<Double> temperatures;

    public WeatherData()
    {
        temperatures = new ArrayList<Double>();
    }

    public void cleanData(double lower, double upper)
    {
        int i = 0;

        while(i < temperatures.size())
        {
            Double t = temperatures.get(i);

            if(t < lower || t.compareTo(upper) > 0)
                temperatures.remove(i);
            else
                i++;
        }
    }

    public int longestHeatWave(double threshold)
    {
        int currentLength = 0;
        int maxLength = 0;

        for(int i = 1; i < temperatures.size(); i++)
        {
            Double before = temperatures.get(i - 1);
            Double current = temperatures.get(i);

            if(before.compareTo(threshold) > 0 &&
                    current.compareTo(threshold) > 0)
            {
                // in heat weave
                currentLength++;

                if(currentLength > maxLength)
                    maxLength = currentLength;
            }
            else
            {
                currentLength = 0;
            }
        }

        return maxLength + 1;
    }
}