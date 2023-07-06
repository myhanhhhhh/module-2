package ss4.exercises;

import ss3.exercises.Shape;

import java.util.Arrays;
import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        System.out.println(java.time.LocalTime.now());
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Shape.shapes();
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}

