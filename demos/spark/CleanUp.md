# Clean Up Direction for [Risk Analysis with Spark](./README.md) Lab

Perform these clean up steps if the demo was previously run.

* delete the newly created Zeppelin notebooks
* as user `admin` run `drop table risk_factor_spark;` from Hive Ambari View
* as same user delete `/user/zeppelin/risk_factor_calc_ORC` HDFS directory
