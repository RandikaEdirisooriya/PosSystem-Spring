package lk.ijse.possystembackendspring.Dto.Impl;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDto {
   private String orderId;
   private String orderDate;
   private String custId;
   private String itemId;
   private int orderQty;
   private double total;
   private double amount;
   private double Discount;
}
