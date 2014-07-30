package si.merljak.examples.gwtportlet.server;

import si.merljak.examples.gwtportlet.shared.rpc.TestService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class TestServiceImpl extends RemoteServiceServlet implements TestService {

	/**
	 *
	 */
	private static final long serialVersionUID = 7485759315160185227L;

	@Override
	public String getTestMessage() {
		return "Server says Hello!";
	}
}
