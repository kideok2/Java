package test.dto;

public class PayDto {
	private int num;
	private String name;
	private String contents;
	private int price;
	private int total;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public PayDto() {};
	
	public PayDto(int num, String name, String contents, int price, int total) {
		super();
		this.num = num;
		this.name = name;
		this.contents = contents;
		this.price = price;
		this.total = total;
	}
	
	
}
