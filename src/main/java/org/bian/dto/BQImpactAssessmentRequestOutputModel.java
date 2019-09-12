package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord;
import org.bian.dto.CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQImpactAssessmentRequestOutputModel
 */
public class BQImpactAssessmentRequestOutputModel   {
  private CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord impactAssessmentInstanceRecord = null;

  private String impactAssessmentRequestActionTaskReference = null;

  private Object impactAssessmentRequestActionTaskRecord = null;

  private String impactAssessmentRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get promotionalEventManagementPlanInstanceRecord
   * @return promotionalEventManagementPlanInstanceRecord
  **/

  public CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord getPromotionalEventManagementPlanInstanceRecord() {
    return promotionalEventManagementPlanInstanceRecord;
  }

  public void setPromotionalEventManagementPlanInstanceRecord(CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Impact Assessment instance request service call 
   * @return impactAssessmentRequestActionTaskReference
  **/

  public String getImpactAssessmentRequestActionTaskReference() {
    return impactAssessmentRequestActionTaskReference;
  }

  public void setImpactAssessmentRequestActionTaskReference(String impactAssessmentRequestActionTaskReference) {
    this.impactAssessmentRequestActionTaskReference = impactAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return impactAssessmentRequestActionTaskRecord
  **/

  public Object getImpactAssessmentRequestActionTaskRecord() {
    return impactAssessmentRequestActionTaskRecord;
  }

  public void setImpactAssessmentRequestActionTaskRecord(Object impactAssessmentRequestActionTaskRecord) {
    this.impactAssessmentRequestActionTaskRecord = impactAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Impact Assessment service request record 
   * @return impactAssessmentRequestRecordReference
  **/

  public String getImpactAssessmentRequestRecordReference() {
    return impactAssessmentRequestRecordReference;
  }

  public void setImpactAssessmentRequestRecordReference(String impactAssessmentRequestRecordReference) {
    this.impactAssessmentRequestRecordReference = impactAssessmentRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

