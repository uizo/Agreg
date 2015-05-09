import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.felix.ipojo.annotations.Bind;
import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;
import org.apache.felix.ipojo.annotations.Invalidate;
import org.apache.felix.ipojo.annotations.Property;
import org.apache.felix.ipojo.annotations.Provides;
import org.apache.felix.ipojo.annotations.Requires;
import org.apache.felix.ipojo.annotations.Unbind;
import org.apache.felix.ipojo.annotations.Validate;
import org.osgi.service.log.LogService;
/*
*
*
*
*/

@Component(name = "DataFinderAComponent")
@Provides(specifications = SearchInfoItf.class)
@Instantiate(name = "DataFinderAComponentInstance")
public class DataFinderA implements SearchInfoItf{

	@Requires(optional = false, id = "logger")
	private LogService log;
	@Property(name=SearchInfoItf.PROP_TYPE,value=SearchInfoItf.TYPE_DATAFINDER)
	private String type;
	public Map<URL, String> search(String queryingSearch) {
      HashMap<URL, String> res = new HashMap<URL, String>();
					/*
					*
					*
					*/
					
				
	  return res;
	}
	
	 @Bind(id = "logger")
	 private void bindLogger(LogService log) {
	 }
	 @Unbind(id = "logger")
	 private void unbindLogger(LogService log) {
	 }
	 @Validate
	 public void validate() {
	 log.log(LogService.LOG_INFO, "SampleProviderComponent start");
	 }
	 @Invalidate
	 public void invalidate() {
	 log.log(LogService.LOG_INFO, "SampleProviderComponent stop");
	 }


}
