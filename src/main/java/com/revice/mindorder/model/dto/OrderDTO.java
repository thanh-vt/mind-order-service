package com.revice.mindorder.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO extends BaseDTO {

    private String shopId;

    private String shopName;

    private String customerId;

    private String customerName;

    private String inventoryId;

    private String deliveryId;

    private String deliveryPartner;

    private BigDecimal fee;

    private String deliveryStatus;

    private String paymentId;

    private String paymentMethod;

    private BigDecimal amount;

    private BigDecimal discount;

    private BigDecimal finalAmount;

    private Integer status;

    public interface Groups {
        interface Create {
        }

        interface Update {
        }
    }

    public interface Views {
        interface Public {
        }

        interface Internal extends Public {
        }
    }
}
