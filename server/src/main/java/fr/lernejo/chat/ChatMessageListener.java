package fr.lernejo.chat;


import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {
    
    ChatMessageRepository message = new ChatMessageRepository();
    public void onMessage(String a)
    {
        message.addChatMessage(a);
      //System.out.println(a);
    }


}
