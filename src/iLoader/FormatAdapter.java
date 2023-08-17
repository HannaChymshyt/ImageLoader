package iLoader;

public class FormatAdapter implements FormatViewer {

    ExtendedFormatViewer extendedFormatViewer;

    public FormatAdapter(String format) {
        if (format.equalsIgnoreCase("png")) {
            extendedFormatViewer = new PngViewer();
        }
    }

    @Override
    public void view(String fileFormat, String fileName) {

        if (fileFormat.equalsIgnoreCase("png")) {
            extendedFormatViewer.viewPNG(fileName);
        }

    }

}
