package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class A 
{
	static Logger logger=Logger.getLogger(A.class);
	
	public static void main(String args[])
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info("info message");
		logger.debug("debug message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");
		
	}

}
