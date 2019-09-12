package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord
 */
public class BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord   {
  private String impactAssessmentWorkTaskType = null;

  private String impactAssessmentWorkTask = null;

  private String impactAssessmentWorkTaskWorkProducts = null;

  private String impactAssessmentWorkTaskResult = null;

  private String impactAssessmentWorkTaskDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. track market response to promotional event participation) 
   * @return impactAssessmentWorkTaskType
  **/

  public String getImpactAssessmentWorkTaskType() {
    return impactAssessmentWorkTaskType;
  }

  public void setImpactAssessmentWorkTaskType(String impactAssessmentWorkTaskType) {
    this.impactAssessmentWorkTaskType = impactAssessmentWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The make-up of the market tracking task performed, includes consolidation and analysis of market research 
   * @return impactAssessmentWorkTask
  **/

  public String getImpactAssessmentWorkTask() {
    return impactAssessmentWorkTask;
  }

  public void setImpactAssessmentWorkTask(String impactAssessmentWorkTask) {
    this.impactAssessmentWorkTask = impactAssessmentWorkTask;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, evaluations and findings for the work task 
   * @return impactAssessmentWorkTaskWorkProducts
  **/

  public String getImpactAssessmentWorkTaskWorkProducts() {
    return impactAssessmentWorkTaskWorkProducts;
  }

  public void setImpactAssessmentWorkTaskWorkProducts(String impactAssessmentWorkTaskWorkProducts) {
    this.impactAssessmentWorkTaskWorkProducts = impactAssessmentWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the outcome or result of the work task - indication of the need to redirect and/or expand promotional event activity 
   * @return impactAssessmentWorkTaskResult
  **/

  public String getImpactAssessmentWorkTaskResult() {
    return impactAssessmentWorkTaskResult;
  }

  public void setImpactAssessmentWorkTaskResult(String impactAssessmentWorkTaskResult) {
    this.impactAssessmentWorkTaskResult = impactAssessmentWorkTaskResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date-time the performance assessment task is performed 
   * @return impactAssessmentWorkTaskDateTime
  **/

  public String getImpactAssessmentWorkTaskDateTime() {
    return impactAssessmentWorkTaskDateTime;
  }

  public void setImpactAssessmentWorkTaskDateTime(String impactAssessmentWorkTaskDateTime) {
    this.impactAssessmentWorkTaskDateTime = impactAssessmentWorkTaskDateTime;
  }


}

