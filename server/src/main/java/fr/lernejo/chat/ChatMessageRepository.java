package fr.lernejo.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageRepository {
    List<String> list = new ArrayList<>();

    void addChatMessage(String message)
    {
     list.add(message);
    }
    List<String> getLastTenMessages()
    {

        if (list.size()>=10)
        {
            return list.subList(list.size()-10,list.size());
        }
        else
        {
            return list;
        }

    }


}
