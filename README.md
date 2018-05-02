# kotlin_examples

1. helloworld

toy "Hello world" example

2. multiproject example

In the multiproject folder there are 2 separate projects, one called "nested" which contains an
android library project called "multiprojectlibrary" which "nested" references via a grade include.

The "multipleprojectlibrary" uses the maven publish plugin to publish the aar to mavenLocal via the command gradle publishToMavenLocal.

In the "independent" project "multipleprojectlibrary" is a dependency which is read from mavenLocal.


