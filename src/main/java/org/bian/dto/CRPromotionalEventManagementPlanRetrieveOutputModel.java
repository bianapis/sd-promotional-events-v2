package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceAnalysis;
import org.bian.dto.CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceReportRecord;
import org.bian.dto.CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanRetrieveOutputModel
 */
public class CRPromotionalEventManagementPlanRetrieveOutputModel   {
  private CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private String promotionalEventManagementPlanRetrieveActionTaskReference = null;

  private Object promotionalEventManagementPlanRetrieveActionTaskRecord = null;

  private String promotionalEventManagementPlanRetrieveActionResponse = null;

  private CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceReportRecord promotionalEventManagementPlanInstanceReportRecord = null;

  private CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceAnalysis promotionalEventManagementPlanInstanceAnalysis = null;


  /**
   * Get promotionalEventManagementPlanInstanceRecord
   * @return promotionalEventManagementPlanInstanceRecord
  **/

  public CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord getPromotionalEventManagementPlanInstanceRecord() {
    return promotionalEventManagementPlanInstanceRecord;
  }

  public void setPromotionalEventManagementPlanInstanceRecord(CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord) {
    this.promotionalEventManagementPlanInstanceRecord = promotionalEventManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Promotional Event Management Plan instance retrieve service call 
   * @return promotionalEventManagementPlanRetrieveActionTaskReference
  **/

  public String getPromotionalEventManagementPlanRetrieveActionTaskReference() {
    return promotionalEventManagementPlanRetrieveActionTaskReference;
  }

  public void setPromotionalEventManagementPlanRetrieveActionTaskReference(String promotionalEventManagementPlanRetrieveActionTaskReference) {
    this.promotionalEventManagementPlanRetrieveActionTaskReference = promotionalEventManagementPlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return promotionalEventManagementPlanRetrieveActionResponse
  **/

  public String getPromotionalEventManagementPlanRetrieveActionResponse() {
    return promotionalEventManagementPlanRetrieveActionResponse;
  }

  public void setPromotionalEventManagementPlanRetrieveActionResponse(String promotionalEventManagementPlanRetrieveActionResponse) {
    this.promotionalEventManagementPlanRetrieveActionResponse = promotionalEventManagementPlanRetrieveActionResponse;
  }


  /**
   * Get promotionalEventManagementPlanInstanceReportRecord
   * @return promotionalEventManagementPlanInstanceReportRecord
  **/

  public CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceReportRecord getPromotionalEventManagementPlanInstanceReportRecord() {
    return promotionalEventManagementPlanInstanceReportRecord;
  }

  public void setPromotionalEventManagementPlanInstanceReportRecord(CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceReportRecord promotionalEventManagementPlanInstanceReportRecord) {
    this.promotionalEventManagementPlanInstanceReportRecord = promotionalEventManagementPlanInstanceReportRecord;
  }


  /**
   * Get promotionalEventManagementPlanInstanceAnalysis
   * @return promotionalEventManagementPlanInstanceAnalysis
  **/

  public CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceAnalysis getPromotionalEventManagementPlanInstanceAnalysis() {
    return promotionalEventManagementPlanInstanceAnalysis;
  }

  public void setPromotionalEventManagementPlanInstanceAnalysis(CRPromotionalEventManagementPlanRetrieveOutputModelPromotionalEventManagementPlanInstanceAnalysis promotionalEventManagementPlanInstanceAnalysis) {
    this.promotionalEventManagementPlanInstanceAnalysis = promotionalEventManagementPlanInstanceAnalysis;
  }


}

