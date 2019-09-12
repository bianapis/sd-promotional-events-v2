package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceAnalysis
 */
public class CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceAnalysis   {
  private String promotionalEventManagementPlanInstanceAnalysisReference = null;

  private String promotionalEventManagementPlanInstanceAnalysisReportType = null;

  private String promotionalEventManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return promotionalEventManagementPlanInstanceAnalysisReference
  **/

  public String getPromotionalEventManagementPlanInstanceAnalysisReference() {
    return promotionalEventManagementPlanInstanceAnalysisReference;
  }

  public void setPromotionalEventManagementPlanInstanceAnalysisReference(String promotionalEventManagementPlanInstanceAnalysisReference) {
    this.promotionalEventManagementPlanInstanceAnalysisReference = promotionalEventManagementPlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return promotionalEventManagementPlanInstanceAnalysisReportType
  **/

  public String getPromotionalEventManagementPlanInstanceAnalysisReportType() {
    return promotionalEventManagementPlanInstanceAnalysisReportType;
  }

  public void setPromotionalEventManagementPlanInstanceAnalysisReportType(String promotionalEventManagementPlanInstanceAnalysisReportType) {
    this.promotionalEventManagementPlanInstanceAnalysisReportType = promotionalEventManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return promotionalEventManagementPlanInstanceAnalysisParameters
  **/

  public String getPromotionalEventManagementPlanInstanceAnalysisParameters() {
    return promotionalEventManagementPlanInstanceAnalysisParameters;
  }

  public void setPromotionalEventManagementPlanInstanceAnalysisParameters(String promotionalEventManagementPlanInstanceAnalysisParameters) {
    this.promotionalEventManagementPlanInstanceAnalysisParameters = promotionalEventManagementPlanInstanceAnalysisParameters;
  }


}

