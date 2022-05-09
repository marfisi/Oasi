package it.cascino.oasi;

import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class RunOasi{
	private static Logger log;
	
	public static void main(String[] args){
		// PropertyConfigurator.configure("logdir/log.properties");
		String log4jConfigFile = "logdir" + File.separator + "log4j2.xml";
		File file = new File(log4jConfigFile);
		
		LoggerContext context = (LoggerContext)LogManager.getContext(false);
		context.setConfigLocation(file.toURI());
		
		log = LogManager.getLogger(RunOasi.class);
		log.info("START");
		
		@SuppressWarnings("unused")
		Oasi oasi = new Oasi(args);
		
		log.info("STOP");
		System.exit(0);
	}
}
