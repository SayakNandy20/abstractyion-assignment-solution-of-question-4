package parentandchildabs4;

public class TaxableIterm extends Item{
	private float GST;
	private float taxamount;
	public TaxableIterm(String itemname, float itemcost, float totalcost, float gST, float taxamount) {
		super(itemname, itemcost, totalcost);
		GST = gST;
		this.taxamount = taxamount;
	}

	public float getGST() {
		return GST;
	}
	public void setGST(float gST) {
		GST = gST;
	}
	public float getTaxamount() {
		return taxamount;
	}
	public void setTaxamount(float taxamount) {
		this.taxamount = taxamount;
	}
	public int findtaxamount()
	{
		if(super.getItemcost()>0 && GST>0)
		{
			this.taxamount=(super.getItemcost()*(this.getGST()/100));
	        super.setTotalcost((super.getItemcost()+this.getTaxamount()));
	        return 1;
			
		}
		else
		{
			return -1;
		}
			
	}
	

}
