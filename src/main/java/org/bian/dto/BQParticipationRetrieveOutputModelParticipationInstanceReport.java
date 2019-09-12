package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipationRetrieveOutputModelParticipationInstanceReport
 */
public class BQParticipationRetrieveOutputModelParticipationInstanceReport   {
  private Object participationInstanceReportRecord = null;

  private String participationInstanceReportType = null;

  private String participationInstanceReportParameters = null;

  private Object participationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return participationInstanceReportRecord
  **/

  public Object getParticipationInstanceReportRecord() {
    return participationInstanceReportRecord;
  }

  public void setParticipationInstanceReportRecord(Object participationInstanceReportRecord) {
    this.participationInstanceReportRecord = participationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return participationInstanceReportType
  **/

  public String getParticipationInstanceReportType() {
    return participationInstanceReportType;
  }

  public void setParticipationInstanceReportType(String participationInstanceReportType) {
    this.participationInstanceReportType = participationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return participationInstanceReportParameters
  **/

  public String getParticipationInstanceReportParameters() {
    return participationInstanceReportParameters;
  }

  public void setParticipationInstanceReportParameters(String participationInstanceReportParameters) {
    this.participationInstanceReportParameters = participationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return participationInstanceReport
  **/

  public Object getParticipationInstanceReport() {
    return participationInstanceReport;
  }

  public void setParticipationInstanceReport(Object participationInstanceReport) {
    this.participationInstanceReport = participationInstanceReport;
  }


}

