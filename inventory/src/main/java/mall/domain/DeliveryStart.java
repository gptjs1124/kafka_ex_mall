package mall.domain;

import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStart extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String productId;
    private String qty;
    private String address;
}
