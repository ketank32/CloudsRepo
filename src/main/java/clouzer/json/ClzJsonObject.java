package clouzer.json;
/**
 * @author: DPB
 **/
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

class ClzJsonObject implements CJsonObject{

	private static final long serialVersionUID = 1L;
	JsonObject jsonobject = null;
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : default costructor
	 **/
	ClzJsonObject() {
		try{
			jsonobject = new JsonObject();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : create object using string json
	 **/
	ClzJsonObject(String jsonString) {
		try{
			jsonobject = new JsonParser().parse(jsonString).getAsJsonObject();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : default costructor
	 **/
	@Override
	public String getString(String key) {
		String value = "";
		try{
			if(this.isString(key)){
				value = jsonobject.get(key).getAsJsonPrimitive().getAsString();
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean has(String key) {
		boolean hasKey = false;
		try{
			if(jsonobject.has(key)){
				hasKey = true;
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
		return hasKey;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public List<String> keyList() {
		List<String> keySet = null;
		try{
			keySet = new ArrayList<String>(jsonobject.keySet());
		}catch(Exception e){
			e.printStackTrace();
			keySet = new ArrayList<String>();
		}
		return keySet;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public int length() {
		int length = 0;
		try{
			length = jsonobject.size();
		}catch(Exception e){
			e.printStackTrace();
		}
		return length;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject remove(String key) {
		try{
			jsonobject.remove(key);			
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject getCJsonObject(String key) {
		CJsonObject cJsonObject = null;
		try{
			if(this.has(key)){
				ClzJsonObject clzJsonObject = new ClzJsonObject();
				clzJsonObject.jsonobject = this.jsonobject.get(key).getAsJsonObject();
				cJsonObject = clzJsonObject;
			}else{
				cJsonObject = new ClzJsonObject();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return cJsonObject;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonArray getCJsonArray(String key) {
		CJsonArray cJsonArray = null;
		try{
			if(this.has(key)){
				ClzJsonArray clzJsonArray = new ClzJsonArray();
				clzJsonArray.jsonArray = this.jsonobject.get(key).getAsJsonArray();
				cJsonArray = clzJsonArray;
			}else{
				cJsonArray = new ClzJsonArray();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return cJsonArray;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public int getInt(String key) {
		int value = 0;
		try{
			if(this.isInt(key)){
				value = jsonobject.get(key).getAsJsonPrimitive().getAsInt();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public double getDouble(String key) {
		double value = 0.0;
		try{
			if(this.isDouble(key)){
				value = jsonobject.get(key).getAsJsonPrimitive().getAsDouble();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean getBoolean(String key) {
		boolean value = false;
		try{
			if(this.isBoolean(key)){
				value = jsonobject.get(key).getAsJsonPrimitive().getAsBoolean();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public long getLong(String key) {
		long value = 0l;
		try{
			if(this.isLong(key)){
				value = jsonobject.get(key).getAsJsonPrimitive().getAsLong();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public float getFloat(String key) {
		float value = 0;
		try{
			if(this.isFloat(key)){
				value = this.jsonobject.get(key).getAsJsonPrimitive().getAsFloat();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public byte getByte(String key) {
		byte value = 0;
		try{
			if(this.isByte(key)){
				value = this.jsonobject.get(key).getAsJsonPrimitive().getAsByte();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public short getShort(String key) {
		short value = 0;
		try{
			if(this.isShort(key)){
				value = this.jsonobject.get(key).getAsJsonPrimitive().getAsShort();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public BigDecimal getBigDecimal(String key) {
		BigDecimal value = new BigDecimal("0");
		try{
			if(this.isBigDecimal(key)){
				value = this.jsonobject.get(key).getAsJsonPrimitive().getAsBigDecimal();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public BigInteger getBigInteger(String key) {
		BigInteger value = new BigInteger("0");
		try{
			if(this.isBigInteger(key)){
				value = this.jsonobject.get(key).getAsJsonPrimitive().getAsBigInteger();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public Number getNumber(String key) {
		Number value = 0;
		try{
			if(this.isNumber(key)){
				value = this.jsonobject.get(key).getAsJsonPrimitive().getAsNumber();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public char getCharacter(String key) {
		char value = 0;
		try{
			if(this.isNumber(key)){
				value = this.jsonobject.get(key).getAsJsonPrimitive().getAsCharacter();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, String value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, int value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, boolean value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, double value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, long value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, CJsonObject value) {
		try{
			jsonobject.add(key, ((ClzJsonObject)value).jsonobject);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, CJsonArray value) {
		try{
			jsonobject.add(key, ((ClzJsonArray)value).jsonArray);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, float value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, byte value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, short value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, BigDecimal value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, BigInteger value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, Number value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonObject put(String key, char value) {
		try{
			jsonobject.addProperty(key, value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isString(String key) {
		boolean isString = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive() && jsonobject.get(key).getAsJsonPrimitive().isString()){
				isString = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isString;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isCJsonObject(String key) {
		boolean isCJsonObject = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonObject()){
				isCJsonObject = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isCJsonObject;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isCJsonArray(String key) {
		boolean isCJsonArray = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonArray()){
				isCJsonArray = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isCJsonArray;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isInt(String key) {
		boolean isInt = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive() && jsonobject.get(key).getAsJsonPrimitive().isNumber()){
				isInt = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isInt;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isDouble(String key) {
		boolean isDouble = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive() && jsonobject.get(key).getAsJsonPrimitive().isNumber()){
				isDouble = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isDouble;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isBoolean(String key) {
		boolean isBoolean = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive() && jsonobject.get(key).getAsJsonPrimitive().isBoolean()){
				isBoolean = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isBoolean;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isLong(String key) {
		boolean isLong = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive() && jsonobject.get(key).getAsJsonPrimitive().isNumber()){
				isLong = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isLong;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isFloat(String key) {
		boolean isFloat = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive()){
				isFloat = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isFloat;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isByte(String key) {
		boolean isByte = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive()){
				isByte = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isByte;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isCharacter(String key) {
		boolean isCharacter = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive()){
				isCharacter = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isCharacter;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isShort(String key) {
		boolean isShort = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive()){
				isShort = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isShort;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isBigDecimal(String key) {
		boolean isBigDecimal = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive() && jsonobject.get(key).getAsJsonPrimitive().isNumber()){
				isBigDecimal = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isBigDecimal;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isBigInteger(String key) {
		boolean isBigInteger = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive() && jsonobject.get(key).getAsJsonPrimitive().isNumber()){
				isBigInteger = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isBigInteger;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isNumber(String key) {
		boolean isNumber = false;
		try{
			if(jsonobject.has(key) && jsonobject.get(key).isJsonPrimitive() && jsonobject.get(key).getAsJsonPrimitive().isNumber()){
				isNumber = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isNumber;
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public String toString(){
		return this.jsonobject.toString();
	}
}
