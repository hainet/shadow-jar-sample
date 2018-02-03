package com.hainet;

public final class Main {

    /**
     * How to run
     * gradlew runShadow
     * or
     * gradlew shadowJar -> java -jar shadow-jar-sample-1.0.0-SNAPSHOT.jar 'Hello Shadow Jar!'
     *
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println(args[0]);
    }
}
