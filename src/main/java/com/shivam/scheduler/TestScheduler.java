package com.shivam.scheduler;

import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;
import net.javacrumbs.shedlock.micronaut.SchedulerLock;

@Singleton
public class TestScheduler {

    @Scheduled(cron = "${schedule.time}")
    @SchedulerLock(
            name = "testScheduler",
            lockAtMostFor = "${schedule.lock.atmost}",
            lockAtLeastFor = "${schedule.lock.atleast}"
    )
    public void testShedLock() {
        System.out.println("Ran this on this instance");
        System.out.println(LocalDateTime.now());
    }
}
