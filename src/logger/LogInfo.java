package logger;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * @author kunal.ashar
 */

public class LogInfo
{

	public static void main(String[] args) throws IOException
	{
		Logger logger = Logger.getLogger(LogInfo.class.getName());
		
		//to delete log files
		deleteLogFiles();

		logger.info("This is Info");
		logger.error("This is Error");
		logger.warn("This is Warning");
		logger.debug("This is Debug");
		logger.fatal("This is Fatal");
	}

	public static void deleteLogFiles()

	{
		File files = new File(System.getProperty("user.dir") + "\\Logs");

		String[] entries = files.list();
		for (String s : entries)
		{
			File currentFile = new File(files.getPath(), s);
			currentFile.delete();
		}
	}
}
