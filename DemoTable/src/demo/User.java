package demo;

import java.util.ArrayList;
import java.util.List;

import T.Man;
import T.Woman;
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

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		Man man = new Man("");
		Woman woman = new Woman("");
		System.out.println(TDemo.getString(man));
		System.out.println(TDemo.getString(woman));
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
		return "My User [table=" + table + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
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
