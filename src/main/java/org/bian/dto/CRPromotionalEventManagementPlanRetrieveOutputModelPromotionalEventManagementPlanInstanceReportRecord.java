package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceReportRecord
 */
public class CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceReportRecord   {
  private String promotionalEventManagementPlanInstanceReportData = null;

  private String promotionalEventManagementPlanInstanceReportType = null;

  private Object promotionalEventManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return promotionalEventManagementPlanInstanceReportData
  **/

  public String getPromotionalEventManagementPlanInstanceReportData() {
    return promotionalEventManagementPlanInstanceReportData;
  }

  public void setPromotionalEventManagementPlanInstanceReportData(String promotionalEventManagementPlanInstanceReportData) {
    this.promotionalEventManagementPlanInstanceReportData = promotionalEventManagementPlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return promotionalEventManagementPlanInstanceReport
  **/

  public Object getPromotionalEventManagementPlanInstanceReport() {
    return promotionalEventManagementPlanInstanceReport;
  }

  public void setPromotionalEventManagementPlanInstanceReport(Object promotionalEventManagementPlanInstanceReport) {
    this.promotionalEventManagementPlanInstanceReport = promotionalEventManagementPlanInstanceReport;
  }


}

