package assignments_2;

public class FileDownloaderTask implements Runnable{
	private String url;

	public FileDownloaderTask(String url) {


		this.url = url;
	}
	public void run() {
		DownloadManager.download(url);
	}
	

}