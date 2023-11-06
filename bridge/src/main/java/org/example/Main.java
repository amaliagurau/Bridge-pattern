package org.example;

public class Main {
    public static void main(String[] args) {
        Application graphicApp = new GraphicApplication(new WindowsPlatform());
        graphicApp.run();

        Application textApp = new TextApplication(new LinuxPlatform());
        textApp.run();
    }
}