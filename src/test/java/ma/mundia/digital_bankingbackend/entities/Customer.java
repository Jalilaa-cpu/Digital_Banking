package ma.mundia.digital_bankingbackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String full_Name;
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<BankAccount> bankAccounts;

}
