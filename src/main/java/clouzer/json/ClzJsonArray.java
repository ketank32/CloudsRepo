package clouzer.json;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

class ClzJsonArray implements CJsonArray{

	private static final long serialVersionUID = 1L;
	JsonArray jsonArray = null;
	//Constructor
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	ClzJsonArray() {
		try{
			jsonArray = new JsonArray();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	ClzJsonArray(String jsonString) {
		try{
			jsonArray = new JsonParser().parse(jsonString).getAsJsonArray();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	ClzJsonArray(CJsonArray cJsonArray) {
		try{
			jsonArray = new JsonParser().parse(cJsonArray.toString()).getAsJsonArray();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//Validation methods
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public boolean isString(int index) {
		boolean isString = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive() && jsonArray.get(index).getAsJsonPrimitive().isString()){
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
	public boolean isCJsonObject(int index) {
		boolean isCJsonObject = false;
		try{
			if(jsonArray.get(index).isJsonObject()){
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
	public boolean isCJsonArray(int index) {
		boolean isCJsonArray = false;
		try{
			if(jsonArray.get(index).isJsonArray()){
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
	public boolean isNumber(int index) {
		boolean isNumber = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive() && jsonArray.get(index).getAsJsonPrimitive().isNumber()){
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
	public boolean isBoolean(int index) {
		boolean isBoolean = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive() && jsonArray.get(index).getAsJsonPrimitive().isBoolean()){
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
	public boolean isInt(int index) {
		boolean isInt = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive() && jsonArray.get(index).getAsJsonPrimitive().isNumber()
					&& jsonArray.get(index).getAsJsonPrimitive().getAsNumber() instanceof Integer){
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
	public boolean isDouble(int index) {
		boolean isDouble = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive() && jsonArray.get(index).getAsJsonPrimitive().isNumber()
					&& jsonArray.get(index).getAsJsonPrimitive().getAsNumber()  instanceof Double){
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
	public boolean isLong(int index) {
		boolean isLong = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive() && jsonArray.get(index).getAsJsonPrimitive().isNumber()
					&& jsonArray.get(index).getAsJsonPrimitive().getAsNumber()  instanceof Long){
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
	public boolean isFloat(int index) {
		boolean isFloat = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive() && jsonArray.get(index).getAsJsonPrimitive().isNumber()
					&& jsonArray.get(index).getAsJsonPrimitive().getAsNumber()  instanceof Float){
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
	public boolean isByte(int index) {
		boolean isByte = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive()&& jsonArray.get(index).getAsJsonPrimitive().isNumber()
					&& jsonArray.get(index).getAsJsonPrimitive().getAsNumber() instanceof Byte){
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
	public boolean isCharacter(int index) {
		boolean isCharacter = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive()){
				Character character = jsonArray.get(index).getAsJsonPrimitive().getAsCharacter();
				if(character != null && character instanceof Character){
					isCharacter = true;
				}
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
	public boolean isShort(int index) {
		boolean isShort = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive() && jsonArray.get(index).getAsJsonPrimitive().isNumber()
					&& jsonArray.get(index).getAsJsonPrimitive().getAsNumber() instanceof Short){
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
	public boolean isBigDecimal(int index) {
		boolean isBigDecimal = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive() && jsonArray.get(index).getAsJsonPrimitive().isNumber()
					&& jsonArray.get(index).getAsJsonPrimitive().getAsNumber()  instanceof BigDecimal){
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
	public boolean isBigInteger(int index) {
		boolean isBigInteger = false;
		try{
			if(jsonArray.get(index).isJsonPrimitive() && jsonArray.get(index).getAsJsonPrimitive().isNumber()
					&& jsonArray.get(index).getAsJsonPrimitive().getAsNumber()  instanceof BigInteger){
				isBigInteger = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return isBigInteger;
	}
	//Get Methods
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonArray getCJsonArray(int index) {
		CJsonArray cJsonArray = null;
		if(this.length() >= index){
			ClzJsonArray clzJsonArray = new ClzJsonArray();
			clzJsonArray.jsonArray = this.jsonArray.get(index).getAsJsonArray();
			cJsonArray = clzJsonArray;
		}else{
			cJsonArray = new ClzJsonArray();
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
	public CJsonObject getCJsonObject(int index) {
		CJsonObject cJsonObject = null;
		if(this.length() >= index){
			ClzJsonObject clzJsonObject = new ClzJsonObject();
			clzJsonObject.jsonobject = this.jsonArray.get(index).getAsJsonObject();
			cJsonObject = clzJsonObject;
		}else{
			cJsonObject = new ClzJsonObject();
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
	public String getString(int index) {
		String value = "";
		try{
			if(this.length() >= index){
				value = jsonArray.get(index).getAsString();
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
	public int getInt(int index) {
		int value = 0;
		try{
			if(this.isNumber(index)){
				value = jsonArray.get(index).getAsInt();
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
	public double getDouble(int index) {
		double value = 0;
		try{
			if(this.isNumber(index)){
				value = jsonArray.get(index).getAsDouble();
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
	public long getLong(int index) {
		long value = 0l;
		try{
			if(this.isNumber(index)){
				value = jsonArray.get(index).getAsLong();
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
	public boolean getBoolean(int index) {
		boolean value = false;
		try{
			if(this.isBoolean(index)){
				value = jsonArray.get(index).getAsBoolean();
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
	public float getFloat(int index) {
		float value = 0;
		try{
			if(this.isNumber(index)){
				value = jsonArray.get(index).getAsFloat();
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
	public byte getByte(int index) {
		byte value = 0;
		try{
			if(this.isByte(index)){
				value = this.jsonArray.get(index).getAsJsonPrimitive().getAsByte();
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
	public char getCharacter(int index) {
		char value = 0;
		try{
			if(this.isNumber(index)){
				value = this.jsonArray.get(index).getAsJsonPrimitive().getAsCharacter();
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
	public short getShort(int index) {
		short value = 0;
		try{
			if(this.isShort(index)){
				value = this.jsonArray.get(index).getAsJsonPrimitive().getAsShort();
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
	public BigDecimal getBigDecimal(int index) {
		BigDecimal value = new BigDecimal("0");
		try{
			if(this.isBigDecimal(index)){
				value = this.jsonArray.get(index).getAsJsonPrimitive().getAsBigDecimal();
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
	public BigInteger getBigInteger(int index) {
		BigInteger value = new BigInteger("0");
		try{
			if(this.isBigInteger(index)){
				value = this.jsonArray.get(index).getAsJsonPrimitive().getAsBigInteger();
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
	public Number getNumber(int index) {
		Number value = 0;
		try{
			if(this.isNumber(index)){
				value = this.jsonArray.get(index).getAsJsonPrimitive().getAsNumber();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	//Put methods
	/**
	 * @author : DPB 
	 * @date : 01/01/2018
	 * @Purpose : put float value into CJsonObject
	 * @return : CJsonObject
	 * @param: String key
	 * @param: float value
	 **/
	@Override
	public CJsonArray put(String value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(int value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(CJsonObject value) {
		try{
			jsonArray.add(((ClzJsonObject)value).jsonobject);
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
	public CJsonArray put(double value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(long value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(boolean value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(float value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(CJsonArray value) {
		try{
			jsonArray.add(((ClzJsonArray)value).jsonArray);
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
	public CJsonArray put(byte value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(char value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(short value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(BigDecimal value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(BigInteger value) {
		try{
			jsonArray.add(value);
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
	public CJsonArray put(Number value) {
		try{
			jsonArray.add(value);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	//Utility methods
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
		int size = 0;
		try{
			size = jsonArray.size();
		}catch(Exception e){
			e.printStackTrace();
		}
		return size;
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
	public void remove(int index) {
		try{
			jsonArray.remove(index);
		}catch(Exception e){
			e.printStackTrace();
		}
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
		String returnValue = "";
		try{
			returnValue = this.jsonArray.toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		if(returnValue.equals("")){
			returnValue = "[]";
		}
		return returnValue;
	}
}
