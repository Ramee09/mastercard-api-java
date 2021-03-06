//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.18 at 09:53:33 AM CDT 
//


package com.mastercard.api.moneysend.v2.mapping.domain.factory;

import javax.xml.bind.annotation.XmlRegistry;

import com.mastercard.api.moneysend.v2.mapping.domain.*;

import java.util.ArrayList;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the generated package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubscriberIdRequest }
     *
     */
    /**
     * Create an instance of {@link CreateMappingRequest }
     */
    public CreateMappingRequest createCreateMappingRequest() {
        CreateMappingRequest request = new CreateMappingRequest();
        request.setAddress(createCreateMappingRequestAddress());
        request.setCardholderFullName(createCreateMappingRequestCardholderFullName());
        return request;
    }

    /**
     * Create an instance of {@link CreateMappingRequest.CardholderFullName }
     */
    public CreateMappingRequest.CardholderFullName createCreateMappingRequestCardholderFullName() {
        return new CreateMappingRequest.CardholderFullName();
    }

    /**
     * Create an instance of {@link CreateMappingRequest.Address }
     */
    public CreateMappingRequest.Address createCreateMappingRequestAddress() {
        return new CreateMappingRequest.Address();
    }

    /**
     * Create an instance of {@link CreateMapping }
     */
    public CreateMapping createCreateMapping() {
        return new CreateMapping();
    }

    /**
     * Create an instance of {@link CreateMapping.Mapping }
     */
    public CreateMapping.Mapping createCreateMappingMapping() {
        return new CreateMapping.Mapping();
    }

    /**
     * Create an instance of {@link com.mastercard.api.moneysend.v2.mapping.domain.InquireMappingRequest }
     */
    public InquireMappingRequest createInquireMappingRequest() {
        return new InquireMappingRequest();
    }

    /**
     * Create an instance of {@link InquireMapping }
     */
    public InquireMapping createInquireMapping() {
        return new InquireMapping();
    }

    /**
     * Create an instance of {@link InquireMapping.Mappings }
     */
    public InquireMapping.Mappings createInquireMappingMappings() {
        return new InquireMapping.Mappings();
    }

    /**
     * Create an instance of {@link InquireMapping.Mappings.Mapping }
     */
    public InquireMapping.Mappings.Mapping createInquireMappingMappingsMapping() {
        return new InquireMapping.Mappings.Mapping();
    }

    /**
     * Create an instance of {@link InquireMapping.Mappings.Mapping.ReceivingEligibility }
     */
    public InquireMapping.Mappings.Mapping.ReceivingEligibility createInquireMappingMappingsMappingReceivingEligibility() {
        return new InquireMapping.Mappings.Mapping.ReceivingEligibility();
    }

    /**
     * Create an instance of {@link InquireMapping.Mappings.Mapping.CardholderFullName }
     */
    public InquireMapping.Mappings.Mapping.CardholderFullName createInquireMappingMappingsMappingCardholderFullName() {
        return new InquireMapping.Mappings.Mapping.CardholderFullName();
    }

    /**
     * Create an instance of {@link InquireMapping.Mappings.Mapping.Address }
     */
    public InquireMapping.Mappings.Mapping.Address createInquireMappingMappingsMappingAddress() {
        return new InquireMapping.Mappings.Mapping.Address();
    }

    /**
     * Create an instance of {@link InquireMapping.Mappings.Mapping.ReceivingEligibility.Currency }
     */
    public InquireMapping.Mappings.Mapping.ReceivingEligibility.Currency createInquireMappingMappingsMappingReceivingEligibilityCurrency() {
        return new InquireMapping.Mappings.Mapping.ReceivingEligibility.Currency();
    }

    /**
     * Create an instance of {@link InquireMapping.Mappings.Mapping.ReceivingEligibility.Country }
     */
    public InquireMapping.Mappings.Mapping.ReceivingEligibility.Country createInquireMappingMappingsMappingReceivingEligibilityCountry() {
        return new InquireMapping.Mappings.Mapping.ReceivingEligibility.Country();
    }

    /**
     * Create an instance of {@link InquireMapping.Mappings.Mapping.ReceivingEligibility.Brand }
     */
    public InquireMapping.Mappings.Mapping.ReceivingEligibility.Brand createInquireMappingMappingsMappingReceivingEligibilityBrand() {
        return new InquireMapping.Mappings.Mapping.ReceivingEligibility.Brand();
    }

    /**
     * Create an instance of {@link com.mastercard.api.moneysend.v2.mapping.domain.UpdateMappingRequest }
     */
    public UpdateMappingRequest createUpdateMappingRequest() {
        UpdateMappingRequest updateMappingRequest = new UpdateMappingRequest();
        updateMappingRequest.setAddress(createUpdateMappingRequestAddress());
        updateMappingRequest.setCardholderFullName(createUpdateMappingRequestCardholderFullName());
        return updateMappingRequest;
    }

    /**
     * Create an instance of {@link UpdateMappingRequest.CardholderFullName }
     */
    public UpdateMappingRequest.CardholderFullName createUpdateMappingRequestCardholderFullName() {
        return new UpdateMappingRequest.CardholderFullName();
    }

    /**
     * Create an instance of {@link UpdateMappingRequest.Address }
     */
    public UpdateMappingRequest.Address createUpdateMappingRequestAddress() {
        return new UpdateMappingRequest.Address();
    }

    /**
     * Create an instance of {@link com.mastercard.api.moneysend.v2.mapping.domain.DeleteMapping }
     */
    public DeleteMapping createDeleteMapping() {
        return new DeleteMapping();
    }

    /**
     * Create an instance of {@link com.mastercard.api.moneysend.v2.mapping.domain.DeleteMapping.Mapping }
     */
    public DeleteMapping.Mapping createDeleteMappingMapping() {
        return new DeleteMapping.Mapping();
    }

    /**
     * Create an instance of {@link com.mastercard.api.moneysend.v2.mapping.domain.DeleteSubscriberIdRequest }
     */
    public DeleteSubscriberIdRequest createDeleteSubscriberIdRequest() {
        return new DeleteSubscriberIdRequest();
    }

    /**
     * Create an instance of {@link DeleteSubscriberId }
     */
    public DeleteSubscriberId createDeleteSubscriberId() {
        return new DeleteSubscriberId();
    }

    /**
     * Create an instance of {@link UpdateMapping }
     */
    public UpdateMapping createUpdateMapping() {
        return new UpdateMapping();
    }

    /**
     * Create an instance of {@link UpdateMapping.Mapping }
     */
    public UpdateMapping.Mapping createUpdateMappingMapping() {
        return new UpdateMapping.Mapping();
    }

    /**
     * Create an instance of {@link Transfer }
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link Transfer.TransactionHistory }
     */
    public Transfer.TransactionHistory createTransferTransactionHistory() {
        return new Transfer.TransactionHistory();
    }

    /**
     * Create an instance of {@link Transfer.TransactionHistory.Transaction }
     */
    public Transfer.TransactionHistory.Transaction createTransferTransactionHistoryTransaction() {
        return new Transfer.TransactionHistory.Transaction();
    }

    /**
     * Create an instance of {@link Transfer.TransactionHistory.Transaction.Response }
     */
    public Transfer.TransactionHistory.Transaction.Response createTransferTransactionHistoryTransactionResponse() {
        return new Transfer.TransactionHistory.Transaction.Response();
    }

    /**
     * Create an instance of {@link PanEligibility }
     */
    public PanEligibility createPanEligibility() {
        return new PanEligibility();
    }

    /**
     * Create an instance of {@link PanEligibility.SendingEligibility }
     */
    public PanEligibility.SendingEligibility createPanEligibilitySendingEligibility() {
        return new PanEligibility.SendingEligibility();
    }

    /**
     * Create an instance of {@link PanEligibility.ReceivingEligibility }
     */
    public PanEligibility.ReceivingEligibility createPanEligibilityReceivingEligibility() {
        return new PanEligibility.ReceivingEligibility();
    }

    /**
     * Create an instance of {@link PanEligibility.SendingEligibility.Currency }
     */
    public PanEligibility.SendingEligibility.Currency createPanEligibilitySendingEligibilityCurrency() {
        return new PanEligibility.SendingEligibility.Currency();
    }

    /**
     * Create an instance of {@link PanEligibility.SendingEligibility.Country }
     */
    public PanEligibility.SendingEligibility.Country createPanEligibilitySendingEligibilityCountry() {
        return new PanEligibility.SendingEligibility.Country();
    }

    /**
     * Create an instance of {@link PanEligibility.SendingEligibility.Brand }
     */
    public PanEligibility.SendingEligibility.Brand createPanEligibilitySendingEligibilityBrand() {
        return new PanEligibility.SendingEligibility.Brand();
    }

    /**
     * Create an instance of {@link PanEligibilityRequest }
     */
    public PanEligibilityRequest createPanEligibilityRequest() {
        return new PanEligibilityRequest();
    }

    /**
     * Create an instance of {@link TransferReversalRequest }
     */
    public TransferReversalRequest createTransferReversalRequest() {
        return new TransferReversalRequest();
    }

    /**
     * Create an instance of {@link TransferReversal }
     */
    public TransferReversal createTransferReversal() {
        return new TransferReversal();
    }

    /**
     * Create an instance of {@link TransferReversal.TransactionHistory }
     */
    public TransferReversal.TransactionHistory createTransferReversalTransactionHistory() {
        return new TransferReversal.TransactionHistory();
    }

    /**
     * Create an instance of {@link TransferReversal.TransactionHistory.Transaction }
     */
    public TransferReversal.TransactionHistory.Transaction createTransferReversalTransactionHistoryTransaction() {
        return new TransferReversal.TransactionHistory.Transaction();
    }

    /**
     * Create an instance of {@link TransferReversal.TransactionHistory.Transaction.Response }
     */
    public TransferReversal.TransactionHistory.Transaction.Response createTransferReversalTransactionHistoryTransactionResponse() {
        return new TransferReversal.TransactionHistory.Transaction.Response();
    }

    /**
     * Create an instance of {@link TransferRequest }
     *
     */
    public TransferRequest createTransferRequest() {
        TransferRequest transferRequest = new TransferRequest();
        transferRequest.setSenderAddress(createTransferRequestSenderAddress());
        transferRequest.setFundingCard(createTransferRequestFundingCard());
        transferRequest.setFundingMapped(createTransferRequestFundingMapped());
        transferRequest.setFundingAmount(createTransferRequestFundingAmount());
        transferRequest.setReceiverAddress(createTransferRequestReceiverAddress());
        transferRequest.setReceivingCard(createTransferRequestReceivingCard());
        transferRequest.setReceivingAmount(createTransferRequestReceivingAmount());
        transferRequest.setCardAcceptor(createTransferRequestCardAcceptor());
        return transferRequest;
    }

    /**
     * Create an instance of {@link TransferRequest.SenderAddress }
     *
     */
    public TransferRequest.SenderAddress createTransferRequestSenderAddress() {
        return new TransferRequest.SenderAddress();
    }

    /**
     * Create an instance of {@link TransferRequest.FundingCard }
     *
     */
    public TransferRequest.FundingCard createTransferRequestFundingCard() {
        return new TransferRequest.FundingCard();
    }

    /**
     * Create an instance of {@link TransferRequest.FundingMapped }
     *
     */
    public TransferRequest.FundingMapped createTransferRequestFundingMapped() {
        return new TransferRequest.FundingMapped();
    }

    /**
     * Create an instance of {@link TransferRequest.FundingAmount }
     *
     */
    public TransferRequest.FundingAmount createTransferRequestFundingAmount() {
        return new TransferRequest.FundingAmount();
    }

    /**
     * Create an instance of {@link TransferRequest.ReceiverAddress }
     *
     */
    public TransferRequest.ReceiverAddress createTransferRequestReceiverAddress() {
        return new TransferRequest.ReceiverAddress();
    }

    /**
     * Create an instance of {@link TransferRequest.ReceivingCard }
     *
     */
    public TransferRequest.ReceivingCard createTransferRequestReceivingCard() {
        return new TransferRequest.ReceivingCard();
    }

    /**
     * Create an instance of {@link TransferRequest.ReceivingAmount }
     *
     */
    public TransferRequest.ReceivingAmount createTransferRequestReceivingAmount() {
        return new TransferRequest.ReceivingAmount();
    }

    /**
     * Create an instance of {@link TransferRequest.CardAcceptor }
     *
     */
    public TransferRequest.CardAcceptor createTransferRequestCardAcceptor() {
        return new TransferRequest.CardAcceptor();
    }

    /**
     * Create an instance of {@link PaymentRequest }
     *
     */
    public PaymentRequest createPaymentRequest() {
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setSenderAddress(createPaymentRequestSenderAddress());
        paymentRequest.setReceivingCard(createPaymentRequestReceivingCard());
        paymentRequest.setReceivingMapped(createPaymentRequestReceivingMapped());
        paymentRequest.setReceivingAmount(createPaymentRequestReceivingAmount());
        paymentRequest.setCardAcceptor(createPaymentRequestCardAcceptor());
        return paymentRequest;
    }

    /**
     * Create an instance of {@link PaymentRequest.SenderAddress }
     *
     */
    public PaymentRequest.SenderAddress createPaymentRequestSenderAddress() {
        return new PaymentRequest.SenderAddress();
    }

    /**
     * Create an instance of {@link PaymentRequest.ReceivingCard }
     *
     */
    public PaymentRequest.ReceivingCard createPaymentRequestReceivingCard() {
        return new PaymentRequest.ReceivingCard();
    }

    /**
     * Create an instance of {@link PaymentRequest.ReceivingMapped }
     *
     */
    public PaymentRequest.ReceivingMapped createPaymentRequestReceivingMapped() {
        return new PaymentRequest.ReceivingMapped();
    }

    /**
     * Create an instance of {@link PaymentRequest.ReceivingAmount }
     *
     */
    public PaymentRequest.ReceivingAmount createPaymentRequestReceivingAmount() {
        return new PaymentRequest.ReceivingAmount();
    }

    /**
     * Create an instance of {@link PaymentRequest.CardAcceptor }
     *
     */
    public PaymentRequest.CardAcceptor createPaymentRequestCardAcceptor() {
        return new PaymentRequest.CardAcceptor();
    }

}