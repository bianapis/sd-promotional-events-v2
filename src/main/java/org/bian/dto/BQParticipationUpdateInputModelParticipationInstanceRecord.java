package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipationUpdateInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference;

import javax.validation.Valid;
  
/**
 * BQParticipationUpdateInputModelParticipationInstanceRecord
 */
public class BQParticipationUpdateInputModelParticipationInstanceRecord   {
  private BQParticipationUpdateInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference promotionalEventParticipationInstanceReference = null;


  /**
   * Get promotionalEventParticipationInstanceReference
   * @return promotionalEventParticipationInstanceReference
  **/

  public BQParticipationUpdateInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference getPromotionalEventParticipationInstanceReference() {
    return promotionalEventParticipationInstanceReference;
  }

  public void setPromotionalEventParticipationInstanceReference(BQParticipationUpdateInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference promotionalEventParticipationInstanceReference) {
    this.promotionalEventParticipationInstanceReference = promotionalEventParticipationInstanceReference;
  }


}

