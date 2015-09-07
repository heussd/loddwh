package util;

import freemarker.template.DefaultObjectWrapper;

/**
 * A collection of magic strings.
 */
public class Config extends DefaultObjectWrapper {
	public final static String WHERE_THE_FILES_AT = "/Users/th/Ph.D./HeBIS Zulieferungen Juni 2015/";
	public final static String WHERE_THE_RESULTS_AT = "C:\\RDSTUDIES\\src\\loddwhbench\\results\\";
	
	
	public final static String USER = "bench";
	public static final String PASSWORD = "";
	public final static String DATABASE = "loddwhbench";

	public static final String TABLE = "justatable";

	public static final String HOST_POSTGRES = "localhost";

	public static final String NEWCOLUMN = "newcolumn";
}
