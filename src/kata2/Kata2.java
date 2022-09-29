package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        // Integer [] data = {4,2,2,4,9,8,0,1,2,6,3,7,8,5};
        String [] data = {"Pepe", "María", "María", "Rosa", "Luis", "María", "Luis", "María"};
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        Map<String, Integer> histogram = histogramGenerator.getHistogram();  
        
        for (Map.Entry<String, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
        
    }
    
}
