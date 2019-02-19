package com.highgo.admin.migrator.comparator.controller;

public class OracleNumberFormat {
	
	//private static Logger logger = LoggerFactory.getLogger(OracleNumberFormat.class);
	
	public static String get(int p, int s) 
	{
		//logger.debug("Enter:p=" + p + ",s=" + s);

		StringBuilder fm = new StringBuilder("fm");
		//if (s <= 0)// int needn't deal
		if (p < s) {
			fm.append("0.");
			for (int i = 1; i <= s; i++) {
				fm.append("9");
			}
		} else {
			for (int i = 1; i < p - s; i++) {
				fm.append("9");
			}
			fm.append("0.");
			for (int j = 1; j <= s; j++) {
				fm.append("0");
			}
		}		
		
		//logger.debug("Return:" + fm.toString());
		return fm.toString();		
	}

}
