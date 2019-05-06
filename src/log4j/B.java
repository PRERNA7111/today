package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class B 
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
	
        Divisionclass dc= new Divisionclass();
		
		try{
		int num1=90;
		int num2=0;
		dc.division(num1, num2);
		}catch(ArithmeticException e)
		{
			int num1=90;
			int num2=2;
			dc.division(num1, num2);
			logger.fatal("Catch block is executed successfully");
		}
		
		
	}

}
