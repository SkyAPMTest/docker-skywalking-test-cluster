# docker-skywalking-test-cluster
A test application cluster, based on docker tech, for sky-walking tracer

A Cluster contains applications:

1. protal application, includes web container, motan-client, dubbox-client
1. cache application, includes motan-server, redis-client, jdbc-h2
1. persistence application, includes dubbox-server, mysql

This test cluster will publish as three docker images, with a compose define. Anyone can use this **test application** to show how does sky-walking tracer work.

If you want to run this, please make sure, you have basic knowledge about docker and compose, and follow the steps:
1.
