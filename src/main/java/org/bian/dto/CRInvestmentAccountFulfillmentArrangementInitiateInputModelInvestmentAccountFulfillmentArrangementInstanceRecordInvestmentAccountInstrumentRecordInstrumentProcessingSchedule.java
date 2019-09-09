package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentProcessingSchedule
 */
public class CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecordInstrumentProcessingSchedule   {
  private String instrumentEventType = null;

  private String instrumentEventDescription = null;

  private String instrumentEventDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of event impacting the state of the instrument (e.g. corporate actions) 
   * @return instrumentEventType
  **/

  public String getInstrumentEventType() {
    return instrumentEventType;
  }

  public void setInstrumentEventType(String instrumentEventType) {
    this.instrumentEventType = instrumentEventType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the event associated actions or impact 
   * @return instrumentEventDescription
  **/

  public String getInstrumentEventDescription() {
    return instrumentEventDescription;
  }

  public void setInstrumentEventDescription(String instrumentEventDescription) {
    this.instrumentEventDescription = instrumentEventDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the event is anticipated/occurs 
   * @return instrumentEventDate
  **/

  public String getInstrumentEventDate() {
    return instrumentEventDate;
  }

  public void setInstrumentEventDate(String instrumentEventDate) {
    this.instrumentEventDate = instrumentEventDate;
  }


}

