
package com.example.PRG381_Project.domain;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long adminId;
    private String username;
    private String password;          
}
