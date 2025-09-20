package mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStart extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String productId;
    private String qty;
    private String address;

    public DeliveryStart(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStart() {
        super();
    }
}
//>>> DDD / Domain Event
