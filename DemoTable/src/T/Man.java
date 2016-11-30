package T;

public class Man {

	private static final String SEX = "MAN";
	
	@Override
	public String toString() {
		return "Man [name=" + name + "\tSex=" + SEX + "]";
	}

	public static String getSex() {
		return SEX;
	}

	public Man(String name) {
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
