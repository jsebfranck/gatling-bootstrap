# Gatling bootstrap project

## Quick start

- Prerequisites : java must be installed (java 7 version has been tested and works)
- Launch the simulation with the embedded gradle : ./gradlew gatling -Psimulation=MyFirstSimulation

At the first launch, Gradle and the required dependencies will be downloaded. Then the simulation will be launched and finally, you will find the generated report in `reports` folder.

## Commands example

Launch the simulation MyFirstSimulation.scala :

```sh
./gradlew gatling -Psimulation=MyFirstSimulation
```

Launch the recorder :

```sh
./gradlew recorder
```
