package lyy.pg.controller.orcl.compare;

import java.util.concurrent.atomic.AtomicBoolean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseCompare {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected final int CoreThread = Runtime.getRuntime().availableProcessors() * 2 / 3;
	protected final int HGFetchSize = 10;//same to oracle default
	protected AtomicBoolean stop;	
	public BaseCompare() {		
		stop = new AtomicBoolean(false);
	}
	
	public void stop() {		
		logger.debug("stop=" + stop.getAndSet(true));
	}
	
	public boolean getStop() {
		return stop.get();
	} 
}
