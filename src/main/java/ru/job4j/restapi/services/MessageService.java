package ru.job4j.restapi.services;

import org.springframework.stereotype.Service;
import ru.job4j.restapi.domains.Message;
import ru.job4j.restapi.repositpries.MessageRepository;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }
}
