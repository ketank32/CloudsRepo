package clouzer.json;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClzJsonArrayTest {
	CJsonArray cJsonArray = JsonArrayFactory.createJsonArray();
	static long t1 = 0;
	@BeforeClass
	public static void setTime(){
		t1 = new Date().getTime();
	}
	//Put test
	@Before
	public void testPutString(){
		cJsonArray.put("Sample String");
	}
	@Before
	public void testPutInt(){
		cJsonArray.put(Integer.MAX_VALUE);
	}
	@Before
	public void testPutBoolean(){
		cJsonArray.put(true);
	}
	@Before
	public void testPutDouble(){
		cJsonArray.put(Double.MAX_VALUE);
	}
	@Before
	public void testPutLong(){
		cJsonArray.put(Long.MAX_VALUE);
	}
	@Before
	public void testPutCJsonObject(){
		CJsonObject sample = JsonObjectFactory.createJsonObject();
		cJsonArray.put(sample);
		sample.put("objKey", "after adding");
	}
	@Before
	public void testPutCJsonArray(){
		CJsonArray array = JsonArrayFactory.createJsonArray();
		cJsonArray.put(array);
		array.put("arrayValue");
	}
	@Before
	public void testPutFloat(){
		cJsonArray.put(Float.MAX_VALUE);
	}
	@Before
	public void testPutByte(){
		Byte b = Byte.MAX_VALUE;
		cJsonArray.put( b);
	}
	@Before
	public void testShort(){
		Short s = Short.MAX_VALUE;
		cJsonArray.put(s);
	}
	@Before
	public void testCharacter(){
		cJsonArray.put('s');
	}
	@Before
	public void testPutBigInteger(){
		BigInteger bigInteger = new BigInteger("99");
		cJsonArray.put(bigInteger);
	}
	@Before
	public void testPutBigDecimal(){
		BigDecimal bigDecimal = new BigDecimal("999999.00");
		cJsonArray.put(bigDecimal);
	}
	//Utility methods test
	@Test
	public void testToString(){
		String string = this.cJsonArray.toString();
		Assert.assertNotEquals(string, "[]");
		System.out.println("Array: "+string);
	}
	@Test
	public void testLength(){
		int length = this.cJsonArray.length();
		Assert.assertNotEquals(length, 0);
	}
	@Test
	public void testGet(){
		for(int index = 0; index < this.cJsonArray.length() ; index ++){
			if(this.cJsonArray.isString(index)){
				Assert.assertNotEquals("", this.cJsonArray.getString(index));
			}else
			if(this.cJsonArray.isCJsonObject(index)){
				Assert.assertNotEquals("{}",this.cJsonArray.getCJsonObject(index).toString());
			}else
			if(this.cJsonArray.isCJsonArray(index)){
				Assert.assertNotEquals("[]",this.cJsonArray.getCJsonArray(index).toString());
			}else
			if(this.cJsonArray.isBoolean(index)){
				Assert.assertEquals(true,this.cJsonArray.getBoolean(index));
			}else
			if(this.cJsonArray.isDouble(index)){
				Assert.assertNotEquals(0.0,this.cJsonArray.getDouble(index));
			}else
			if(this.cJsonArray.isFloat(index)){
				Assert.assertNotEquals(0f,this.cJsonArray.getFloat(index));
			}else
			if(this.cJsonArray.isLong(index)){
				Assert.assertEquals(Long.MAX_VALUE,this.cJsonArray.getLong(index));
			}else
			if(this.cJsonArray.isInt(index)){
				Assert.assertEquals(Integer.MAX_VALUE,this.cJsonArray.getInt(index));
			}else
			if(this.cJsonArray.isBigDecimal(index)){
				BigDecimal bigDecimal = new BigDecimal("999999.00");
				Assert.assertEquals(bigDecimal,this.cJsonArray.getBigDecimal(index));
			}else
			if(this.cJsonArray.isBigInteger(index)){
				BigInteger bigInteger = new BigInteger("99");
				Assert.assertEquals(bigInteger,this.cJsonArray.getBigInteger(index));
			}else
			if(this.cJsonArray.isByte(index)){
				Assert.assertEquals(Byte.MAX_VALUE,this.cJsonArray.getByte(index));
			}else
			if(this.cJsonArray.isShort(index)){
				Assert.assertEquals(Short.MAX_VALUE,this.cJsonArray.getShort(index));
			}else
			if(this.cJsonArray.isCharacter(index)){
				char a ='s';
				Assert.assertEquals(a,this.cJsonArray.getCharacter(index));
			}
		}
	}
	@Test
	public void testRemove(){
		int beforeRemovelength = this.cJsonArray.length();
		this.cJsonArray.remove(0);
		int afterRemovelength = this.cJsonArray.length();
		Assert.assertEquals(afterRemovelength, (beforeRemovelength-1));
	}
	@AfterClass
	public static void DisplayTime(){
		System.out.println("-----------------------------------------------------");
		System.out.println("Time Required : "+ (new Date().getTime() - t1));
		System.out.println("-----------------------------------------------------");
	}
	
}
