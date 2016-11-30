package demo;

import java.lang.reflect.Field;

public class TDemo {

	public static String objTest(Object... objs){
		
		String str = "";
		for(Object obj : objs){
			str = str + obj.toString() + "\n";
			obj.getClass();
		}
		
		return str;
	}
	
	public static int add(int... numbers){
		int count = 0;
		for(int i : numbers){
			count = count + i;
		}
		return count;
	}
	
	/**
	 * @author LoveTaeyeon<p>
	 * 设置每一个属性为他们的名字
	 */
	public static <T> String getString(T t) throws IllegalArgumentException, IllegalAccessException, InstantiationException{
		
		//接受参数
		Class<? extends Object> temp = t.getClass();
		//获取内部函数
		//Method methods[] = temp.getMethods();
		//获取属性
		Field fields[] = temp.getDeclaredFields();
		Object obj = temp.newInstance();
		for(Field field : fields){
			//私有属性访问权限设置
			field.setAccessible(true);
			field.set(obj,field.getName());
			field.setAccessible(false);
		}
		
		return obj.toString();
	}
	
}
