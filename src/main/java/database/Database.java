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

	/**
	 * Reinitiates the database and resets it to an empty state aka
	 * "the state after setUp()". Designed to be called execution of a
	 * {@link QueryScenario}. After this, the database is ready to load entities
	 * or to be queried (even though it should be empty).
	 */
	public void clear(QueryScenario queryScenario) throws Exception;

}
