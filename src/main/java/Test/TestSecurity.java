package Test;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ClientApiException;

import Utility.JSONReader;
import Utility.SecurityRunner;

public class TestSecurity {
	
@Test 
	public void testSecurity () throws FileNotFoundException, IOException, ParseException, ClientApiException
	{
		JSONReader _JSONRead = new JSONReader();
		SecurityRunner  sec1 = new SecurityRunner();
		String zap_address =  _JSONRead.ReadJSONFile("ZAP_ADDRESS", ".\\Data\\securityConf.json");
		int zap_port = Integer.parseInt( _JSONRead.ReadJSONFile("ZAP_PORT", ".\\Data\\securityConf.json")); 
		String zap_key =  _JSONRead.ReadJSONFile("ZAP_API_KEY", ".\\Data\\securityConf.json");
		String target =  _JSONRead.ReadJSONFile("TARGET", ".\\Data\\securityConf.json");
		sec1.ZAPSecurityScanner(zap_address,zap_port,zap_key, target);
	}

}
