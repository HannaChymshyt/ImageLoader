package iLoader;

public class FileViewer implements FormatViewer {

    FormatAdapter formatAdapter;

    @Override
    public void view(String fileFormat, String fileName) {

        if (fileFormat.equalsIgnoreCase("jpg")) {
            System.out.println("Viewing jpg image: " + fileName);
        } else if (fileFormat.equalsIgnoreCase("png")) {
            formatAdapter = new FormatAdapter(fileFormat);
            formatAdapter.view(fileFormat, fileName);
        } else {
            System.out.println("Invalid image. " + fileFormat + " format not supported");
        }

    }

}
