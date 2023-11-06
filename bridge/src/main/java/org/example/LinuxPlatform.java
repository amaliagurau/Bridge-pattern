package org.example;

class LinuxPlatform implements Platform {
    @Override
    public void execute() {
        System.out.println("Running on Linux");
    }
}