package chain_of_reponsibility;

/**
 * Our Example File class which is some kind of data ...
 *
 *
 * */
public class File {

    // This is the class that the Handler checks to see if it can handle this fileType ... all else is extra


    private final String fileName;
    private final String fileType;
    private final String filePath;

    public File(String fileName, String fileType, String filePath) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }

    String getFileName() {
        return this.fileName;
    }
    String getFileType() {
        return this.fileType;
    }
    String getFilePath() {
        return this.filePath;
    }
}
