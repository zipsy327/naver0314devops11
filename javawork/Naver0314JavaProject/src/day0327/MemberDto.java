package day0327;

public class MemberDto {
	private String name;
	private String hp;
	private String addr;
	private String blood;
	
	public MemberDto() {
		super();
	}

	public MemberDto(String name, String hp, String addr, String blood) {
		super();
		this.name = name;
		this.hp = hp;
		this.addr = addr;
		this.blood = blood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}
}
