package cartSystemExample;

public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private Integer quatity;
    private Integer availableQuatity;
    
    public Item() {
    	this.quatity = 1;
    }
    
    
    
	public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuatity) {
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.itemPrice = itemPrice;
		this.availableQuatity = availableQuatity;
		this.quatity = 1;
	}



	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Integer getQuatity() {
		return quatity;
	}
	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}
	public Integer getAvailableQuatity() {
		return availableQuatity;
	}
	public void setAvailableQuatity(Integer availableQuatity) {
		this.availableQuatity = availableQuatity;
	}
   
}
