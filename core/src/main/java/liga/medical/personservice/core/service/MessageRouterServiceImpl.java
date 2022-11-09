package liga.medical.personservice.core.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import liga.medical.dto.MessageType;
import liga.medical.personservice.core.api.MessageRouterService;
import liga.medical.personservice.core.api.MessageSenderService;
import liga.medical.personservice.core.dto.RabbitMessageDto;
import liga.medical.personservice.core.model.MessageQueueNames;
import liga.medical.personservice.core.model.SignalsData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MessageRouterServiceImpl implements MessageRouterService {

    private final MessageSenderService rabbitSenderService;
    private final ObjectMapper objectMapper;
    private final SignalsService signalsService;

    @Override
    public void routeMessage(String message) {
        try {
            RabbitMessageDto rabbitMessageDto = objectMapper.readValue(message, RabbitMessageDto.class);
            MessageType messageType = rabbitMessageDto.getType();

            switch (messageType) {
                case DAILY:
                    rabbitSenderService.sendMessage(rabbitMessageDto, MessageQueueNames.DAILY_QUEUE_NAME);
                    signalsService.addSignal(
                            new SignalsData(
                                    rabbitMessageDto.getId(),
                                    rabbitMessageDto.getPersonDataId(),
                                    rabbitMessageDto.getDescription(),
                                    rabbitMessageDto.getType().name()
                            ));
                    break;
                case ALERT:
                    rabbitSenderService.sendMessage(rabbitMessageDto, MessageQueueNames.ALERT_QUEUE_NAME);
                    signalsService.addSignal(
                            new SignalsData(
                                    rabbitMessageDto.getId(),
                                    rabbitMessageDto.getPersonDataId(),
                                    rabbitMessageDto.getDescription(),
                                    rabbitMessageDto.getType().name()
                            ));
                    break;
                default:
                    log.info("Cannot send message [{}] to any queue", rabbitMessageDto);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
