package com.omerfaruksahin.allianzcase.model;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ChangeLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int logId;
    private LocalDateTime dateTime;
    private boolean situation;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

}
