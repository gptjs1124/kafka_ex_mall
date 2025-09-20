package mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryDecreaed extends AbstractEvent {

    private Long id;
    private String name;
    private Integer price;
    private String stock;

    public InventoryDecreaed(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryDecreaed() {
        super();
    }
}
//>>> DDD / Domain Event
