/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PromotionalEventsApiServiceImpl implements PromotionalEventsApiService {

	public SDPromotionalEventsActivateOutputModel activate(SDPromotionalEventsActivateInputModel request){
		return JsonReader.read("activate-SDPromotionalEventsActivateOutputModel.json",new TypeReference<SDPromotionalEventsActivateOutputModel>(){});
	}
	
	public SDPromotionalEventsConfigureOutputModel configure(String sdReferenceId, SDPromotionalEventsConfigureInputModel request){
		return JsonReader.read("configure-SDPromotionalEventsConfigureOutputModel.json",new TypeReference<SDPromotionalEventsConfigureOutputModel>(){});
	}
	
	public CRPromotionalEventManagementPlanCreateOutputModel create(String sdReferenceId, CRPromotionalEventManagementPlanCreateInputModel request){
		return JsonReader.read("create-CRPromotionalEventManagementPlanCreateOutputModel.json",new TypeReference<CRPromotionalEventManagementPlanCreateOutputModel>(){});
	}
	
	public BQImpactAssessmentCreateOutputModel createImpactassessment(String sdReferenceId, String crReferenceId, BQImpactAssessmentCreateInputModel request){
		return JsonReader.read("create-BQImpactAssessmentCreateOutputModel.json",new TypeReference<BQImpactAssessmentCreateOutputModel>(){});
	}
	
	public BQParticipationCreateOutputModel createParticipation(String sdReferenceId, String crReferenceId, BQParticipationCreateInputModel request){
		return JsonReader.read("create-BQParticipationCreateOutputModel.json",new TypeReference<BQParticipationCreateOutputModel>(){});
	}
	
	public BQImpactAssessmentExecuteOutputModel executeImpactassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQImpactAssessmentExecuteInputModel request){
		return JsonReader.read("execute-BQImpactAssessmentExecuteOutputModel.json",new TypeReference<BQImpactAssessmentExecuteOutputModel>(){});
	}
	
	public BQMarketTrackingExecuteOutputModel executeMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingExecuteInputModel request){
		return JsonReader.read("execute-BQMarketTrackingExecuteOutputModel.json",new TypeReference<BQMarketTrackingExecuteOutputModel>(){});
	}
	
	public SDPromotionalEventsFeedbackOutputModel feedback(String sdReferenceId, SDPromotionalEventsFeedbackInputModel request){
		return JsonReader.read("feedback-SDPromotionalEventsFeedbackOutputModel.json",new TypeReference<SDPromotionalEventsFeedbackOutputModel>(){});
	}
	
	public CRPromotionalEventManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRPromotionalEventManagementPlanGrantInputModel request){
		return JsonReader.read("grant-CRPromotionalEventManagementPlanGrantOutputModel.json",new TypeReference<CRPromotionalEventManagementPlanGrantOutputModel>(){});
	}
	
	public BQImpactAssessmentRequestOutputModel requestImpactassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQImpactAssessmentRequestInputModel request){
		return JsonReader.read("request-BQImpactAssessmentRequestOutputModel.json",new TypeReference<BQImpactAssessmentRequestOutputModel>(){});
	}
	
	public BQMarketTrackingRequestOutputModel requestMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingRequestInputModel request){
		return JsonReader.read("request-BQMarketTrackingRequestOutputModel.json",new TypeReference<BQMarketTrackingRequestOutputModel>(){});
	}
	
	public BQParticipationRequestOutputModel requestParticipation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipationRequestInputModel request){
		return JsonReader.read("request-BQParticipationRequestOutputModel.json",new TypeReference<BQParticipationRequestOutputModel>(){});
	}
	
	public CRPromotionalEventManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRPromotionalEventManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRPromotionalEventManagementPlanRequestOutputModel.json",new TypeReference<CRPromotionalEventManagementPlanRequestOutputModel>(){});
	}
	
	public BQImpactAssessmentRetrieveOutputModel retrieveImpactassessment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQImpactAssessmentRetrieveOutputModel.json",new TypeReference<BQImpactAssessmentRetrieveOutputModel>(){});
	}
	
	public BQMarketTrackingRetrieveOutputModel retrieveMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMarketTrackingRetrieveOutputModel.json",new TypeReference<BQMarketTrackingRetrieveOutputModel>(){});
	}
	
	public BQParticipationRetrieveOutputModel retrieveParticipation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQParticipationRetrieveOutputModel.json",new TypeReference<BQParticipationRetrieveOutputModel>(){});
	}
	
	public CRPromotionalEventManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRPromotionalEventManagementPlanRetrieveOutputModel.json",new TypeReference<CRPromotionalEventManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDPromotionalEventsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPromotionalEventsRetrieveOutputModel.json",new TypeReference<SDPromotionalEventsRetrieveOutputModel>(){});
	}
	
	public CRPromotionalEventManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRPromotionalEventManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRPromotionalEventManagementPlanUpdateOutputModel.json",new TypeReference<CRPromotionalEventManagementPlanUpdateOutputModel>(){});
	}
	
	public BQImpactAssessmentUpdateOutputModel updateImpactassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQImpactAssessmentUpdateInputModel request){
		return JsonReader.read("update-BQImpactAssessmentUpdateOutputModel.json",new TypeReference<BQImpactAssessmentUpdateOutputModel>(){});
	}
	
	public BQMarketTrackingUpdateOutputModel updateMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingUpdateInputModel request){
		return JsonReader.read("update-BQMarketTrackingUpdateOutputModel.json",new TypeReference<BQMarketTrackingUpdateOutputModel>(){});
	}
	
	public BQParticipationUpdateOutputModel updateParticipation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQParticipationUpdateInputModel request){
		return JsonReader.read("update-BQParticipationUpdateOutputModel.json",new TypeReference<BQParticipationUpdateOutputModel>(){});
	}
	
}
