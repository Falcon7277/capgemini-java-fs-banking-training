public class AzureStorageService implements CloudStorageService {

    @Override
    public void uploadFile(String fileName) {
        System.out.println("Uploading " + fileName + " to Azure Blob Storage");
        CloudStorageService.incrementUploadCount();
    }

    @Override
    public void downloadFile(String fileName) {
        System.out.println("Downloading " + fileName + " from Azure Blob Storage");
    }
}

