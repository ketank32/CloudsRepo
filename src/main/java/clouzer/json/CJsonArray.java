package clouzer.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public interface CJsonArray extends Serializable {
	public int length();
	public void remove(int index);
	public String toString();
	//validation methods
	public boolean isString(int index);
	public boolean isCJsonObject(int index);
	public boolean isCJsonArray(int index);
	public boolean isInt(int index);
	public boolean isDouble(int index);
	public boolean isBoolean(int index);
	public boolean isLong(int index);
	public boolean isFloat(int index);
	public boolean isByte(int index);
	public boolean isCharacter(int index);
	public boolean isShort(int index);
	public boolean isBigDecimal(int index);
	public boolean isBigInteger(int index);
	public boolean isNumber(int index);
	//Put methods
	public CJsonArray put(String value);
	public CJsonArray put(CJsonObject value);
	public CJsonArray put(CJsonArray value);
	public CJsonArray put(int value);
	public CJsonArray put(double value);
	public CJsonArray put(boolean value);
	public CJsonArray put(long value);
	public CJsonArray put(float value);
	public CJsonArray put(byte value);
	public CJsonArray put(char value);
	public CJsonArray put(short value);
	public CJsonArray put(BigDecimal value);
	public CJsonArray put(BigInteger value);
	public CJsonArray put(Number value);
	//Get methods
	public String getString(int index);
	public CJsonArray getCJsonArray(int index);
	public CJsonObject getCJsonObject(int index);
	public int getInt(int index);
	public double getDouble(int index);
	public boolean getBoolean(int index);
	public long getLong(int index);
	public float getFloat(int index);
	public byte getByte(int index);
	public char getCharacter(int index);
	public short getShort(int index);
	public BigDecimal getBigDecimal(int index);
	public BigInteger getBigInteger(int index);
	public Number getNumber(int index);
}
