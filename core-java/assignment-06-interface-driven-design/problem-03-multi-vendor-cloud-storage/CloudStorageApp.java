public class CloudStorageApp {
    public static void main(String[] args) {
        CloudStorageService storage1 =
                CloudStorageFactory.getProvider("AWS");

        storage1.uploadFile("report.pdf");
        storage1.uploadFile("image.png");
        storage1.downloadFile("report.pdf");

        System.out.println("Total uploads across all providers: " + CloudStorageService.getUploadCount());

        CloudStorageService storage2 = CloudStorageFactory.getProvider("AWS");

        storage2.retry("invoice.pdf");
        storage2.retry("image.png");

        System.out.println("Total uploads: " + CloudStorageService.getUploadCount());
    }
}
