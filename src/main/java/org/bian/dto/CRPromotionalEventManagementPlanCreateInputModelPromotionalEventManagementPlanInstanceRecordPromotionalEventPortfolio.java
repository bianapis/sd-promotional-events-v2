package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolioPromotionalEventMetrics;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolio
 */
public class CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolio   {
  private String promotionalEventType = null;

  private String promotionalEventDescription = null;

  private CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolioPromotionalEventMetrics promotionalEventMetrics = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of promotional event (e.g. sports event, art/entertainment event, media event) 
   * @return promotionalEventType
  **/

  public String getPromotionalEventType() {
    return promotionalEventType;
  }

  public void setPromotionalEventType(String promotionalEventType) {
    this.promotionalEventType = promotionalEventType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the promotional event that clarifies the required sponsorship and participation and the anticipated marketing impact and target audience 
   * @return promotionalEventDescription
  **/

  public String getPromotionalEventDescription() {
    return promotionalEventDescription;
  }

  public void setPromotionalEventDescription(String promotionalEventDescription) {
    this.promotionalEventDescription = promotionalEventDescription;
  }


  /**
   * Get promotionalEventMetrics
   * @return promotionalEventMetrics
  **/

  public CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolioPromotionalEventMetrics getPromotionalEventMetrics() {
    return promotionalEventMetrics;
  }

  public void setPromotionalEventMetrics(CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolioPromotionalEventMetrics promotionalEventMetrics) {
    this.promotionalEventMetrics = promotionalEventMetrics;
  }


}

