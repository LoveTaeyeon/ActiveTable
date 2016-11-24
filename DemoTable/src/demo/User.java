package demo;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;

public class User {

	private String table;
	private String name;
	private String age;
	private String sex;
	private String jsonData;
	
	public String getJsonData() {
		return jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}

	public static void main(String[] args) {
		User user = new User();
		user.setTable("姓名,年龄,性别");
		user.setSex("M");
		user.setName("韩硕");
		user.setAge("21");
		User u = new User("ss", "ss", "15", "M");
		List<User> users = new ArrayList<User>();
		users.add(user);
		users.add(u);
		String jsonData = JSONArray.fromObject(users).toString();
		System.out.println(jsonData);
	}

	public User() {
		super();
	}

	public User(String table, String name, String age, String sex) {
		super();
		this.table = table;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [table=" + table + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
