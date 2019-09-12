package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolioPromotionalEventMetrics
 */
public class CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolioPromotionalEventMetrics   {
  private String promotionalEventMetricDefinition = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the metric, defining how it is to be measured during and after the event 
   * @return promotionalEventMetricDefinition
  **/

  public String getPromotionalEventMetricDefinition() {
    return promotionalEventMetricDefinition;
  }

  public void setPromotionalEventMetricDefinition(String promotionalEventMetricDefinition) {
    this.promotionalEventMetricDefinition = promotionalEventMetricDefinition;
  }


}

