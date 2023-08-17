package iLoader;

public class PngViewer implements ExtendedFormatViewer{

    @Override
    public void viewPNG(String fileName) {
        System.out.println("Viewing png file: " + fileName);
    }

}
