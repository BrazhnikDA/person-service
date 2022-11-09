package liga.medical.personservice.core.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import liga.medical.dto.annotations.DbLog;
import liga.medical.personservice.core.api.MessageSenderService;
import liga.medical.personservice.core.config.RabbitConfig;
import liga.medical.personservice.core.dto.RabbitMessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class MessageController {

    private final MessageSenderService messageSenderService;

    public MessageController(MessageSenderService messageSenderService) {
        this.messageSenderService = messageSenderService;
    }

    @PostMapping
    @DbLog
    ResponseEntity<String> sendMessage(@RequestBody RabbitMessageDto message) throws JsonProcessingException {
        messageSenderService.sendMessage(message, RabbitConfig.ROUTER_QUEUE_NAME);
        return ResponseEntity.ok(message.toString());
    }
}
