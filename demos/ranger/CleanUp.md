# Clean Up Direction for [Securing Hive with Ranger](./README.md) Lab

Perform these clean up steps if the demo was previously run.

* In Ranger
	* delete the "Default Mktg Access to Trucking" policy
	* enable the "Hive Global Tables Allow" policy
* In Hive Ambari View run `drop view geo_normal_event;` 