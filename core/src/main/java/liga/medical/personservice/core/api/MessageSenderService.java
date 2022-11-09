package liga.medical.personservice.core.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import liga.medical.personservice.core.dto.RabbitMessageDto;

public interface MessageSenderService {
    void sendMessage(RabbitMessageDto messageDto, String queue) throws JsonProcessingException;

}
