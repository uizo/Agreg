package org.news.agreg;

import java.net.URL;
import java.util.Map;

public interface SearchInfoItf {
	Map<URL, String> search(String query);
}
