# micronaut-shedlock
# Code to demonstrate an example in micronaut application configured with Shedlock to handle scheduler running on different instance
Tech used:
- Java 11
- Micronaut Framework
- Postgresql
- Flyway
- Shedlock
- Atleast 1 table which handles jpa
- Configured multiple instance of same application on different PORT in intellij
- Used Dbeaver to check an entry got inserted into shedlock table

# Changes required
- Add Lock Provider config class
- Add Configuration in application.yml related to shedlock & atmost & atleast
- Add @SchedulerLock in TestScheduler class
- Added jars in build.gradle
- Added Shedlock table using flyway
