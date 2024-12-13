package ma.mundia.digital_bankingbackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.mundia.digital_bankingbackend.enums.OperationType;


import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountOperation {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    @ManyToOne
    private BankAccount bankAccount;
}
