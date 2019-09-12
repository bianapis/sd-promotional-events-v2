package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolioPromotionalEventMetrics
 */
public class CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecordPromotionalEventPortfolioPromotionalEventMetrics   {
  private String promotionalEventMetricDefinition = null;

  private String promotionalEventMetricGoal = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the target performance for the metric 
   * @return promotionalEventMetricGoal
  **/

  public String getPromotionalEventMetricGoal() {
    return promotionalEventMetricGoal;
  }

  public void setPromotionalEventMetricGoal(String promotionalEventMetricGoal) {
    this.promotionalEventMetricGoal = promotionalEventMetricGoal;
  }


}

