package cp.connections.run;

import java.util.HashMap;
import java.util.Map;

public class MySql {
	
	public static String urlByDataBase(String database) {
		return "jdbc:mysql://localhost:3306/" + database;
	}
	
	public static Map<String, String> getParamsMaps() {
		Map<String, String> urlParams = new HashMap<>();
		urlParams.put("user", "root");
		urlParams.put("password", "root");
		urlParams.put("useUnicode", "true");
		urlParams.put("useJDBCCompliantTimezoneShift", "true");
		urlParams.put("useLegacyDatetimeCode", "false");
		urlParams.put("serverTimezone", "UTC");
		return urlParams;
	};
	
	

}
