package clouzer.json;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClzJsonObjectTest {
	CJsonObject jsonObject = JsonObjectFactory.createJsonObject();
	static long t1 = 0;
	@BeforeClass
	public static void setTime(){
		t1 = new Date().getTime();
	}
	//put test
	@Before
	public void testPutString(){
		jsonObject.put("stringKey", "Sample String");
	}
	@Before
	public void testPutInt(){
		jsonObject.put("intKey", 1000);
	}
	@Before
	public void testPutBoolean(){
		jsonObject.put("booleanKey",true);
	}
	@Before
	public void testPutDouble(){
		jsonObject.put("doubleKey",12.3 );
	}
	@Before
	public void testPutLong(){
		jsonObject.put("longKey",121l);
	}
	@Before
	public void testPutCJsonObject(){
		CJsonObject sample = JsonObjectFactory.createJsonObject();
		jsonObject.put("cJsonObjectKey", sample);
	}
	@Before
	public void testPutCJsonArray(){
		CJsonArray array = JsonArrayFactory.createJsonArray();
		jsonObject.put("cJsonArrayKey", array);
	}
	@Before
	public void testPutFloat(){
		jsonObject.put("floatKey", 121.3f);
	}
	@Before
	public void testPutByte(){
		byte b = 1;
		jsonObject.put("byteKey", b);
	}
	@Before
	public void testShort(){
		short s = 's';
		jsonObject.put("shortKey", s);
	}
	@Before
	public void testPutBigInteger(){
		BigInteger bigInteger = new BigInteger("99");
		jsonObject.put("bigIntegerKey", bigInteger);
	}
	@Before
	public void testPutBigDecimal(){
		BigDecimal bigDecimal = new BigDecimal("999999.00");
		jsonObject.put("bigDecimalKey", bigDecimal);
	}
	
	//Get Test
	@Test
	public void testGetString(){
		String sValue = jsonObject.getString("stringKey");
		Assert.assertEquals(sValue, "Sample String");
	}
	@Test
	public void testGetInt(){
		int iValue = jsonObject.getInt("intKey");
		Assert.assertEquals(iValue, 1000);
	}
	@Test
	public void testGetBoolean(){
		boolean bValue = jsonObject.getBoolean("booleanKey");
		Assert.assertEquals(bValue, true);
	}
	@Test
	public void testGetDouble(){
		double dValue = jsonObject.getDouble("doubleKey");
		Assert.assertNotEquals(dValue, 0.0);
	}
	@Test
	public void testGetLong(){
		long lValue = jsonObject.getLong("longKey");
		Assert.assertEquals(lValue, 121l);
	}
	@Test
	public void testGetCJsonObject(){
		CJsonObject object = jsonObject.getCJsonObject("cJsonObjectKey");
		Assert.assertEquals(object.toString(), "{}");
	}
	@Test
	public void testGetCJsonArray(){
		CJsonArray array = jsonObject.getCJsonArray("cJsonArrayKey");
		Assert.assertEquals(array.toString(), "[]");
	}
	@Test
	public void testGetFloat(){
		float f = jsonObject.getFloat("floatKey");
		Assert.assertNotEquals(f, 0.0);
	}
	@Test
	public void testGetByte(){
		byte byte1 = jsonObject.getByte("bytekey");
		byte expected = 1;
		Assert.assertNotEquals(byte1, expected);
	}
	@Test
	public void testGetShort(){
		short s = jsonObject.getShort("shortKey");
		Assert.assertEquals(s, 's');
	}
	@Test
	public void testGetBigDecimal(){
		BigDecimal bigDecimal = jsonObject.getBigDecimal("bigDecimalKey");
		BigDecimal expected = new BigDecimal("999999.00");
		Assert.assertEquals(bigDecimal, expected);
	}
	@Test
	public void testGetBigInteger(){
		BigInteger bigInteger = jsonObject.getBigInteger("bigIntegerKey");
		BigInteger expected = new BigInteger("99");
		Assert.assertEquals(bigInteger, expected);
	}
	@Test
	public void testToString(){
		String string = jsonObject.toString();
		Assert.assertNotEquals(string, "{}");
		System.out.println("Object: "+string);
	}
	@Test
	public void testLength(){
		int length = jsonObject.length();
		Assert.assertNotEquals(length, 0);
	}
	@Test
	public void testHas(){
		Assert.assertNotEquals(jsonObject.has("stringKey"), false);
	}
	@Test
	public void testRemove(){
		jsonObject.remove("stringKey");
		Assert.assertEquals(jsonObject.has("stringKey"), false);
	}
	@Test
	public void testkeyList(){
		List<String> keySet = jsonObject.keyList();
		Assert.assertNotEquals(keySet.size(),0);
	}
	@AfterClass
	public static void DisplayTime(){
		System.out.println("-----------------------------------------------------");
		System.out.println("Time Required : "+ (new Date().getTime() - t1));
		System.out.println("-----------------------------------------------------");
	}
}
