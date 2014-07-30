package si.merljak.examples.gwtportlet.shared.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("testService")
public interface TestService extends RemoteService {

   String getTestMessage();

}
