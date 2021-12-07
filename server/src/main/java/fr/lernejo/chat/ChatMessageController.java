package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatMessageController
{
   ChatMessageListener chat;

    public ChatMessageController(ChatMessageListener l) {
        this.chat=l;
    }

    @GetMapping(value ="/api/message")
    public List<String> display()
    {
      return chat.message.getLastTenMessages();
    }
}
