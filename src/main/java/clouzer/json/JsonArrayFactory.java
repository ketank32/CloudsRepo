package clouzer.json;

import java.io.Serializable;

public class JsonArrayFactory implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public static CJsonArray createJsonArray(){
		CJsonArray cJsonArray = new ClzJsonArray();
		return cJsonArray;
	}
	public static CJsonArray createJsonArray(String jsonString){
		CJsonArray cJsonArray = new ClzJsonArray(jsonString);
		return cJsonArray;
	}
	public static CJsonArray createJsonArray(CJsonArray inputCJsonObject){
		CJsonArray cJsonArray = new ClzJsonArray(inputCJsonObject);
		return cJsonArray;
	}
}
