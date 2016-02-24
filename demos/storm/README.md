# Streaming Data into HDFS

<a href="http://www.youtube.com/watch?feature=player_embedded&v=T-mkrUyCRJs" target="_blank"><img src="http://img.youtube.com/vi/T-mkrUyCRJs/0.jpg" 
alt="Ops with Ambari" width="240" height="180" border="10" /></a>

This demo is based on the publicly-available 
[Loading Data into HDFS](http://hortonworks.com/hadoop-tutorial/simulating-transporting-realtime-events-stream-apache-kafka/ "Tutorial: Real Time Data Transportation and Ingestion") 
Hortonworks tutorial.

## Generating Events into Kafka

After using Ambari to verify the Kafka service is running (and start if
necessary), create/verify a new Topic.

```
[root@sandbox ~]# cd /usr/hdp/current/kafka-broker/bin/
[root@sandbox bin]# ./kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic truckevent
[root@sandbox bin]# ./kafka-topics.sh --list --zookeeper localhost:2181
```

Then download the event generator code.

```
[root@sandbox ~]# mkdir /opt/TruckEvents   
[root@sandbox ~]# cd /opt/TruckEvents   
[root@sandbox TruckEvents]# wget https://www.dropbox.com/s/rv43a05czfaqjlj/Tutorials-master-2.3.zip  
[root@sandbox TruckEvents]# unzip Tutorials-master-2.3.zip
```

To start the Kafka Producer, execute the following command.

```
[root@sandbox TruckEvents]# cd /opt/TruckEvents/Tutorials-master 
[root@sandbox Tutorials-master]# java -cp target/Tutorial-1.0-SNAPSHOT.jar com.hortonworks.tutorials.tutorial1.TruckEventsProducer sandbox.hortonworks.com:6667 sandbox.hortonworks.com:2181
```

After a few seconds, press Control-C to stop the producer.

We have now successfully compiled and had the Kafka producer publish some messages to the Kafka cluster.  To verify, execute the following command to start a consumer to see the produced events.

```
[root@sandbox Tutorials-master]# /usr/hdp/current/kafka-broker/bin/kafka-console-consumer.sh --zookeeper sandbox.hortonworks.com:2181 --topic truckevent --from-beginning
```

You can press Control-C to stop the console consumer.


## Process Events with Storm


