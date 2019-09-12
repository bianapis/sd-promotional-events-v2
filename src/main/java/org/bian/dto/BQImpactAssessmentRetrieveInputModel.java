package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQImpactAssessmentRetrieveInputModelImpactAssessmentInstanceAnalysis;
import org.bian.dto.BQImpactAssessmentRetrieveInputModelImpactAssessmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQImpactAssessmentRetrieveInputModel
 */
public class BQImpactAssessmentRetrieveInputModel   {
  private Object impactAssessmentRetrieveActionTaskRecord = null;

  private String impactAssessmentRetrieveActionRequest = null;

  private BQImpactAssessmentRetrieveInputModelImpactAssessmentInstanceReport impactAssessmentInstanceReport = null;

  private BQImpactAssessmentRetrieveInputModelImpactAssessmentInstanceAnalysis impactAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return impactAssessmentRetrieveActionRequest
  **/

  public String getImpactAssessmentRetrieveActionRequest() {
    return impactAssessmentRetrieveActionRequest;
  }

  public void setImpactAssessmentRetrieveActionRequest(String impactAssessmentRetrieveActionRequest) {
    this.impactAssessmentRetrieveActionRequest = impactAssessmentRetrieveActionRequest;
  }


  /**
   * Get impactAssessmentInstanceReport
   * @return impactAssessmentInstanceReport
  **/

  public BQImpactAssessmentRetrieveInputModelImpactAssessmentInstanceReport getImpactAssessmentInstanceReport() {
    return impactAssessmentInstanceReport;
  }

  public void setImpactAssessmentInstanceReport(BQImpactAssessmentRetrieveInputModelImpactAssessmentInstanceReport impactAssessmentInstanceReport) {
    this.impactAssessmentInstanceReport = impactAssessmentInstanceReport;
  }


  /**
   * Get impactAssessmentInstanceAnalysis
   * @return impactAssessmentInstanceAnalysis
  **/

  public BQImpactAssessmentRetrieveInputModelImpactAssessmentInstanceAnalysis getImpactAssessmentInstanceAnalysis() {
    return impactAssessmentInstanceAnalysis;
  }

  public void setImpactAssessmentInstanceAnalysis(BQImpactAssessmentRetrieveInputModelImpactAssessmentInstanceAnalysis impactAssessmentInstanceAnalysis) {
    this.impactAssessmentInstanceAnalysis = impactAssessmentInstanceAnalysis;
  }


}

