package lab7;

import java.util.ArrayList;

import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;

public class DirectoryProxy {
	Gson dp = new Gson();
	public String add(ArrayList<Employee> array){
		return dp.toJson(array);
	}
	public void print(String printThis){
		System.out.println(printThis);
	}
	public void clear(){
		dp = new Gson();
	}
}
