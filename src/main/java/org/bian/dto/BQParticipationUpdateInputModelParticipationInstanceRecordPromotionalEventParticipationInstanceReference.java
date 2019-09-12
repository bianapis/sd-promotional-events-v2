package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipationUpdateInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference
 */
public class BQParticipationUpdateInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference   {
  private String promotionalEventSponsorshipBudget = null;

  private String employeeBusinessUnitReference = null;

  private String promotionalEventExecutionSchedule = null;

  private String promotionalEventResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The make-up of the sponsorship arrangements for participation in the event 
   * @return promotionalEventSponsorshipBudget
  **/

  public String getPromotionalEventSponsorshipBudget() {
    return promotionalEventSponsorshipBudget;
  }

  public void setPromotionalEventSponsorshipBudget(String promotionalEventSponsorshipBudget) {
    this.promotionalEventSponsorshipBudget = promotionalEventSponsorshipBudget;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for coordinating with the promotional event 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for participation in the event 
   * @return promotionalEventExecutionSchedule
  **/

  public String getPromotionalEventExecutionSchedule() {
    return promotionalEventExecutionSchedule;
  }

  public void setPromotionalEventExecutionSchedule(String promotionalEventExecutionSchedule) {
    this.promotionalEventExecutionSchedule = promotionalEventExecutionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result/impact of the overall promotional event (can refer to any detected up-tick in brand awareness and sales) 
   * @return promotionalEventResult
  **/

  public String getPromotionalEventResult() {
    return promotionalEventResult;
  }

  public void setPromotionalEventResult(String promotionalEventResult) {
    this.promotionalEventResult = promotionalEventResult;
  }


}

