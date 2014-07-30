package si.merljak.examples.gwtportlet.shared.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TestServiceAsync {

	void getTestMessage(AsyncCallback<String> callback);

}
