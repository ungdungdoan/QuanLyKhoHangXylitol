package database_get_data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db_connect.DatabaseConnect;
import model.SAN_PHAM;

public class DATA_SANPHAM
{
	private Connection connection;

	public ArrayList<SAN_PHAM> getAllSanPham() throws ClassNotFoundException, SQLException
	{
		DatabaseConnect db = new DatabaseConnect();
		this.connection = db.getConnection();
		Statement statement = this.connection.createStatement();
		ResultSet resultSet = statement.executeQuery("GET_ALL_SP");
		ArrayList<SAN_PHAM> san_phams = new ArrayList<SAN_PHAM>();
		while (resultSet.next())
		{
			san_phams.add(new SAN_PHAM(resultSet.getLong("ID_SAN_PHAM"), tEN_SAN_PHAM, sKU_SAN_PHAM, mO_TA, cONG_TY_SX_ID, dON_GIA, nGAY_NHAP_KHO, nGAY_SAN_XUAT, hAN_SU_DUNG));
		}
		return new ArrayList<SAN_PHAM>();
	}
}
