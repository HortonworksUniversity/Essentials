# Hortonworks Sandbox Setup

This project utilizes the 
[Hortonworks Sandbox](http://hortonworks.com/products/hortonworks-sandbox/ "Hortonworks Sandbox") 
for demos.

**The specific version is an early-access HDP 2.4 image that is not publicly linkable.**

Some current gotchas are as follows:

The root password is `hadoop` *(not requiring it to be changed)*.

Ambari is available at <http://127.0.0.1:8080>, but the following commands must be run to get the `admin` userid's password set to `admin`.

`psql -U ambari ambari` will ask your for a password which is
`bigdata` and then at the `ambari=>` prompt type the following command.

```
update ambari.users set user_password = '538916f8943ec225d97a9a86a2c6ec0818c1cd400e09e03b660fdaaec4af29ddbb6f2b1033b81b00' where user_id = 1;
```

You can then just type `\q` to exit and then run `service ambari restart` and then try to log into Ambari as `admin` again.  If that does not allow you access, then run `reboot now` to restart the whole VM.

