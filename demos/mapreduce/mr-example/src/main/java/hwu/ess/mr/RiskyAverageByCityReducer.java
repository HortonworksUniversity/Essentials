package hwu.ess.mr;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;

/**
 * For each city, return the nbr of events, nbr of risky events, and average risky percentage
 */
public class RiskyAverageByCityReducer extends Reducer<Text, Text, Text, Text> {

    @Override
    protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {

        //setup counters
        int totalEvents = 0;
        int totalRisky = 0;
        String eventType = null;

        //loop through all values
        for(Text value : values) {   //loop through all values
            totalEvents++;   //update total nbr of events
            eventType = value.toString();
            if( ! eventType.equals("normal") ) {
                totalRisky++;   //add one to total nbr of risky events
            }
        }
        
        //build a formatted values - totalEvents,totalRisky,percentageRisky
        StringBuilder sb = new StringBuilder("{");
        sb.append(totalEvents);
        sb.append(",");
        sb.append(totalRisky);
        sb.append(",");
        sb.append( ((double) totalRisky) / totalEvents );
        sb.append("}");
        
        //raise KVP as city/formattedAnswer
        context.write(key, new Text(sb.toString()));
    }

}