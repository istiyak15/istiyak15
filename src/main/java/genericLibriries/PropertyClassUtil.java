package genericLibriries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Md istiyak
 *
 */

public class PropertyClassUtil {


	public String getPropertyData(String key) throws IOException {
		File propertypath=new File("/home/onebill/Desktop/JAVA/OneBill/src/test/resources/data/commondata.property");
		FileInputStream fis=new FileInputStream(propertypath);
		Properties property=new Properties();
		property.load(fis);
		String data = property.getProperty(key);
		return data;
	}

}
