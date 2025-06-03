package multi_threading;

// Synchronous without Thread

class FileDownload {
    public void Download(String file) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(file + " downloading... " + (i * 20) + " %");
            try {
                Thread.sleep(1000); // For delaying 
            } catch (Exception e) {
            }
        }
        System.out.println(file + " Downloaded.");
    }
}

public class Practice_FileDownWOMTEx {
    public static void main(String[] args) {
        FileDownload fd = new FileDownload();
        fd.Download("Songs");
        fd.Download("Videos");
    }
}