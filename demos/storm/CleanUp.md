# Clean Up Direction for [Streaming Data into HDFS](./README.md) Lab

Perform these clean up steps if the demo was previously run.

* kill the producer (Control-C) if still running
* kill the topology from the Storm UI
* drop the HBase tables from the HBase shell
	* `disable 'truck_events'`
	* `drop 'truck_events'`
	* `disable 'driver_dangerous_events'`
	* `drop 'driver_dangerous_events'`
* delete the `/truck-events-v4` HDFS folder
* delete the topic with `/usr/hdp/current/kafka-broker/bin/kafka-topics.sh --zookeeper localhost:2181 --delete --topic truckevent`