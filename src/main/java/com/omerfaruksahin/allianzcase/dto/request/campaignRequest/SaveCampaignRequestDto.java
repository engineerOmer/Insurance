package com.omerfaruksahin.allianzcase.dto.request.campaignRequest;


import com.omerfaruksahin.allianzcase.model.CampaignCategory;
import lombok.Data;

@Data
public class SaveCampaignRequestDto {

    private String campaignTitle;
    private String campaignDetail;

    //private boolean active;

    private CampaignCategory campaignCategory;
}
