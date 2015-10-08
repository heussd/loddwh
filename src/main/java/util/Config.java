package util;

import freemarker.template.DefaultObjectWrapper;

/**
 * A collection of magic strings.
 */
public class Config extends DefaultObjectWrapper {
	
	public final static boolean THIS_IS_OSX = System.getProperty("os.name").contains("OS X");
	
	public final static String WHERE_THE_FILES_AT = THIS_IS_OSX ? "/Users/th/Ph.D./hebisdumps/noHeader/" : "C:\\RDSTUDIES\\hebis_roh\\";
	public final static String WHERE_THE_RESULTS_AT = "results/";

	public final static Integer QUERYSCENARIO_EXECUTIONS = 3;
	
	public final static String USER = "th";
	public static final String PASSWORD = "";
	public final static String DATABASE = "loddwhbench";

	public static final String TABLE = "justatable";

	public static final String HOST_POSTGRES = "localhost";

	public static final String NEWCOLUMN = "newcolumn";

	public static final String VIRTUOSO_ACCESSIBLE_DIRECTORY = THIS_IS_OSX ? "/usr/local/virtuoso-opensource/share/virtuoso/vad/" : "C:\\RDSTUDIES\\db\\virtuoso-opensource";
	public static final String VIRTUOSO_ACCESSIBLE_DIRECTORY_RELATIVE_TO_VIRTUOSO_T_EXE = THIS_IS_OSX ? "/usr/local/virtuoso-opensource/share/virtuoso/vad/" : "..";
	public static final Integer COMMIT_EVERY_N_RECORDS = 5000000;
}
