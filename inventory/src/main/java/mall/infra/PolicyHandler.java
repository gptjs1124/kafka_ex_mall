package mall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import mall.config.kafka.KafkaProcessor;
import mall.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    InventoryRepository inventoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryStart'"
    )
    public void wheneverDeliveryStart_DecreaseInventory(
        @Payload DeliveryStart deliveryStart
    ) {
        DeliveryStart event = deliveryStart;
        System.out.println(
            "\n\n##### listener DecreaseInventory : " + deliveryStart + "\n\n"
        );

        // Sample Logic //
        Inventory.decreaseInventory(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
