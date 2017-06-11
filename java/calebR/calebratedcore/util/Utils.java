package calebR.calebratedcore.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import calebR.calebratedcore.CalebRatedCore;

public class Utils {
	
	private static Logger logger;
	
	public static Logger getLogger(){
		if(logger == null){
			logger = LogManager.getFormatterLogger(CalebRatedCore.modId);
		}
		return logger;
	}

}
