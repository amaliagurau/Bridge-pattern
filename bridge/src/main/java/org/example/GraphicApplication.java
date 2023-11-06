package org.example;

class GraphicApplication extends Application {
    public GraphicApplication(Platform platform) {
        super(platform);
    }

    @Override
    void run() {
        System.out.print("Graphic application is ");
        platform.execute();
    }
}