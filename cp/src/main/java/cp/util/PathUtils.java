package cp.util;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PathUtils {
	
	public static <T> boolean isFirstOnList(List<T> elements, T element) {
		return elements.get(0).equals(element);
	}
			
	
	public static String buildParamsFor(String path, Map<String, String> params) {
		StringBuilder withParams = new StringBuilder(path);
		boolean isFirstElement = true;
		for (Entry<String, String> keyValue : params.entrySet()) {
			String currentParams = String.format(
					"%s%s=%s", 
					isFirstElement ? "?": "&", 
					keyValue.getKey(), 
					keyValue.getValue()
			);
			withParams.append(currentParams);
			isFirstElement = false;
		}
		return withParams.toString();
		
	}

}
