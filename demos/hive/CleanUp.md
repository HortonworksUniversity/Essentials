# Clean Up Direction for [Data Manipulation with Hive](./README.md) Lab

Perform these clean up steps if the demo was previously run.

* as user `maria_dev` run the following from Hive Ambari View
	* `drop table avg_mileage;`
	* `drop table truck_mileage;`
	* `drop table trucks;`
	* `drop table geolocation;`
	* `drop table trucks_stage;`
	* `drop table geolocation_stage;`
	* reload HDFS folder `/user/maria_dev/geolocation` from instruction in [Loading Data into HDFS](../hdfs/README.md)
