package clouzer.json.performance;

import java.util.Date;

import org.json.JSONObject;
import org.junit.Test;

import clouzer.json.CJsonObject;
import clouzer.json.JsonObjectFactory;

public class ClzJsonObjectPerformanceTest {
	@Test
	public void testCreationCustome(){
		long t1 = new Date().getTime();
		int limit = 100000;
		try{
			for(int i = 0 ; i < limit ; i++){
				CJsonObject cJsonObject = JsonObjectFactory.createJsonObject("{\"CML_TITLE\":\"Colouring\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_3030\":{\"IDE_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_3030\",\"IDE_ATTENDEES_EMAIL\":\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_ROL_ORG:1513866840644_871_SEC:SEC_ROL_ORG_:1513866840645_TSK:TSK_ROL_ORG:1234123456789_1\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"SYNC_PENDING_STATUS\":\"0\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_3030\",\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_GET_NOTIFICATION_FLAG\":\"0\",\"IDE_ACCEPTED\":\"0\",\"IDE_TYPE\":\"CC\",\"IDE_PROJECT_MEMBER_TYPE\":\"null\",\"ACTIVE_STATUS\":\"1\",\"IDE_CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CREATED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_MULTIPLE_DATES_JSON\":\"0\",\"IDE_DESIGNATION\":[],\"TN\":\"INVITATION_DETAILS\",\"IDE_INVITATION_ACCEPTED_COUNTER\":\"0\",\"KEY_TYPE\":\"IDE\"},\"SYNC_PENDING_STATUS\":\"0\",\"CML_DURATION_TYPE\":\"Hrs\",\"ORG_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6\",\"CML_PINCODE\":\"\",\"CML_PRIORITY\":\"1\",\"CML_ACCEPTED\":\"1\",\"CML_LOCALITY\":\"Pune, Maharashtra, India\",\"CML_SUB_CATEGORY\":\"\",\"CML_ORIGINAL_SERVICE_ID\":[\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_SRV_ORG:1515041367119_607_SEC:SEC_SRV_ORG:1234567891234_5_TSK:TSK_SRV_ORG:1515041420350_620\"],\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_7836\":{\"IDE_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_7836\",\"IDE_ATTENDEES_EMAIL\":\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_ROL_ORG:1513866840644_871_SEC:SEC_ROL_ORG_:1513866840645_TSK:TSK_ROL_ORG:1234123456789_1\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"SYNC_PENDING_STATUS\":\"0\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_7836\",\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_GET_NOTIFICATION_FLAG\":\"0\",\"IDE_ACCEPTED\":\"0\",\"IDE_TYPE\":\"CC\",\"IDE_PROJECT_MEMBER_TYPE\":\"null\",\"ACTIVE_STATUS\":\"1\",\"IDE_CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CREATED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_MULTIPLE_DATES_JSON\":\"0\",\"IDE_DESIGNATION\":[],\"TN\":\"INVITATION_DETAILS\",\"IDE_INVITATION_ACCEPTED_COUNTER\":\"0\",\"KEY_TYPE\":\"IDE\"},\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2422\":{\"IDE_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2422\",\"IDE_ATTENDEES_EMAIL\":\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_ROL_ORG:1513866840644_871_SEC:SEC_ROL_ORG_:1513866840645_TSK:TSK_ROL_ORG:1234123456789_1\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"SYNC_PENDING_STATUS\":\"0\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2422\",\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_GET_NOTIFICATION_FLAG\":\"0\",\"IDE_ACCEPTED\":\"0\",\"IDE_TYPE\":\"TO\",\"IDE_PROJECT_MEMBER_TYPE\":\"null\",\"ACTIVE_STATUS\":\"1\",\"IDE_CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CREATED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_MULTIPLE_DATES_JSON\":\"0\",\"IDE_DESIGNATION\":[],\"TN\":\"INVITATION_DETAILS\",\"IDE_INVITATION_ACCEPTED_COUNTER\":\"0\",\"KEY_TYPE\":\"IDE\"},\"CML_PROPERTY_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_PROP_ORG#1515041551438_1\",\"CML_START_TIME\":\"2018-01-04T05:00:00.000Z\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"DEPT_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_5361\":{\"IDE_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_5361\",\"IDE_ATTENDEES_EMAIL\":\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_ROL_ORG:1513866840644_871_SEC:SEC_ROL_ORG_:1513866840645_TSK:TSK_ROL_ORG:1234123456789_1\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"SYNC_PENDING_STATUS\":\"0\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_5361\",\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_GET_NOTIFICATION_FLAG\":\"0\",\"IDE_ACCEPTED\":\"0\",\"IDE_TYPE\":\"TO\",\"IDE_PROJECT_MEMBER_TYPE\":\"null\",\"ACTIVE_STATUS\":\"1\",\"IDE_CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CREATED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_MULTIPLE_DATES_JSON\":\"0\",\"IDE_DESIGNATION\":[],\"TN\":\"INVITATION_DETAILS\",\"IDE_INVITATION_ACCEPTED_COUNTER\":\"0\",\"KEY_TYPE\":\"IDE\"},\"NODE_DETAILS_DISPLAY\":\"\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2255\":{\"IDE_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2255\",\"IDE_ATTENDEES_EMAIL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_ROL_ORG:1513866840644_871_SEC:SEC_ROL_ORG_:1513866840645_TSK:TSK_ROL_ORG:1234123456789_1\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"SYNC_PENDING_STATUS\":\"0\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2255\",\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_GET_NOTIFICATION_FLAG\":\"0\",\"IDE_ACCEPTED\":\"1\",\"IDE_TYPE\":\"FROM\",\"IDE_PROJECT_MEMBER_TYPE\":\"null\",\"ACTIVE_STATUS\":\"1\",\"IDE_CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CREATED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_MULTIPLE_DATES_JSON\":\"0\",\"IDE_DESIGNATION\":[\"Creator\",\"Owner\"],\"TN\":\"INVITATION_DETAILS\",\"IDE_INVITATION_ACCEPTED_COUNTER\":\"0\",\"KEY_TYPE\":\"IDE\"},\"CML_ORG_REFERENCE\":{\"DEPT_ID\":\"5.jan@mstorm.com#1515041282586#ORG:4\",\"ORG_ID\":\"5.jan@mstorm.com#1515041282586#ORG:4\"},\"CML_CURRENCY_TYPE\":\"$\",\"CML_PROVIDER_NAME\":\"04 Jan Builder 10\",\"CML_FROM_DATETIME\":\"2018-01-04T05:00:00.000Z\",\"CML_NAME\":\"04 Jan Installer 10\",\"CREATED_ON\":\"2018-01-04T04:51:24.677Z\",\"CML_TO_DATETIME\":\"2018-01-04T07:00:01.000Z\",\"CML_PRODUCT_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_BUD_PROP_ORG:1515041347764_806_SEC:SEC_BUD_PROP_ORG_:1515041347766_TSK:TSK_BUD_PROP_ORG#1515041548895_1_6\",\"CML_DESCRIPTION\":\"\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"INVITATION_DETAILS\":[\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2255\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_5361\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2422\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_7836\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_3030\"],\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.237Z\",\"CML_CLIENT_NAME\":\"04 Jan Builder 10\",\"CML_CITY\":\"\",\"CML_ORIGINAL_ID\":\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_APT_ORG:1515041370467_744_SEC:SEC_APT_ORG_:1515041370468_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CML_REF_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927\",\"CML_STATUS\":\"0\",\"CML_CATEGORY\":\"3\",\"CML_APP_ID\":\"APP_1515041611239\",\"CML_PROPERTY_NAME\":\"Pune Kothrude 1\",\"CML_ORG_ADDR_LINE1\":\"\",\"SUB_KEY_TYPE\":\"TSK_APT_MTG_ORG\",\"CML_ASSIGNED\":\"4.jan@mstorm.com\",\"CML_ASSIGNED_TYPE\":\"FROM\",\"CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CML_SERVICE_ID\":[\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_APT_ORG:1515041370467_744_SEC:SEC_APT_ORG_:1515041370468_TSK:TSK_APT_ORG#1515041611239_5_1\"],\"CML_CONFERENCE_ID\":\"4.jan@mstorm.com#CGR:CGR_TSK_APT_MTG_ORG_6905_1515041611238\",\"PayloadKey\":\"/sync#/sync#XMEbYb57E5HC5tXOAAAt4.jan@mstorm.com#1515041611246@Payload@1\",\"CML_END_TIME\":\"2018-01-04T07:00:01.000Z\",\"CML_ASSIGNED_TO\":\"\",\"CML_COST\":\"12000\",\"CML_DURATION\":{\"Min\":\"00\",\"Hrs\":\"02\"},\"ACTION\":\"INSERT\",\"ACTIVE_STATUS\":\"1\",\"TN\":\"CAL_MAIL\",\"ACTION_ARRAY\":[\"BOOK_APPOINTMENT\"],\"KEY_TYPE\":\"TSK\",\"CML_CALENDAR_ID\":\"4.jan@mstorm.com#CAL:undefined\"}");
				cJsonObject = null;
			}
			System.out.println("Time Required : testCreation : "+(new Date().getTime() - t1));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public void testCreationOfJSONObject(){
		long t1 = new Date().getTime();
		int limit = 100000;
		try{
			for(int i = 0 ; i < limit ; i++){
				JSONObject a = new JSONObject("{\"CML_TITLE\":\"Colouring\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_3030\":{\"IDE_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_3030\",\"IDE_ATTENDEES_EMAIL\":\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_ROL_ORG:1513866840644_871_SEC:SEC_ROL_ORG_:1513866840645_TSK:TSK_ROL_ORG:1234123456789_1\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"SYNC_PENDING_STATUS\":\"0\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_3030\",\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_GET_NOTIFICATION_FLAG\":\"0\",\"IDE_ACCEPTED\":\"0\",\"IDE_TYPE\":\"CC\",\"IDE_PROJECT_MEMBER_TYPE\":\"null\",\"ACTIVE_STATUS\":\"1\",\"IDE_CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CREATED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_MULTIPLE_DATES_JSON\":\"0\",\"IDE_DESIGNATION\":[],\"TN\":\"INVITATION_DETAILS\",\"IDE_INVITATION_ACCEPTED_COUNTER\":\"0\",\"KEY_TYPE\":\"IDE\"},\"SYNC_PENDING_STATUS\":\"0\",\"CML_DURATION_TYPE\":\"Hrs\",\"ORG_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6\",\"CML_PINCODE\":\"\",\"CML_PRIORITY\":\"1\",\"CML_ACCEPTED\":\"1\",\"CML_LOCALITY\":\"Pune, Maharashtra, India\",\"CML_SUB_CATEGORY\":\"\",\"CML_ORIGINAL_SERVICE_ID\":[\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_SRV_ORG:1515041367119_607_SEC:SEC_SRV_ORG:1234567891234_5_TSK:TSK_SRV_ORG:1515041420350_620\"],\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_7836\":{\"IDE_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_7836\",\"IDE_ATTENDEES_EMAIL\":\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_ROL_ORG:1513866840644_871_SEC:SEC_ROL_ORG_:1513866840645_TSK:TSK_ROL_ORG:1234123456789_1\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"SYNC_PENDING_STATUS\":\"0\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_7836\",\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_GET_NOTIFICATION_FLAG\":\"0\",\"IDE_ACCEPTED\":\"0\",\"IDE_TYPE\":\"CC\",\"IDE_PROJECT_MEMBER_TYPE\":\"null\",\"ACTIVE_STATUS\":\"1\",\"IDE_CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CREATED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_MULTIPLE_DATES_JSON\":\"0\",\"IDE_DESIGNATION\":[],\"TN\":\"INVITATION_DETAILS\",\"IDE_INVITATION_ACCEPTED_COUNTER\":\"0\",\"KEY_TYPE\":\"IDE\"},\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2422\":{\"IDE_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2422\",\"IDE_ATTENDEES_EMAIL\":\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_ROL_ORG:1513866840644_871_SEC:SEC_ROL_ORG_:1513866840645_TSK:TSK_ROL_ORG:1234123456789_1\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"SYNC_PENDING_STATUS\":\"0\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2422\",\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_GET_NOTIFICATION_FLAG\":\"0\",\"IDE_ACCEPTED\":\"0\",\"IDE_TYPE\":\"TO\",\"IDE_PROJECT_MEMBER_TYPE\":\"null\",\"ACTIVE_STATUS\":\"1\",\"IDE_CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CREATED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_MULTIPLE_DATES_JSON\":\"0\",\"IDE_DESIGNATION\":[],\"TN\":\"INVITATION_DETAILS\",\"IDE_INVITATION_ACCEPTED_COUNTER\":\"0\",\"KEY_TYPE\":\"IDE\"},\"CML_PROPERTY_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_PROP_ORG#1515041551438_1\",\"CML_START_TIME\":\"2018-01-04T05:00:00.000Z\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"DEPT_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_5361\":{\"IDE_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_5361\",\"IDE_ATTENDEES_EMAIL\":\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_ROL_ORG:1513866840644_871_SEC:SEC_ROL_ORG_:1513866840645_TSK:TSK_ROL_ORG:1234123456789_1\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"SYNC_PENDING_STATUS\":\"0\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_5361\",\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_GET_NOTIFICATION_FLAG\":\"0\",\"IDE_ACCEPTED\":\"0\",\"IDE_TYPE\":\"TO\",\"IDE_PROJECT_MEMBER_TYPE\":\"null\",\"ACTIVE_STATUS\":\"1\",\"IDE_CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CREATED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_MULTIPLE_DATES_JSON\":\"0\",\"IDE_DESIGNATION\":[],\"TN\":\"INVITATION_DETAILS\",\"IDE_INVITATION_ACCEPTED_COUNTER\":\"0\",\"KEY_TYPE\":\"IDE\"},\"NODE_DETAILS_DISPLAY\":\"\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2255\":{\"IDE_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2255\",\"IDE_ATTENDEES_EMAIL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_ROL_ORG:1513866840644_871_SEC:SEC_ROL_ORG_:1513866840645_TSK:TSK_ROL_ORG:1234123456789_1\",\"CREATED_BY\":\"4.jan@mstorm.com\",\"SYNC_PENDING_STATUS\":\"0\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2255\",\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_GET_NOTIFICATION_FLAG\":\"0\",\"IDE_ACCEPTED\":\"1\",\"IDE_TYPE\":\"FROM\",\"IDE_PROJECT_MEMBER_TYPE\":\"null\",\"ACTIVE_STATUS\":\"1\",\"IDE_CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CREATED_ON\":\"2018-01-04T04:53:31.238Z\",\"IDE_MULTIPLE_DATES_JSON\":\"0\",\"IDE_DESIGNATION\":[\"Creator\",\"Owner\"],\"TN\":\"INVITATION_DETAILS\",\"IDE_INVITATION_ACCEPTED_COUNTER\":\"0\",\"KEY_TYPE\":\"IDE\"},\"CML_ORG_REFERENCE\":{\"DEPT_ID\":\"5.jan@mstorm.com#1515041282586#ORG:4\",\"ORG_ID\":\"5.jan@mstorm.com#1515041282586#ORG:4\"},\"CML_CURRENCY_TYPE\":\"$\",\"CML_PROVIDER_NAME\":\"04 Jan Builder 10\",\"CML_FROM_DATETIME\":\"2018-01-04T05:00:00.000Z\",\"CML_NAME\":\"04 Jan Installer 10\",\"CREATED_ON\":\"2018-01-04T04:51:24.677Z\",\"CML_TO_DATETIME\":\"2018-01-04T07:00:01.000Z\",\"CML_PRODUCT_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_BUD_PROP_ORG:1515041347764_806_SEC:SEC_BUD_PROP_ORG_:1515041347766_TSK:TSK_BUD_PROP_ORG#1515041548895_1_6\",\"CML_DESCRIPTION\":\"\",\"LAST_MODIFIED_BY\":\"4.jan@mstorm.com\",\"KEY_VAL\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"INVITATION_DETAILS\":[\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2255\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_5361\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_2422\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_7836\",\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3_IDE:1515041611238_3030\"],\"LAST_MODIFIED_ON\":\"2018-01-04T04:53:31.237Z\",\"CML_CLIENT_NAME\":\"04 Jan Builder 10\",\"CML_CITY\":\"\",\"CML_ORIGINAL_ID\":\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_APT_ORG:1515041370467_744_SEC:SEC_APT_ORG_:1515041370468_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CML_REF_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927\",\"CML_STATUS\":\"0\",\"CML_CATEGORY\":\"3\",\"CML_APP_ID\":\"APP_1515041611239\",\"CML_PROPERTY_NAME\":\"Pune Kothrude 1\",\"CML_ORG_ADDR_LINE1\":\"\",\"SUB_KEY_TYPE\":\"TSK_APT_MTG_ORG\",\"CML_ASSIGNED\":\"4.jan@mstorm.com\",\"CML_ASSIGNED_TYPE\":\"FROM\",\"CML_ID\":\"4.jan@mstorm.com#1515041245921#ORG:6_PRJ:PRJ_APT_ORG:1515041353926_168_SEC:SEC_APT_ORG_:1515041353927_TSK:TSK_APT_MTG_ORG#1515041611238_6_3\",\"CML_SERVICE_ID\":[\"5.jan@mstorm.com#1515041282586#ORG:4_PRJ:PRJ_APT_ORG:1515041370467_744_SEC:SEC_APT_ORG_:1515041370468_TSK:TSK_APT_ORG#1515041611239_5_1\"],\"CML_CONFERENCE_ID\":\"4.jan@mstorm.com#CGR:CGR_TSK_APT_MTG_ORG_6905_1515041611238\",\"PayloadKey\":\"/sync#/sync#XMEbYb57E5HC5tXOAAAt4.jan@mstorm.com#1515041611246@Payload@1\",\"CML_END_TIME\":\"2018-01-04T07:00:01.000Z\",\"CML_ASSIGNED_TO\":\"\",\"CML_COST\":\"12000\",\"CML_DURATION\":{\"Min\":\"00\",\"Hrs\":\"02\"},\"ACTION\":\"INSERT\",\"ACTIVE_STATUS\":\"1\",\"TN\":\"CAL_MAIL\",\"ACTION_ARRAY\":[\"BOOK_APPOINTMENT\"],\"KEY_TYPE\":\"TSK\",\"CML_CALENDAR_ID\":\"4.jan@mstorm.com#CAL:undefined\"}");
				a = null;
			}
			System.out.println("Time Required : testCreationOfJSONObject : "+(new Date().getTime() - t1));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
