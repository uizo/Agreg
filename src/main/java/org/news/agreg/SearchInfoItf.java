package org.news.agreg;

import java.net.URL;
import java.util.Map;

public interface SearchInfoItf {

    public final static String PROP_TYPE = "type";
    public final static String TYPE_DATAAGREG = "agregator";
    public final static String TYPE_DATAFINDER = "finder";

    Map<URL, String> search(String query);
}
