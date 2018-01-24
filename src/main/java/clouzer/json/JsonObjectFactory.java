package clouzer.json;

import java.io.Serializable;

public class JsonObjectFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	public static CJsonObject createJsonObject(){
		CJsonObject cJsonObject = new ClzJsonObject();
		return cJsonObject;
	}
	public static CJsonObject createJsonObject(String jsonString){
		CJsonObject cJsonObject = new ClzJsonObject(jsonString);
		return cJsonObject;
	}
}
