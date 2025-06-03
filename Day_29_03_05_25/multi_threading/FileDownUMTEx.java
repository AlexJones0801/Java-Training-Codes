package multi_threading;

// Asynchronous using Multi Threading 

class Downloader extends Thread{
    String FileName;
    public Downloader(String fn){
        this.FileName = fn;
    }

    public void run() {
        for(int i=0; i<=5;i++) {
            System.out.println(FileName + " downloading... " + (i*20) + "%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println(FileName + " downloaded.");
    }
}

public class FileDownUMTEx {
    public static void main(String[] args) {
        Downloader f1 = new Downloader("Blasphemous");
        Downloader f2 = new Downloader("Dying Light");

        f1.start();
        f2.start();
    }
}
