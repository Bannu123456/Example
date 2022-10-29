package ashbankingv1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readconfig
{
Properties pro;
public readconfig()
{
File fsrc= new File("./configure/config.properties");	
try
{
	FileInputStream fis =new FileInputStream(fsrc);
	pro=new Properties();
	pro.load(fis);
	
}
catch(Exception e)
{
	System.out.println(e.getMessage());
}
}
public String getApplicationURL()
{
	String url=pro.getProperty("url");
	return url;
}

public String getUsername()
{
String username=pro.getProperty("username");
return username;
}

public String getPassword()
{
String password=pro.getProperty("password");
return password;
}

public String getChromePath()
{
String chromepath=pro.getProperty("chromepath");
return chromepath;
}
public String getFirefoxPath()
{
String firefoxpath=pro.getProperty("firefoxpath");
return firefoxpath;
}


}
