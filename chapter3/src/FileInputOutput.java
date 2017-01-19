import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
/**
* 文件输入输出
*/
public class FileInputOutput{
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("/home/yshin1992/development/Git/JavaCore/chapter3/src/FirstSample.java"));
		while(scan.hasNext())
		{
			System.out.println(scan.nextLine());
		}
		scan.close();
		
		String userDir = System.getProperty("user.dir");
		PrintWriter pw = new PrintWriter(new File("/home/yshin1992/tmp.txt"));
		pw.write("这是第一行");
		pw.write("这是第二行");
		pw.write("这是最后一行");
		pw.flush();
		pw.close();
	}	
}
