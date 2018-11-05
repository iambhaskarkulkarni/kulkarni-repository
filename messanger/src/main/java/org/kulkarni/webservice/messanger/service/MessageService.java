package org.kulkarni.webservice.messanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.kulkarni.webservice.messanger.database.DatabaseClass;
import org.kulkarni.webservice.messanger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hello World", "bhaskar"));
		messages.put(2L, new Message(2, "Hello Jersey", "bhaskar"));
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		Message message = messages.get(id);
		if(message == null) {
			return null;
		}
		return message;
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public void removeMessage(long id) {
	  messages.remove(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
