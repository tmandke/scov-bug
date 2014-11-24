scov-bug
========

simple project to reproduce scoverage bug with multi module projects

1. clone project
2. run "sbt coverage clean test"

command fails and if you look at the report example project is not covered.
But, if you look at `example/src/main/scala/org/wierdness/example/Bar.scala`
it is covered.
