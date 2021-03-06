package commons.connectivity;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;

/**
 * An abstraction over connectivity clients.
 */
public abstract class AbstractClient {

	public static final String ENCODING = StandardCharsets.UTF_8.name();

	protected Gson jsonParser;

	public AbstractClient() {
		jsonParser = new Gson();
	}

	public abstract void connect(String destination)
	throws IOException;

	public abstract void disconnect();

	public abstract <T> void send(T payload, Class<T> clazz)
	throws IOException;

}
