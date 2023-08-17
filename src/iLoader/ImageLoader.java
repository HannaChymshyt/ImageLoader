package iLoader;


public class ImageLoader {

    public static void main(String[] args) {

        FileViewer fileViewer = new FileViewer();

        fileViewer.view("jpg", "HelloWorld.jpg");
        fileViewer.view("png", "Alohomora.png");
        fileViewer.view("svg", "Arrakis.svg");

    }

}
