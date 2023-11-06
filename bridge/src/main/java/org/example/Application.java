package org.example;

abstract class Application {
    protected Platform platform;

    protected Application(Platform platform) {
        this.platform = platform;
    }

    abstract void run();
}