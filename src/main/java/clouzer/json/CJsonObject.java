package clouzer.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public interface CJsonObject extends Serializable {
	//Utility methods
	public boolean has(String key);
	public List<String> keyList();
	public int length();
	public CJsonObject remove(String key);
	public String toString();
	//validation methods
	public boolean isString(String key);
	public boolean isCJsonObject(String key);
	public boolean isCJsonArray(String key);
	public boolean isInt(String key);
	public boolean isDouble(String key);
	public boolean isBoolean(String key);
	public boolean isLong(String key);
	public boolean isFloat(String key);
	public boolean isByte(String key);
	public boolean isCharacter(String key);
	public boolean isShort(String key);
	public boolean isBigDecimal(String key);
	public boolean isBigInteger(String key);
	public boolean isNumber(String key);
	//getter methods
	public String getString(String key);
	public CJsonObject getCJsonObject(String key);
	public CJsonArray getCJsonArray(String key);
	public int getInt(String key);
	public double getDouble(String key);
	public boolean getBoolean(String key);
	public long getLong(String key);
	public float getFloat(String key);
	public byte getByte(String key);
	public short getShort(String key);
	public char getCharacter(String key);
	public BigDecimal getBigDecimal(String key);
	public BigInteger getBigInteger(String key);
	public Number getNumber(String key);
	//put methods
	public CJsonObject put(String key,String value);
	public CJsonObject put(String key,int value);
	public CJsonObject put(String key,boolean value);
	public CJsonObject put(String key,double value);
	public CJsonObject put(String key,long value);
	public CJsonObject put(String key,CJsonObject value);
	public CJsonObject put(String key,CJsonArray value);
	public CJsonObject put(String key,float value);
	public CJsonObject put(String key,byte value);
	public CJsonObject put(String key,short value);
	public CJsonObject put(String key,char value);
	public CJsonObject put(String key,BigDecimal value);
	public CJsonObject put(String key,BigInteger value);
	public CJsonObject put(String key,Number value);
}
