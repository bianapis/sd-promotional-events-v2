package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceAnalysis;
import org.bian.dto.CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanRetrieveInputModel
 */
public class CRPromotionalEventManagementPlanRetrieveInputModel   {
  private Object promotionalEventManagementPlanRetrieveActionTaskRecord = null;

  private String promotionalEventManagementPlanRetrieveActionRequest = null;

  private CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceReportRecord promotionalEventManagementPlanInstanceReportRecord = null;

  private CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceAnalysis promotionalEventManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return promotionalEventManagementPlanRetrieveActionTaskRecord
  **/

  public Object getPromotionalEventManagementPlanRetrieveActionTaskRecord() {
    return promotionalEventManagementPlanRetrieveActionTaskRecord;
  }

  public void setPromotionalEventManagementPlanRetrieveActionTaskRecord(Object promotionalEventManagementPlanRetrieveActionTaskRecord) {
    this.promotionalEventManagementPlanRetrieveActionTaskRecord = promotionalEventManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return promotionalEventManagementPlanRetrieveActionRequest
  **/

  public String getPromotionalEventManagementPlanRetrieveActionRequest() {
    return promotionalEventManagementPlanRetrieveActionRequest;
  }

  public void setPromotionalEventManagementPlanRetrieveActionRequest(String promotionalEventManagementPlanRetrieveActionRequest) {
    this.promotionalEventManagementPlanRetrieveActionRequest = promotionalEventManagementPlanRetrieveActionRequest;
  }


  /**
   * Get promotionalEventManagementPlanInstanceReportRecord
   * @return promotionalEventManagementPlanInstanceReportRecord
  **/

  public CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceReportRecord getPromotionalEventManagementPlanInstanceReportRecord() {
    return promotionalEventManagementPlanInstanceReportRecord;
  }

  public void setPromotionalEventManagementPlanInstanceReportRecord(CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceReportRecord promotionalEventManagementPlanInstanceReportRecord) {
    this.promotionalEventManagementPlanInstanceReportRecord = promotionalEventManagementPlanInstanceReportRecord;
  }


  /**
   * Get promotionalEventManagementPlanInstanceAnalysis
   * @return promotionalEventManagementPlanInstanceAnalysis
  **/

  public CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceAnalysis getPromotionalEventManagementPlanInstanceAnalysis() {
    return promotionalEventManagementPlanInstanceAnalysis;
  }

  public void setPromotionalEventManagementPlanInstanceAnalysis(CRPromotionalEventManagementPlanRetrieveInputModelPromotionalEventManagementPlanInstanceAnalysis promotionalEventManagementPlanInstanceAnalysis) {
    this.promotionalEventManagementPlanInstanceAnalysis = promotionalEventManagementPlanInstanceAnalysis;
  }


}

