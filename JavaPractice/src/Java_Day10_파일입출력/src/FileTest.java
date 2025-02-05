
import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("bloomberg.png"); // 상대 경로 기준으로 작성
		System.out.println(f.exists());
		
		
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.isAbsolute());
		System.out.println(f.getAbsolutePath());
		
		File src = new File("src");
		System.out.println(src.isDirectory());
		
		File folder = new File("folder");
		System.out.println(folder.exists());
		folder.mkdir();
		
		
		
	}
}
