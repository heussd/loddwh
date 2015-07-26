import util.Dataset;
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
	 * available and prepares internal structures. Should only be executed once.
	 * After this, everything should be set up to load entities.
	 * 
	 * @throws Exception
	 */
	public void setUp() throws Exception;

	/**
	 * Initiates the database and resets it to an empty state. Designed to be
	 * called multiple times during evaluation. After this, the database is
	 * ready to load entities or to be queried.
	 */
	public void initialize() throws Exception;

	/**
	 * Verifies that an entity with the given id was written.
	 */
	public void verifyEntityWrite(String id) throws Exception;

	/**
	 * Loads the specified {@link Dataset} entirely.
	 */
	public void load(Dataset dataset) throws Exception;

	// TODO: @Marco: Rückgabeformat für query-Ergebnisse spezifizieren
	public String query(QueryScenario queryScenario) throws Exception;
}
