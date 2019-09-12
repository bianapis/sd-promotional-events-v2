package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceReportRecord
 */
public class CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceReportRecord   {
  private String promotionalEventManagementPlanInstanceReportReference = null;

  private String promotionalEventManagementPlanInstanceReportType = null;

  private String promotionalEventManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return promotionalEventManagementPlanInstanceReportReference
  **/

  public String getPromotionalEventManagementPlanInstanceReportReference() {
    return promotionalEventManagementPlanInstanceReportReference;
  }

  public void setPromotionalEventManagementPlanInstanceReportReference(String promotionalEventManagementPlanInstanceReportReference) {
    this.promotionalEventManagementPlanInstanceReportReference = promotionalEventManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return promotionalEventManagementPlanInstanceReportType
  **/

  public String getPromotionalEventManagementPlanInstanceReportType() {
    return promotionalEventManagementPlanInstanceReportType;
  }

  public void setPromotionalEventManagementPlanInstanceReportType(String promotionalEventManagementPlanInstanceReportType) {
    this.promotionalEventManagementPlanInstanceReportType = promotionalEventManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return promotionalEventManagementPlanInstanceReportParameters
  **/

  public String getPromotionalEventManagementPlanInstanceReportParameters() {
    return promotionalEventManagementPlanInstanceReportParameters;
  }

  public void setPromotionalEventManagementPlanInstanceReportParameters(String promotionalEventManagementPlanInstanceReportParameters) {
    this.promotionalEventManagementPlanInstanceReportParameters = promotionalEventManagementPlanInstanceReportParameters;
  }


}

