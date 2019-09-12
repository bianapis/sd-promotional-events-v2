package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord;
import org.bian.dto.BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceAnalysis;
import org.bian.dto.BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceReport;
import org.bian.dto.CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQImpactAssessmentRetrieveOutputModel
 */
public class BQImpactAssessmentRetrieveOutputModel   {
  private CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord impactAssessmentInstanceRecord = null;

  private String impactAssessmentRetrieveActionTaskReference = null;

  private Object impactAssessmentRetrieveActionTaskRecord = null;

  private String impactAssessmentRetrieveActionResponse = null;

  private BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceReport impactAssessmentInstanceReport = null;

  private BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceAnalysis impactAssessmentInstanceAnalysis = null;


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
   * Get impactAssessmentInstanceRecord
   * @return impactAssessmentInstanceRecord
  **/

  public BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord getImpactAssessmentInstanceRecord() {
    return impactAssessmentInstanceRecord;
  }

  public void setImpactAssessmentInstanceRecord(BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord impactAssessmentInstanceRecord) {
    this.impactAssessmentInstanceRecord = impactAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Impact Assessment instance retrieve service call 
   * @return impactAssessmentRetrieveActionTaskReference
  **/

  public String getImpactAssessmentRetrieveActionTaskReference() {
    return impactAssessmentRetrieveActionTaskReference;
  }

  public void setImpactAssessmentRetrieveActionTaskReference(String impactAssessmentRetrieveActionTaskReference) {
    this.impactAssessmentRetrieveActionTaskReference = impactAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return impactAssessmentRetrieveActionTaskRecord
  **/

  public Object getImpactAssessmentRetrieveActionTaskRecord() {
    return impactAssessmentRetrieveActionTaskRecord;
  }

  public void setImpactAssessmentRetrieveActionTaskRecord(Object impactAssessmentRetrieveActionTaskRecord) {
    this.impactAssessmentRetrieveActionTaskRecord = impactAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return impactAssessmentRetrieveActionResponse
  **/

  public String getImpactAssessmentRetrieveActionResponse() {
    return impactAssessmentRetrieveActionResponse;
  }

  public void setImpactAssessmentRetrieveActionResponse(String impactAssessmentRetrieveActionResponse) {
    this.impactAssessmentRetrieveActionResponse = impactAssessmentRetrieveActionResponse;
  }


  /**
   * Get impactAssessmentInstanceReport
   * @return impactAssessmentInstanceReport
  **/

  public BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceReport getImpactAssessmentInstanceReport() {
    return impactAssessmentInstanceReport;
  }

  public void setImpactAssessmentInstanceReport(BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceReport impactAssessmentInstanceReport) {
    this.impactAssessmentInstanceReport = impactAssessmentInstanceReport;
  }


  /**
   * Get impactAssessmentInstanceAnalysis
   * @return impactAssessmentInstanceAnalysis
  **/

  public BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceAnalysis getImpactAssessmentInstanceAnalysis() {
    return impactAssessmentInstanceAnalysis;
  }

  public void setImpactAssessmentInstanceAnalysis(BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceAnalysis impactAssessmentInstanceAnalysis) {
    this.impactAssessmentInstanceAnalysis = impactAssessmentInstanceAnalysis;
  }


}

