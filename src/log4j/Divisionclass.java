package log4j;

import org.apache.log4j.Logger;

public class Divisionclass
{
	static Logger logger=Logger.getLogger(Divisionclass.class);
	public void division(int a,int b)
	{
		int c=a/b;
		logger.info("After division c value is:"+c);
	}


}
