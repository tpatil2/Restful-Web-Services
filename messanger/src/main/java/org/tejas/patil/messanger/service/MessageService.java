package org.tejas.patil.messanger.service;

import java.util.ArrayList;
import java.util.List;
import org.tejas.patil.messanger.model.*;

public class MessageService {

	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello World", "Tejas");
		Message m2 = new Message(2L, "Hello Chico", "Tejas");
		Message m3 = new Message(3L, "Hello John", "Tejas");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);

		return list;
		
	}
}
