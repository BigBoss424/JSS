import java.io.*;

public interface ObjectStorer
{

	public void put(Object key, Object object) throws IOException;
	public Object get(object key) throws IOException, ClassNotFoundException, IllegalAccessException,
										 InstantiationException;
	


