package model;

public class MAT_HANG
{
	private long ID_MAT_HANG;
	private String TEN_MAT_HANG;
	private String MA_MAT_HANG;

	public long getID_MAT_HANG()
	{
		return ID_MAT_HANG;
	}

	public void setID_MAT_HANG(long iD_MAT_HANG)
	{
		ID_MAT_HANG = iD_MAT_HANG;
	}

	public String getTEN_MAT_HANG()
	{
		return TEN_MAT_HANG;
	}

	public void setTEN_MAT_HANG(String tEN_MAT_HANG)
	{
		TEN_MAT_HANG = tEN_MAT_HANG;
	}

	public String getMA_MAT_HANG()
	{
		return MA_MAT_HANG;
	}

	public void setMA_MAT_HANG(String mA_MAT_HANG)
	{
		MA_MAT_HANG = mA_MAT_HANG;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((MA_MAT_HANG == null) ? 0 : MA_MAT_HANG.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MAT_HANG other = (MAT_HANG) obj;
		if (MA_MAT_HANG == null)
		{
			if (other.MA_MAT_HANG != null)
				return false;
		}
		else if (!MA_MAT_HANG.equalsIgnoreCase(other.MA_MAT_HANG))
			return false;
		return true;
	}

}
