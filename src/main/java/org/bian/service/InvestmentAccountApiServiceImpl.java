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
public class InvestmentAccountApiServiceImpl implements InvestmentAccountApiService {

	public SDInvestmentAccountActivateOutputModel activate(SDInvestmentAccountActivateInputModel request){
		return JsonReader.read("activate-SDInvestmentAccountActivateOutputModel.json",new TypeReference<SDInvestmentAccountActivateOutputModel>(){});
	}
	
	public SDInvestmentAccountConfigureOutputModel configure(String sdReferenceId, SDInvestmentAccountConfigureInputModel request){
		return JsonReader.read("configure-SDInvestmentAccountConfigureOutputModel.json",new TypeReference<SDInvestmentAccountConfigureOutputModel>(){});
	}
	
	public CRInvestmentAccountFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRInvestmentAccountFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRInvestmentAccountFulfillmentArrangementControlOutputModel.json",new TypeReference<CRInvestmentAccountFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQCorporateActionsExchangeOutputModel exchangeCorporateactions(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorporateActionsExchangeInputModel request){
		return JsonReader.read("exchange-BQCorporateActionsExchangeOutputModel.json",new TypeReference<BQCorporateActionsExchangeOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsExchangeOutputModel exchangeDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsExchangeInputModel request){
		return JsonReader.read("exchange-BQDepositsandWithdrawalsExchangeOutputModel.json",new TypeReference<BQDepositsandWithdrawalsExchangeOutputModel>(){});
	}
	
	public BQServiceFeesExchangeOutputModel exchangeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExchangeInputModel request){
		return JsonReader.read("exchange-BQServiceFeesExchangeOutputModel.json",new TypeReference<BQServiceFeesExchangeOutputModel>(){});
	}
	
	public BQCorporateActionsExecuteOutputModel executeCorporateactions(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorporateActionsExecuteInputModel request){
		return JsonReader.read("execute-BQCorporateActionsExecuteOutputModel.json",new TypeReference<BQCorporateActionsExecuteOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsExecuteOutputModel executeDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsExecuteInputModel request){
		return JsonReader.read("execute-BQDepositsandWithdrawalsExecuteOutputModel.json",new TypeReference<BQDepositsandWithdrawalsExecuteOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public SDInvestmentAccountFeedbackOutputModel feedback(String sdReferenceId, SDInvestmentAccountFeedbackInputModel request){
		return JsonReader.read("feedback-SDInvestmentAccountFeedbackOutputModel.json",new TypeReference<SDInvestmentAccountFeedbackOutputModel>(){});
	}
	
	public CRInvestmentAccountFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRInvestmentAccountFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRInvestmentAccountFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRInvestmentAccountFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQCorporateActionsInitiateOutputModel initiateCorporateactions(String sdReferenceId, String crReferenceId, BQCorporateActionsInitiateInputModel request){
		return JsonReader.read("initiate-BQCorporateActionsInitiateOutputModel.json",new TypeReference<BQCorporateActionsInitiateOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsInitiateOutputModel initiateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, BQDepositsandWithdrawalsInitiateInputModel request){
		return JsonReader.read("initiate-BQDepositsandWithdrawalsInitiateOutputModel.json",new TypeReference<BQDepositsandWithdrawalsInitiateOutputModel>(){});
	}
	
	public BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request){
		return JsonReader.read("initiate-BQServiceFeesInitiateOutputModel.json",new TypeReference<BQServiceFeesInitiateOutputModel>(){});
	}
	
	public BQServiceFeesRequestOutputModel requestServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesRequestInputModel request){
		return JsonReader.read("request-BQServiceFeesRequestOutputModel.json",new TypeReference<BQServiceFeesRequestOutputModel>(){});
	}
	
	public CRInvestmentAccountFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRInvestmentAccountFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRInvestmentAccountFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQCorporateActionsRetrieveOutputModel retrieveCorporateactions(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCorporateActionsRetrieveOutputModel.json",new TypeReference<BQCorporateActionsRetrieveOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsRetrieveOutputModel retrieveDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDepositsandWithdrawalsRetrieveOutputModel.json",new TypeReference<BQDepositsandWithdrawalsRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDInvestmentAccountRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDInvestmentAccountRetrieveOutputModel.json",new TypeReference<SDInvestmentAccountRetrieveOutputModel>(){});
	}
	
	public CRInvestmentAccountFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRInvestmentAccountFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRInvestmentAccountFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRInvestmentAccountFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQCorporateActionsUpdateOutputModel updateCorporateactions(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorporateActionsUpdateInputModel request){
		return JsonReader.read("update-BQCorporateActionsUpdateOutputModel.json",new TypeReference<BQCorporateActionsUpdateOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsUpdateOutputModel updateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsUpdateInputModel request){
		return JsonReader.read("update-BQDepositsandWithdrawalsUpdateOutputModel.json",new TypeReference<BQDepositsandWithdrawalsUpdateOutputModel>(){});
	}
	
	public BQServiceFeesUpdateOutputModel updateServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesUpdateInputModel request){
		return JsonReader.read("update-BQServiceFeesUpdateOutputModel.json",new TypeReference<BQServiceFeesUpdateOutputModel>(){});
	}
	
}
