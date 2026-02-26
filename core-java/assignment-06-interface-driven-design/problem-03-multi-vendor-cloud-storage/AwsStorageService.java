public class AwsStorageService implements CloudStorageService {

    @Override
    public void uploadFile(String fileName) {
        System.out.println("Uploading " + fileName + " to AWS S3");
        CloudStorageService.incrementUploadCount();
    }

    @Override
    public void downloadFile(String fileName) {
        System.out.println("Downloading " + fileName + " from AWS S3");
    }
}

