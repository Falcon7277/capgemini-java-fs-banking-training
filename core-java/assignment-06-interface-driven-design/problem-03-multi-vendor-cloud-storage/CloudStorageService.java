public interface CloudStorageService {
    void uploadFile(String fileName);
    void downloadFile(String fileName);

    default void retry(String fileName) {
        int attempts = 3;

        for (int i = 1; i <= attempts; i++) {
            try {// exception handling has been added because in real world scenario a complex operation
                //like uploading a file can fail and throw exception that needs to be handled but here
                //no exceptions will be thrown as the upload operation is very basic
                uploadFile(fileName);
                return;
            } catch (Exception e) {
                System.out.println("Retry attempt " + i + " failed");
            }
        }
        System.out.println("Upload failed after retries");
    }

    static void incrementUploadCount() {
        UploadTracker.increment();
    }

    static int getUploadCount() {
        return UploadTracker.getCount();
    }
}
