package model;

public class PHONG_BAN
{
	private long ID_PHONG_BAN;
	private String TEN_PHONG_BAN;
	private long TRUONG_PHONG_ID;

	public long getID_PHONG_BAN()
	{
		return ID_PHONG_BAN;
	}

	public void setID_PHONG_BAN(long iD_PHONG_BAN)
	{
		ID_PHONG_BAN = iD_PHONG_BAN;
	}

	public String getTEN_PHONG_BAN()
	{
		return TEN_PHONG_BAN;
	}

	public void setTEN_PHONG_BAN(String tEN_PHONG_BAN)
	{
		TEN_PHONG_BAN = tEN_PHONG_BAN;
	}

	public long getTRUONG_PHONG_ID()
	{
		return TRUONG_PHONG_ID;
	}

	public void setTRUONG_PHONG_ID(long tRUONG_PHONG_ID)
	{
		TRUONG_PHONG_ID = tRUONG_PHONG_ID;
	}
}
