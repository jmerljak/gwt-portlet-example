package si.merljak.examples.gwtportlet.client;

import si.merljak.examples.gwtportlet.shared.rpc.TestService;
import si.merljak.examples.gwtportlet.shared.rpc.TestServiceAsync;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Simple GWT entry class that displays welcome message and executes RPC.
 *
 * @author Jakob Merljak
 *
 */
public class GwtPortlet implements EntryPoint {

    private static final TestServiceAsync testService = GWT.create(TestService.class);

	@Override
	public void onModuleLoad() {
		final RootPanel rootPanel = RootPanel.get("gwtContent");
		rootPanel.add(new Label("GWT says Hello!"));

		testService.getTestMessage(new AsyncCallback<String>() {
			@Override
			public void onSuccess(String message) {
				rootPanel.add(new Label(message));
			}

			@Override
			public void onFailure(Throwable caught) {
				rootPanel.add(new Label("Error reaching server: " + caught.getMessage()));
			}
		});
	}
}
