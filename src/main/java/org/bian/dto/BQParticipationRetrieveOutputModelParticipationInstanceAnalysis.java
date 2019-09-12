package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipationRetrieveOutputModelParticipationInstanceAnalysis
 */
public class BQParticipationRetrieveOutputModelParticipationInstanceAnalysis   {
  private Object participationInstanceAnalysisRecord = null;

  private String participationInstanceAnalysisReportType = null;

  private String participationInstanceAnalysisParameters = null;

  private Object participationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return participationInstanceAnalysisRecord
  **/

  public Object getParticipationInstanceAnalysisRecord() {
    return participationInstanceAnalysisRecord;
  }

  public void setParticipationInstanceAnalysisRecord(Object participationInstanceAnalysisRecord) {
    this.participationInstanceAnalysisRecord = participationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return participationInstanceAnalysisReportType
  **/

  public String getParticipationInstanceAnalysisReportType() {
    return participationInstanceAnalysisReportType;
  }

  public void setParticipationInstanceAnalysisReportType(String participationInstanceAnalysisReportType) {
    this.participationInstanceAnalysisReportType = participationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return participationInstanceAnalysisParameters
  **/

  public String getParticipationInstanceAnalysisParameters() {
    return participationInstanceAnalysisParameters;
  }

  public void setParticipationInstanceAnalysisParameters(String participationInstanceAnalysisParameters) {
    this.participationInstanceAnalysisParameters = participationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return participationInstanceAnalysisReport
  **/

  public Object getParticipationInstanceAnalysisReport() {
    return participationInstanceAnalysisReport;
  }

  public void setParticipationInstanceAnalysisReport(Object participationInstanceAnalysisReport) {
    this.participationInstanceAnalysisReport = participationInstanceAnalysisReport;
  }


}

