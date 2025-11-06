package com.ecommerce.Hermurio.models;

import com.ecommerce.Hermurio.models.Enum.PaymentStatusEnum;
import com.ecommerce.Hermurio.models.Enum.PaymentTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PAYMENT")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private PaymentTypeEnum payment;

    @Column(nullable = false)
    private PaymentStatusEnum paymentStatus;

    @Column(nullable = false)
    private LocalDate paymentDate;
}
