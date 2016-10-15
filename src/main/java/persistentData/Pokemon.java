package persistentData;

public class Pokemon {
	
	private String name;
	private String desc;
	public Pokemon(String nName, String nDesc) {
		name = nName;
		desc = nDesc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	

}
