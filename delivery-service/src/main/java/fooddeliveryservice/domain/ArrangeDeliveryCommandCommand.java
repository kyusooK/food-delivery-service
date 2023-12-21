package fooddeliveryservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ArrangeDeliveryCommandCommand {

    private UUID orderId;
    private Address deliveryAddress;
}
