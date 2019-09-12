package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipationRequestInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference;

import javax.validation.Valid;
  
/**
 * BQParticipationRequestInputModelParticipationInstanceRecord
 */
public class BQParticipationRequestInputModelParticipationInstanceRecord   {
  private BQParticipationRequestInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference promotionalEventParticipationInstanceReference = null;


  /**
   * Get promotionalEventParticipationInstanceReference
   * @return promotionalEventParticipationInstanceReference
  **/

  public BQParticipationRequestInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference getPromotionalEventParticipationInstanceReference() {
    return promotionalEventParticipationInstanceReference;
  }

  public void setPromotionalEventParticipationInstanceReference(BQParticipationRequestInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference promotionalEventParticipationInstanceReference) {
    this.promotionalEventParticipationInstanceReference = promotionalEventParticipationInstanceReference;
  }


}

