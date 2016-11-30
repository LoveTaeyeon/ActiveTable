package T;

public class Woman {

private static final String SEX = "WOMEN";
	
	@Override
	public String toString() {
		return "Woman [name=" + name + "\tSex=" + SEX + "]";
	}

	public static String getSex() {
		return SEX;
	}

	public Woman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Woman(String name) {
		super();
		this.name = name;
	}

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
