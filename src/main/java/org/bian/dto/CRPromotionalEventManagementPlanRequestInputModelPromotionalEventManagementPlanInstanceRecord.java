package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolio;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanRequestInputModelPromotionalEventManagementPlanInstanceRecord
 */
public class CRPromotionalEventManagementPlanRequestInputModelPromotionalEventManagementPlanInstanceRecord   {
  private CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolio promotionalEventPortfolio = null;


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


}

