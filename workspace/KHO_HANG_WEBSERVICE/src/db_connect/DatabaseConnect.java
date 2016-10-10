package db_connect;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnect
{
	private Connection connection;
	private final String userName = "sa";
	private final String password = "1";
	private final String connectString = "jdbc:sqlserver://localhost:1433;databaseName=KHO_HANG";

	public Connection getConnection()
	{
		return connection;
	}

	public DatabaseConnect() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		this.connection = java.sql.DriverManager.getConnection(connectString, userName, password);
	}
}
