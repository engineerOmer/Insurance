package com.omerfaruksahin.allianzcase.model;

import jakarta.persistence.*;
import lombok.*;




@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int campaignId;
    private String campaignTitle;
    private String campaignDetail;
    private boolean active;
    private boolean mukerrer = false;
    private CampaignCategory campaignCategory;


}
