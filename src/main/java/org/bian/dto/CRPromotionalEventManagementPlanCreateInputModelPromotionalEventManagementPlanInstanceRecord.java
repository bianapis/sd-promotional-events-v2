package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolio;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecord
 */
public class CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecord   {
  private CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolio promotionalEventPortfolio = null;

  private String promotionalEventSchedule = null;


  /**
   * Get promotionalEventPortfolio
   * @return promotionalEventPortfolio
  **/

  public CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolio getPromotionalEventPortfolio() {
    return promotionalEventPortfolio;
  }

  public void setPromotionalEventPortfolio(CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolio promotionalEventPortfolio) {
    this.promotionalEventPortfolio = promotionalEventPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule of involvement in the portfolio/collection of promotional events 
   * @return promotionalEventSchedule
  **/

  public String getPromotionalEventSchedule() {
    return promotionalEventSchedule;
  }

  public void setPromotionalEventSchedule(String promotionalEventSchedule) {
    this.promotionalEventSchedule = promotionalEventSchedule;
  }


}

