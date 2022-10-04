package site.metacoding.chatt;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Service;

@Service
@ServerEndpoint(value = "/chatt")
public class WebSocketChatt {
	private static Set<Session> clients = 
			Collections.synchronizedSet(new HashSet<Session>());
	
	@OnMessage // 메시지가 수신되었을 때
	public void onMessage(String msg, Session session) throws Exception{
	}
	
	@OnOpen // ㅋ클라이언트가 접속할 때 발생하는 이벤트
	public void onOpen(Session s) {
		
	}
	
	@OnClose //클라이언트가 브라우저를 끄거나 다른 경로로 이동할 때
	public void onClos(Session s) {
		
	}
	
}