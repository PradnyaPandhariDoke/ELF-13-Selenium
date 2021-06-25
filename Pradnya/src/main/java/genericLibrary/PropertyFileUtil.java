package genericLibrary;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
	public String getProperty(String path,String reqData) throws Exception {
		File file=new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties property=new Properties();
		property.load(fis);
		String value = property.getProperty(reqData);
		return value;
	}
}
