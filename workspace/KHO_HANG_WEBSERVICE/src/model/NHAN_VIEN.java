package model;

import java.sql.Date;

public class NHAN_VIEN
{
	private long ID_NHAN_VIEN;
	private String TEN_DAY_DU;
	private String CMND;
	private Date NAM_SINH;
	private String QUE_QUAN;
	private String DIA_CHI_LIEN_HE;
	private String QUOC_TICH;
	private long ID_PHONG_BAN;
	private long LEADER_ID;

	public long getID_NHAN_VIEN()
	{
		return ID_NHAN_VIEN;
	}

	public void setID_NHAN_VIEN(long iD_NHAN_VIEN)
	{
		ID_NHAN_VIEN = iD_NHAN_VIEN;
	}

	public String getTEN_DAY_DU()
	{
		return TEN_DAY_DU;
	}

	public void setTEN_DAY_DU(String tEN_DAY_DU)
	{
		TEN_DAY_DU = tEN_DAY_DU;
	}

	public String getCMND()
	{
		return CMND;
	}

	public void setCMND(String cMND)
	{
		CMND = cMND;
	}

	public Date getNAM_SINH()
	{
		return NAM_SINH;
	}

	public void setNAM_SINH(Date nAM_SINH)
	{
		NAM_SINH = nAM_SINH;
	}

	public String getQUE_QUAN()
	{
		return QUE_QUAN;
	}

	public void setQUE_QUAN(String qUE_QUAN)
	{
		QUE_QUAN = qUE_QUAN;
	}

	public String getDIA_CHI_LIEN_HE()
	{
		return DIA_CHI_LIEN_HE;
	}

	public void setDIA_CHI_LIEN_HE(String dIA_CHI_LIEN_HE)
	{
		DIA_CHI_LIEN_HE = dIA_CHI_LIEN_HE;
	}

	public String getQUOC_TICH()
	{
		return QUOC_TICH;
	}

	public void setQUOC_TICH(String qUOC_TICH)
	{
		QUOC_TICH = qUOC_TICH;
	}

	public long getID_PHONG_BAN()
	{
		return ID_PHONG_BAN;
	}

	public void setID_PHONG_BAN(long iD_PHONG_BAN)
	{
		ID_PHONG_BAN = iD_PHONG_BAN;
	}

	public long getLEADER_ID()
	{
		return LEADER_ID;
	}

	public void setLEADER_ID(long lEADER_ID)
	{
		LEADER_ID = lEADER_ID;
	}
}
