# Falcon Cluster Management

While the Falcon UI can be used to find/manage processes such as `MirrorTest`
created in [Data Backup with Falcon](README.md), it currently does not
offer a rich set of tools to manage Hadoop clusters beyond the helpful "add
cluster" wizard UI component.  

For this, we need to leverage the 
[FalconCLI](https://falcon.apache.org/FalconCLI.html "FalconCLI")
which can be invoke by simply typing `falcon help` at a command line for an
exhaustive list of options available.

## List Clusters

```
[falcon@sandbox ~]$ falcon entity -list -type cluster
3
(CLUSTER) backupCluster
(CLUSTER) bogusCluster
(CLUSTER) primaryCluster
```

## Delete Cluster

```
[falcon@sandbox ~]$ falcon entity -type cluster -name bogusCluster -delete
falcon/default/bogusCluster(cluster) removed successfully 
```