package logger;

import org.apache.log4j.Logger;


public class LogInfo
{

	public static void main(String[] args)
	{		
		Logger logger = Logger.getLogger(LogInfo.class.getName());
		
		logger.info("This is Info");
		logger.error("This is Error");
		logger.warn("This is Warning");
		logger.debug("This is Debug");
		logger.fatal("This is Fatal");		
	}
}
