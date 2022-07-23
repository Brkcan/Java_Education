package org.education.recursion.floodfill;

public final class FloodFillApp {

    private FloodFillApp()
    {}

    public static void run(String [] args)
    {
        TextImage textImage = new TextImage(25, 60);

        //textImage.loadBitmap("pattern.txt");
        textImage.loadBitmap("C:/Users/10351/IdeaProjects/Java-1_OguzKaran/Java_Education/src/main/java/org/education/recursion/floodfill/pattern.txt");

        System.out.println(textImage);

        textImage.floodFill(4,4, '-', '#');

        textImage.saveImage("C:/Users/10351/IdeaProjects/Java-1_OguzKaran/Java_Education/src/main/java/org/education/recursion/floodfill/myImage.txt");

    }
}
