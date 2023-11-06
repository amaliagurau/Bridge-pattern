package org.example;

class WindowsPlatform implements Platform {
    @Override
    public void execute() {
        System.out.println("Running on Windows");
    }
}