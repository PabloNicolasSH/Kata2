package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {4,2,2,4,9,8,0,1,2,6,3,7,8,5};
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        Map<Integer, Integer> histogram = histogramGenerator.getHistogram();  
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
        
        
    }
    
}
