public class GcpStorageService implements CloudStorageService {

    @Override
    public void uploadFile(String fileName) {
        System.out.println("Uploading " + fileName + " to Google Cloud Storage");
        CloudStorageService.incrementUploadCount();
    }

    @Override
    public void downloadFile(String fileName) {
        System.out.println("Downloading " + fileName + " from Google Cloud Storage");
    }
}

