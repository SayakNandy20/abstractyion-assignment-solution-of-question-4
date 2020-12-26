package parentandchildabs4;

public class Item {
	private String Itemname;
	private float itemcost;
	private float totalcost;
	public Item(String itemname, float itemcost, float totalcost) {
		Itemname = itemname;
		this.itemcost = itemcost;
		this.totalcost = totalcost;
	}
	public String getItemname() {
		return Itemname;
	}
	public void setItemname(String itemname) {
		Itemname = itemname;
	}
	public float getItemcost() {
		return itemcost;
	}
	public void setItemcost(float itemcost) {
		this.itemcost = itemcost;
	}
	public float getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(float totalcost) {
		this.totalcost = totalcost;
	}
	
	
	
	

}
