package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceRecordCorporateActionTransaction
 */
public class BQCorporateActionsRetrieveOutputModelCorporateActionsInstanceRecordCorporateActionTransaction   {
  private String corporateActionTransactionType = null;

  private String corporateActionTransactionDescription = null;

  private String corporateActionWorkProducts = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String corporateActionTransactionResult = null;

  private String corporateActionTransactionDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of corporate action applied to the securities holdings 
   * @return corporateActionTransactionType
  **/

  public String getCorporateActionTransactionType() {
    return corporateActionTransactionType;
  }

  public void setCorporateActionTransactionType(String corporateActionTransactionType) {
    this.corporateActionTransactionType = corporateActionTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details describing the purpose and impact of processing the action 
   * @return corporateActionTransactionDescription
  **/

  public String getCorporateActionTransactionDescription() {
    return corporateActionTransactionDescription;
  }

  public void setCorporateActionTransactionDescription(String corporateActionTransactionDescription) {
    this.corporateActionTransactionDescription = corporateActionTransactionDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, forms and documents for the corporate action 
   * @return corporateActionWorkProducts
  **/

  public String getCorporateActionWorkProducts() {
    return corporateActionWorkProducts;
  }

  public void setCorporateActionWorkProducts(String corporateActionWorkProducts) {
    this.corporateActionWorkProducts = corporateActionWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of applying the action to the account (can be simple confirmation) 
   * @return corporateActionTransactionResult
  **/

  public String getCorporateActionTransactionResult() {
    return corporateActionTransactionResult;
  }

  public void setCorporateActionTransactionResult(String corporateActionTransactionResult) {
    this.corporateActionTransactionResult = corporateActionTransactionResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the corporate action was processed to the account 
   * @return corporateActionTransactionDate
  **/

  public String getCorporateActionTransactionDate() {
    return corporateActionTransactionDate;
  }

  public void setCorporateActionTransactionDate(String corporateActionTransactionDate) {
    this.corporateActionTransactionDate = corporateActionTransactionDate;
  }


}

