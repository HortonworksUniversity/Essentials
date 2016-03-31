# Clean Up Direction for [Data Backup with Falcon](./README.md) Lab

Perform these clean up steps if the demo was previously run.

* delete `MirrorTest` job from Falcon
* use instructions in [Falcon Cluster Management](ClusterManagement.md) to delete
	* `primaryCluster`
	* `backupCluster`
* clean out contents of `/fakeDestCluster` HDFS directory
