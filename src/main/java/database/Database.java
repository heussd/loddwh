package database;

import util.Dataset;
import util.QueryResult;
import util.QueryScenario;

/**
 * Represents a specific database to be evaluated. Here are some principal
 * rules:
 * 
 * <ul>
 * <li>In order to not influence test results, <b>do not</b> use loggers or
 * System.out.print* within implementations of this class</li>
 * <li>Thrown exceptions always invalidate results and times.</li>
 * <li>Communicate evaluation-relevant errors with {@link DatabaseException}.
 * </li>
 * <li>Every exception != {@link DatabaseException} will terminate the
 * evaluation immediately.</li>
 * <li>Nest <b>all thrown</b> exceptions</li>
 * <li>Be as verbose as possible in {@link #getName()} and {@link #getVersion()}
 * </li>
 * </ul>
 */
public interface Database {

	/**
	 * Full database name, incl. Edition etc.
	 */
	public String getName();

	/**
	 * Full version information, including connection drivers etc.
	 */
	public String getVersion();

	/**
	 * Starts the database, if applicable, e.g. via shell script. Implementation
	 * is not mandatory for all databases. Times are not measured.
	 */
	public void start();

	/**
	 * Stops the database, if applicable, e.g. via shell script. Implementation
	 * is not mandatory for all databases. Times are not measured.
	 */
	public void stop();

	/**
	 * Deletes possible old structures in the database. Query times are not
	 * measured.
	 */
	public void clean() throws Exception;

	/**
	 * Sets up the environment of the given database, e.g. makes sure it is
	 * available and prepares internal structures. Should only be called
	 * <b>once</b>, if at all. After this, everything should be set up to load
	 * entities.
	 */
	public void setUp() throws Exception;

	/**
	 * Loads the specified {@link Dataset} entirely.
	 */
	public void load(Dataset dataset) throws Exception;

	/**
	 * Prepares the given {@link QueryScenario} with specific steps that only
	 * need to be done once per {@link QueryScenario} respectively once per
	 * every query.
	 */
	public void prepare(QueryScenario queryScenario) throws Exception;

	/**
	 * Execute the given {@link QueryScenario}.
	 */
	public QueryResult query(QueryScenario queryScenario) throws Exception;

}
