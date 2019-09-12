package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceAnalysis
 */
public class CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceAnalysis   {
  private String promotionalEventManagementPlanInstanceAnalysisData = null;

  private String promotionalEventManagementPlanInstanceAnalysisReportType = null;

  private Object promotionalEventManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return promotionalEventManagementPlanInstanceAnalysisData
  **/

  public String getPromotionalEventManagementPlanInstanceAnalysisData() {
    return promotionalEventManagementPlanInstanceAnalysisData;
  }

  public void setPromotionalEventManagementPlanInstanceAnalysisData(String promotionalEventManagementPlanInstanceAnalysisData) {
    this.promotionalEventManagementPlanInstanceAnalysisData = promotionalEventManagementPlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return promotionalEventManagementPlanInstanceAnalysisReport
  **/

  public Object getPromotionalEventManagementPlanInstanceAnalysisReport() {
    return promotionalEventManagementPlanInstanceAnalysisReport;
  }

  public void setPromotionalEventManagementPlanInstanceAnalysisReport(Object promotionalEventManagementPlanInstanceAnalysisReport) {
    this.promotionalEventManagementPlanInstanceAnalysisReport = promotionalEventManagementPlanInstanceAnalysisReport;
  }


}

