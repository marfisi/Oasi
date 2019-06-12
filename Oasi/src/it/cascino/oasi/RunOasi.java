package it.cascino.oasi;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class RunOasi{
	private static Logger log;
	
	public static void main(String[] args){
		PropertyConfigurator.configure("logdir/log.properties");
		log = Logger.getLogger(RunOasi.class);
		log.info("START");
		
		@SuppressWarnings("unused")
		Oasi oasi = new Oasi(args);
		
		log.info("STOP");
		System.exit(0);
	}
}
