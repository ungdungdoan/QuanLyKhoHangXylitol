package model;

import java.sql.Date;

public class SAN_PHAM
{
	private long ID_SAN_PHAM;
	private String TEN_SAN_PHAM;
	private String SKU_SAN_PHAM;
	private String MO_TA;
	private long CONG_TY_SX_ID;
	private long DON_GIA;
	private Date NGAY_NHAP_KHO;
	private Date NGAY_SAN_XUAT;
	private Date HAN_SU_DUNG;

	public SAN_PHAM(long iD_SAN_PHAM, String tEN_SAN_PHAM, String sKU_SAN_PHAM, String mO_TA, long cONG_TY_SX_ID, long dON_GIA, Date nGAY_NHAP_KHO, Date nGAY_SAN_XUAT, Date hAN_SU_DUNG)
	{
		super();
		ID_SAN_PHAM = iD_SAN_PHAM;
		TEN_SAN_PHAM = tEN_SAN_PHAM;
		SKU_SAN_PHAM = sKU_SAN_PHAM;
		MO_TA = mO_TA;
		CONG_TY_SX_ID = cONG_TY_SX_ID;
		DON_GIA = dON_GIA;
		NGAY_NHAP_KHO = nGAY_NHAP_KHO;
		NGAY_SAN_XUAT = nGAY_SAN_XUAT;
		HAN_SU_DUNG = hAN_SU_DUNG;
	}

	public long getID_SAN_PHAM()
	{
		return ID_SAN_PHAM;
	}

	public void setID_SAN_PHAM(long iD_SAN_PHAM)
	{
		ID_SAN_PHAM = iD_SAN_PHAM;
	}

	public String getTEN_SAN_PHAM()
	{
		return TEN_SAN_PHAM;
	}

	public void setTEN_SAN_PHAM(String tEN_SAN_PHAM)
	{
		TEN_SAN_PHAM = tEN_SAN_PHAM;
	}

	public String getSKU_SAN_PHAM()
	{
		return SKU_SAN_PHAM;
	}

	public void setSKU_SAN_PHAM(String sKU_SAN_PHAM)
	{
		SKU_SAN_PHAM = sKU_SAN_PHAM;
	}

	public String getMO_TA()
	{
		return MO_TA;
	}

	public void setMO_TA(String mO_TA)
	{
		MO_TA = mO_TA;
	}

	public long getCONG_TY_SX_ID()
	{
		return CONG_TY_SX_ID;
	}

	public void setCONG_TY_SX_ID(long cONG_TY_SX_ID)
	{
		CONG_TY_SX_ID = cONG_TY_SX_ID;
	}

	public long getDON_GIA()
	{
		return DON_GIA;
	}

	public void setDON_GIA(long dON_GIA)
	{
		DON_GIA = dON_GIA;
	}

	public Date getNGAY_NHAP_KHO()
	{
		return NGAY_NHAP_KHO;
	}

	public void setNGAY_NHAP_KHO(Date nGAY_NHAP_KHO)
	{
		NGAY_NHAP_KHO = nGAY_NHAP_KHO;
	}

	public Date getNGAY_SAN_XUAT()
	{
		return NGAY_SAN_XUAT;
	}

	public void setNGAY_SAN_XUAT(Date nGAY_SAN_XUAT)
	{
		NGAY_SAN_XUAT = nGAY_SAN_XUAT;
	}

	public Date getHAN_SU_DUNG()
	{
		return HAN_SU_DUNG;
	}

	public void setHAN_SU_DUNG(Date hAN_SU_DUNG)
	{
		HAN_SU_DUNG = hAN_SU_DUNG;
	}

}
