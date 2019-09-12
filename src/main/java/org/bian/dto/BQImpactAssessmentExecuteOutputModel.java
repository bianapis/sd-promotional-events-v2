package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord;
import org.bian.dto.CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQImpactAssessmentExecuteOutputModel
 */
public class BQImpactAssessmentExecuteOutputModel   {
  private CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord impactAssessmentInstanceRecord = null;

  private String impactAssessmentExecuteActionTaskReference = null;

  private Object impactAssessmentExecuteActionTaskRecord = null;

  private String impactAssessmentExecuteRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Impact Assessment instance execute service call 
   * @return impactAssessmentExecuteActionTaskReference
  **/

  public String getImpactAssessmentExecuteActionTaskReference() {
    return impactAssessmentExecuteActionTaskReference;
  }

  public void setImpactAssessmentExecuteActionTaskReference(String impactAssessmentExecuteActionTaskReference) {
    this.impactAssessmentExecuteActionTaskReference = impactAssessmentExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return impactAssessmentExecuteActionTaskRecord
  **/

  public Object getImpactAssessmentExecuteActionTaskRecord() {
    return impactAssessmentExecuteActionTaskRecord;
  }

  public void setImpactAssessmentExecuteActionTaskRecord(Object impactAssessmentExecuteActionTaskRecord) {
    this.impactAssessmentExecuteActionTaskRecord = impactAssessmentExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Impact Assessment execute transaction/record 
   * @return impactAssessmentExecuteRecordReference
  **/

  public String getImpactAssessmentExecuteRecordReference() {
    return impactAssessmentExecuteRecordReference;
  }

  public void setImpactAssessmentExecuteRecordReference(String impactAssessmentExecuteRecordReference) {
    this.impactAssessmentExecuteRecordReference = impactAssessmentExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

