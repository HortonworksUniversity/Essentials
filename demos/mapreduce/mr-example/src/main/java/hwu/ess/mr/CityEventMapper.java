package hwu.ess.mr;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

/**
 * Retrieve city and event from each geo record and raises them as a KVP
 */
public class CityEventMapper extends Mapper<LongWritable, Text, Text, Text> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
    
        //split up the line by comma and grab the city and event 
        String[] geoLine = value.toString().split(",");
        String city = geoLine[5];
        String event = geoLine[2];
        
        //raise KVP as city/event
        context.write( new Text(city), new Text(event) ); 
    }

}