package org.sakaiproject.client;

import java.net.URL;

import org.sakaiproject.webservices.SakaiLogin;
import org.sakaiproject.webservices.SakaiLoginService;
import org.springframework.stereotype.Service;

@Service
public class ServiceLogin {

	public String login(String id, String pw) {
		
		try {
			SakaiLoginService myservi = new SakaiLoginService(
					new URL("https://qa12-mysql.nightly.sakaiproject.org/sakai-ws/soap/login?wsdl"));
			SakaiLogin callServi = myservi.getSakaiLoginPort();
			
			return callServi.loginToServerGET(id, pw);
			
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}
	

}
