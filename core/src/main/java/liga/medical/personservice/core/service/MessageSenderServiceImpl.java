package liga.medical.personservice.core.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import liga.medical.dto.RabbitMessageDto;
import liga.medical.personservice.core.api.MessageSenderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MessageSenderServiceImpl implements MessageSenderService {
    private final AmqpTemplate amqpTemplate;
    private final ObjectMapper objectMapper;

    @Override
    public void sendMessage(RabbitMessageDto messageDto, String queue) throws JsonProcessingException {
        String messageFromJson = objectMapper.writeValueAsString(messageDto);
        amqpTemplate.convertAndSend(queue, messageFromJson);
        log.info("Сообщение [{}] отправлено в очередь [{}]", messageFromJson, queue);
    }
}
