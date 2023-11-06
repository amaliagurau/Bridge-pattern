package org.example;

class TextApplication extends Application {
    public TextApplication(Platform platform) {
        super(platform);
    }

    @Override
    void run() {
        System.out.print("Text application is ");
        platform.execute();
    }
}