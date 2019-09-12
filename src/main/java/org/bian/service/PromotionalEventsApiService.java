/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PromotionalEventsApiService {

	SDPromotionalEventsActivateOutputModel activate(SDPromotionalEventsActivateInputModel request);
	
	SDPromotionalEventsConfigureOutputModel configure(String sdReferenceId, SDPromotionalEventsConfigureInputModel request);
	
	CRPromotionalEventManagementPlanCreateOutputModel create(String sdReferenceId, CRPromotionalEventManagementPlanCreateInputModel request);
	
	BQImpactAssessmentCreateOutputModel createImpactassessment(String sdReferenceId, String crReferenceId, BQImpactAssessmentCreateInputModel request);
	
	BQParticipationCreateOutputModel createParticipation(String sdReferenceId, String crReferenceId, BQParticipationCreateInputModel request);
	
	BQImpactAssessmentExecuteOutputModel executeImpactassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQImpactAssessmentExecuteInputModel request);
	
	BQMarketTrackingExecuteOutputModel executeMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingExecuteInputModel request);
	
	SDPromotionalEventsFeedbackOutputModel feedback(String sdReferenceId, SDPromotionalEventsFeedbackInputModel request);
	
	CRPromotionalEventManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRPromotionalEventManagementPlanGrantInputModel request);
	
	BQImpactAssessmentRequestOutputModel requestImpactassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQImpactAssessmentRequestInputModel request);
	
	BQMarketTrackingRequestOutputModel requestMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingRequestInputModel request);
	
	BQParticipationRequestOutputModel requestParticipation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipationRequestInputModel request);
	
	CRPromotionalEventManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPromotionalEventManagementPlanRequestInputModel request);
	
	BQImpactAssessmentRetrieveOutputModel retrieveImpactassessment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMarketTrackingRetrieveOutputModel retrieveMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQParticipationRetrieveOutputModel retrieveParticipation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRPromotionalEventManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDPromotionalEventsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRPromotionalEventManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPromotionalEventManagementPlanUpdateInputModel request);
	
	BQImpactAssessmentUpdateOutputModel updateImpactassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQImpactAssessmentUpdateInputModel request);
	
	BQMarketTrackingUpdateOutputModel updateMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingUpdateInputModel request);
	
	BQParticipationUpdateOutputModel updateParticipation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipationUpdateInputModel request);
	
}
