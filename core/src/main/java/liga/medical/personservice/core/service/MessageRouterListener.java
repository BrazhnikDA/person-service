package liga.medical.personservice.core.service;

import liga.medical.personservice.core.api.MessageRouterService;
import liga.medical.personservice.core.model.MessageQueueNames;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MessageRouterListener {

    private final MessageRouterService rabbitRouterService;

    @RabbitListener(queues = MessageQueueNames.ROUTER_QUEUE_NAME)
    public void receiveAndRedirectMessage(String message) {
        rabbitRouterService.routeMessage(message);
    }
}
