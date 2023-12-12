package com.example.servermanager.model;

import com.example.servermanager.enumeration.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "IP address can not be empty or null")
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private String imgUrl;
    private Status status;

}
