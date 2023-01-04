package com.omerfaruksahin.allianzcase.dto.request.campaignRequest;


import com.omerfaruksahin.allianzcase.model.CampaignCategory;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SaveCampaignRequestDto {

    private String campaignTitle;
    private String campaignDetail;

    private CampaignCategory campaignCategory;
}
