# Loading Data into HDFS

**GOAL** - Load sample trucking data into HDFS for use by subsequent demos

**PREREQUISITE** - [Sandbox Setup](../SandboxSetup.md)

**SEE ALSO** - This demo is based on the publicly-available 
[Loading Data into HDFS](http://hortonworks.com/hadoop-tutorial/hello-world-an-introduction-to-hadoop-hcatalog-hive-and-pig/#section_3 "Tutorial: Loading Data") 
Hortonworks tutorial

**RECORDED DEMO**

<a href="http://www.youtube.com/watch?feature=player_embedded&v=T-mkrUyCRJs" target="_blank"><img src="http://img.youtube.com/vi/T-mkrUyCRJs/0.jpg" 
alt="Ingesting into HDFS" width="240" height="180" border="10" /></a>

**PRIOR DEMO CLEANUP** - [Cleanup](./CleanUp.md)

## Data Files

For all the demos in this Essentials course, we are focused on a trucking company example.  Save the [Geolocation.zip](./Geolocation.zip?raw=true) file to your
local disk drive and unzip it.  You should now find the following files.

* **geolocation.csv** – This is the collected geolocation data from the trucks. it contains records showing truck location, date, time, type of event, speed, etc.
* **trucks.csv** – This is data was exported from a relational database and it shows info on truck model, driverid, truckid, and aggregated mileage info.

## Log into Ambari

With a properly configured [Sandbox Setup](../SandboxSetup.md) you can  
use userid `maria_dev` with password of `maria_dev` when logging into Ambari.
Once you get to the Dashboard, click on the "Ambari View" icon that is
just to the left of the users' name in the upper right corner of the UI as
shown in the following screenshot.

![alt text](./images/SelectView.png "select view")

Clicking on _HDFS Files_ brings up the file viewer.

## Manipulating Files

At this point, it should be self-explanatory how to upload these two 
files into a new `geolocation` subdirectory of Maria's home directory 
of `/user/maria_dev`.

Be sure to showcase the new right-click popup menu.