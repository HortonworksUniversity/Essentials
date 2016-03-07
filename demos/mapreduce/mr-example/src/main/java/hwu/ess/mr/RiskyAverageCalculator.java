package hwu.ess.mr;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * MapReduce Driver
 */
public class RiskyAverageCalculator {

    public static void main(String[] args) throws Exception {
    
        if(args.length != 2) {
            System.out.println("Usage: RiskyAverageCalculator <input dir> <output dir>");
            System.exit(-1);
        }    
    
        Job job = Job.getInstance();
        job.setJobName("CtyEvntAvg");

        job.setJarByClass(RiskyAverageCalculator.class);
        job.setMapperClass(CityEventMapper.class);
        job.setReducerClass(RiskyAverageByCityReducer.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(Text.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);

        FileInputFormat.setInputPaths(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }

}