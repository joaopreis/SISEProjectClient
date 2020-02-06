
package com.insure.client.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.insure.client.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://server.insure.com/", "Exception");
    private final static QName _AddDocToClaim_QNAME = new QName("http://server.insure.com/", "addDocToClaim");
    private final static QName _AddDocToClaimResponse_QNAME = new QName("http://server.insure.com/", "addDocToClaimResponse");
    private final static QName _AddTamperedDocToClaim_QNAME = new QName("http://server.insure.com/", "addTamperedDocToClaim");
    private final static QName _AddTamperedDocToClaimResponse_QNAME = new QName("http://server.insure.com/", "addTamperedDocToClaimResponse");
    private final static QName _ClaimExistence_QNAME = new QName("http://server.insure.com/", "claimExistence");
    private final static QName _ClaimExistenceResponse_QNAME = new QName("http://server.insure.com/", "claimExistenceResponse");
    private final static QName _ClaimToString_QNAME = new QName("http://server.insure.com/", "claimToString");
    private final static QName _ClaimToStringResponse_QNAME = new QName("http://server.insure.com/", "claimToStringResponse");
    private final static QName _ClaimValidation_QNAME = new QName("http://server.insure.com/", "claimValidation");
    private final static QName _ClaimValidationResponse_QNAME = new QName("http://server.insure.com/", "claimValidationResponse");
    private final static QName _CreateClaim_QNAME = new QName("http://server.insure.com/", "createClaim");
    private final static QName _CreateClaimResponse_QNAME = new QName("http://server.insure.com/", "createClaimResponse");
    private final static QName _DocExistance_QNAME = new QName("http://server.insure.com/", "docExistance");
    private final static QName _DocExistanceResponse_QNAME = new QName("http://server.insure.com/", "docExistanceResponse");
    private final static QName _GetClaim_QNAME = new QName("http://server.insure.com/", "getClaim");
    private final static QName _GetClaimResponse_QNAME = new QName("http://server.insure.com/", "getClaimResponse");
    private final static QName _GetClaimSize_QNAME = new QName("http://server.insure.com/", "getClaimSize");
    private final static QName _GetClaimSizeResponse_QNAME = new QName("http://server.insure.com/", "getClaimSizeResponse");
    private final static QName _GetDocContent_QNAME = new QName("http://server.insure.com/", "getDocContent");
    private final static QName _GetDocContentResponse_QNAME = new QName("http://server.insure.com/", "getDocContentResponse");
    private final static QName _GetDocSignature_QNAME = new QName("http://server.insure.com/", "getDocSignature");
    private final static QName _GetDocSignatureResponse_QNAME = new QName("http://server.insure.com/", "getDocSignatureResponse");
    private final static QName _GetDocUserId_QNAME = new QName("http://server.insure.com/", "getDocUserId");
    private final static QName _GetDocUserIdResponse_QNAME = new QName("http://server.insure.com/", "getDocUserIdResponse");
    private final static QName _GetDocumentbyId_QNAME = new QName("http://server.insure.com/", "getDocumentbyId");
    private final static QName _GetDocumentbyIdResponse_QNAME = new QName("http://server.insure.com/", "getDocumentbyIdResponse");
    private final static QName _GetDocumentsByClaim_QNAME = new QName("http://server.insure.com/", "getDocumentsByClaim");
    private final static QName _GetDocumentsByClaimResponse_QNAME = new QName("http://server.insure.com/", "getDocumentsByClaimResponse");
    private final static QName _GetUuid_QNAME = new QName("http://server.insure.com/", "getUuid");
    private final static QName _GetUuidResponse_QNAME = new QName("http://server.insure.com/", "getUuidResponse");
    private final static QName _IsEmployee_QNAME = new QName("http://server.insure.com/", "isEmployee");
    private final static QName _IsEmployeeResponse_QNAME = new QName("http://server.insure.com/", "isEmployeeResponse");
    private final static QName _IsInsured_QNAME = new QName("http://server.insure.com/", "isInsured");
    private final static QName _IsInsuredResponse_QNAME = new QName("http://server.insure.com/", "isInsuredResponse");
    private final static QName _ReadDocument_QNAME = new QName("http://server.insure.com/", "readDocument");
    private final static QName _ReadDocumentResponse_QNAME = new QName("http://server.insure.com/", "readDocumentResponse");
    private final static QName _SignatureValidation_QNAME = new QName("http://server.insure.com/", "signatureValidation");
    private final static QName _SignatureValidationResponse_QNAME = new QName("http://server.insure.com/", "signatureValidationResponse");
    private final static QName _Size_QNAME = new QName("http://server.insure.com/", "size");
    private final static QName _SizeResponse_QNAME = new QName("http://server.insure.com/", "sizeResponse");
    private final static QName _UpdateDocument_QNAME = new QName("http://server.insure.com/", "updateDocument");
    private final static QName _UpdateDocumentResponse_QNAME = new QName("http://server.insure.com/", "updateDocumentResponse");
    private final static QName _UserValidation_QNAME = new QName("http://server.insure.com/", "userValidation");
    private final static QName _UserValidationResponse_QNAME = new QName("http://server.insure.com/", "userValidationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.insure.client.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AddDocToClaim }
     * 
     */
    public AddDocToClaim createAddDocToClaim() {
        return new AddDocToClaim();
    }

    /**
     * Create an instance of {@link AddDocToClaimResponse }
     * 
     */
    public AddDocToClaimResponse createAddDocToClaimResponse() {
        return new AddDocToClaimResponse();
    }

    /**
     * Create an instance of {@link AddTamperedDocToClaim }
     * 
     */
    public AddTamperedDocToClaim createAddTamperedDocToClaim() {
        return new AddTamperedDocToClaim();
    }

    /**
     * Create an instance of {@link AddTamperedDocToClaimResponse }
     * 
     */
    public AddTamperedDocToClaimResponse createAddTamperedDocToClaimResponse() {
        return new AddTamperedDocToClaimResponse();
    }

    /**
     * Create an instance of {@link ClaimExistence }
     * 
     */
    public ClaimExistence createClaimExistence() {
        return new ClaimExistence();
    }

    /**
     * Create an instance of {@link ClaimExistenceResponse }
     * 
     */
    public ClaimExistenceResponse createClaimExistenceResponse() {
        return new ClaimExistenceResponse();
    }

    /**
     * Create an instance of {@link ClaimToString }
     * 
     */
    public ClaimToString createClaimToString() {
        return new ClaimToString();
    }

    /**
     * Create an instance of {@link ClaimToStringResponse }
     * 
     */
    public ClaimToStringResponse createClaimToStringResponse() {
        return new ClaimToStringResponse();
    }

    /**
     * Create an instance of {@link ClaimValidation }
     * 
     */
    public ClaimValidation createClaimValidation() {
        return new ClaimValidation();
    }

    /**
     * Create an instance of {@link ClaimValidationResponse }
     * 
     */
    public ClaimValidationResponse createClaimValidationResponse() {
        return new ClaimValidationResponse();
    }

    /**
     * Create an instance of {@link CreateClaim }
     * 
     */
    public CreateClaim createCreateClaim() {
        return new CreateClaim();
    }

    /**
     * Create an instance of {@link CreateClaimResponse }
     * 
     */
    public CreateClaimResponse createCreateClaimResponse() {
        return new CreateClaimResponse();
    }

    /**
     * Create an instance of {@link DocExistance }
     * 
     */
    public DocExistance createDocExistance() {
        return new DocExistance();
    }

    /**
     * Create an instance of {@link DocExistanceResponse }
     * 
     */
    public DocExistanceResponse createDocExistanceResponse() {
        return new DocExistanceResponse();
    }

    /**
     * Create an instance of {@link GetClaim }
     * 
     */
    public GetClaim createGetClaim() {
        return new GetClaim();
    }

    /**
     * Create an instance of {@link GetClaimResponse }
     * 
     */
    public GetClaimResponse createGetClaimResponse() {
        return new GetClaimResponse();
    }

    /**
     * Create an instance of {@link GetClaimSize }
     * 
     */
    public GetClaimSize createGetClaimSize() {
        return new GetClaimSize();
    }

    /**
     * Create an instance of {@link GetClaimSizeResponse }
     * 
     */
    public GetClaimSizeResponse createGetClaimSizeResponse() {
        return new GetClaimSizeResponse();
    }

    /**
     * Create an instance of {@link GetDocContent }
     * 
     */
    public GetDocContent createGetDocContent() {
        return new GetDocContent();
    }

    /**
     * Create an instance of {@link GetDocContentResponse }
     * 
     */
    public GetDocContentResponse createGetDocContentResponse() {
        return new GetDocContentResponse();
    }

    /**
     * Create an instance of {@link GetDocSignature }
     * 
     */
    public GetDocSignature createGetDocSignature() {
        return new GetDocSignature();
    }

    /**
     * Create an instance of {@link GetDocSignatureResponse }
     * 
     */
    public GetDocSignatureResponse createGetDocSignatureResponse() {
        return new GetDocSignatureResponse();
    }

    /**
     * Create an instance of {@link GetDocUserId }
     * 
     */
    public GetDocUserId createGetDocUserId() {
        return new GetDocUserId();
    }

    /**
     * Create an instance of {@link GetDocUserIdResponse }
     * 
     */
    public GetDocUserIdResponse createGetDocUserIdResponse() {
        return new GetDocUserIdResponse();
    }

    /**
     * Create an instance of {@link GetDocumentbyId }
     * 
     */
    public GetDocumentbyId createGetDocumentbyId() {
        return new GetDocumentbyId();
    }

    /**
     * Create an instance of {@link GetDocumentbyIdResponse }
     * 
     */
    public GetDocumentbyIdResponse createGetDocumentbyIdResponse() {
        return new GetDocumentbyIdResponse();
    }

    /**
     * Create an instance of {@link GetDocumentsByClaim }
     * 
     */
    public GetDocumentsByClaim createGetDocumentsByClaim() {
        return new GetDocumentsByClaim();
    }

    /**
     * Create an instance of {@link GetDocumentsByClaimResponse }
     * 
     */
    public GetDocumentsByClaimResponse createGetDocumentsByClaimResponse() {
        return new GetDocumentsByClaimResponse();
    }

    /**
     * Create an instance of {@link GetUuid }
     * 
     */
    public GetUuid createGetUuid() {
        return new GetUuid();
    }

    /**
     * Create an instance of {@link GetUuidResponse }
     * 
     */
    public GetUuidResponse createGetUuidResponse() {
        return new GetUuidResponse();
    }

    /**
     * Create an instance of {@link IsEmployee }
     * 
     */
    public IsEmployee createIsEmployee() {
        return new IsEmployee();
    }

    /**
     * Create an instance of {@link IsEmployeeResponse }
     * 
     */
    public IsEmployeeResponse createIsEmployeeResponse() {
        return new IsEmployeeResponse();
    }

    /**
     * Create an instance of {@link IsInsured }
     * 
     */
    public IsInsured createIsInsured() {
        return new IsInsured();
    }

    /**
     * Create an instance of {@link IsInsuredResponse }
     * 
     */
    public IsInsuredResponse createIsInsuredResponse() {
        return new IsInsuredResponse();
    }

    /**
     * Create an instance of {@link ReadDocument }
     * 
     */
    public ReadDocument createReadDocument() {
        return new ReadDocument();
    }

    /**
     * Create an instance of {@link ReadDocumentResponse }
     * 
     */
    public ReadDocumentResponse createReadDocumentResponse() {
        return new ReadDocumentResponse();
    }

    /**
     * Create an instance of {@link SignatureValidation }
     * 
     */
    public SignatureValidation createSignatureValidation() {
        return new SignatureValidation();
    }

    /**
     * Create an instance of {@link SignatureValidationResponse }
     * 
     */
    public SignatureValidationResponse createSignatureValidationResponse() {
        return new SignatureValidationResponse();
    }

    /**
     * Create an instance of {@link Size }
     * 
     */
    public Size createSize() {
        return new Size();
    }

    /**
     * Create an instance of {@link SizeResponse }
     * 
     */
    public SizeResponse createSizeResponse() {
        return new SizeResponse();
    }

    /**
     * Create an instance of {@link UpdateDocument }
     * 
     */
    public UpdateDocument createUpdateDocument() {
        return new UpdateDocument();
    }

    /**
     * Create an instance of {@link UpdateDocumentResponse }
     * 
     */
    public UpdateDocumentResponse createUpdateDocumentResponse() {
        return new UpdateDocumentResponse();
    }

    /**
     * Create an instance of {@link UserValidation }
     * 
     */
    public UserValidation createUserValidation() {
        return new UserValidation();
    }

    /**
     * Create an instance of {@link UserValidationResponse }
     * 
     */
    public UserValidationResponse createUserValidationResponse() {
        return new UserValidationResponse();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Claim }
     * 
     */
    public Claim createClaim() {
        return new Claim();
    }

    /**
     * Create an instance of {@link AtomicInteger }
     * 
     */
    public AtomicInteger createAtomicInteger() {
        return new AtomicInteger();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDocToClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddDocToClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "addDocToClaim")
    public JAXBElement<AddDocToClaim> createAddDocToClaim(AddDocToClaim value) {
        return new JAXBElement<AddDocToClaim>(_AddDocToClaim_QNAME, AddDocToClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDocToClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddDocToClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "addDocToClaimResponse")
    public JAXBElement<AddDocToClaimResponse> createAddDocToClaimResponse(AddDocToClaimResponse value) {
        return new JAXBElement<AddDocToClaimResponse>(_AddDocToClaimResponse_QNAME, AddDocToClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTamperedDocToClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddTamperedDocToClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "addTamperedDocToClaim")
    public JAXBElement<AddTamperedDocToClaim> createAddTamperedDocToClaim(AddTamperedDocToClaim value) {
        return new JAXBElement<AddTamperedDocToClaim>(_AddTamperedDocToClaim_QNAME, AddTamperedDocToClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTamperedDocToClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddTamperedDocToClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "addTamperedDocToClaimResponse")
    public JAXBElement<AddTamperedDocToClaimResponse> createAddTamperedDocToClaimResponse(AddTamperedDocToClaimResponse value) {
        return new JAXBElement<AddTamperedDocToClaimResponse>(_AddTamperedDocToClaimResponse_QNAME, AddTamperedDocToClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimExistence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimExistence }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "claimExistence")
    public JAXBElement<ClaimExistence> createClaimExistence(ClaimExistence value) {
        return new JAXBElement<ClaimExistence>(_ClaimExistence_QNAME, ClaimExistence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimExistenceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimExistenceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "claimExistenceResponse")
    public JAXBElement<ClaimExistenceResponse> createClaimExistenceResponse(ClaimExistenceResponse value) {
        return new JAXBElement<ClaimExistenceResponse>(_ClaimExistenceResponse_QNAME, ClaimExistenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimToString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimToString }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "claimToString")
    public JAXBElement<ClaimToString> createClaimToString(ClaimToString value) {
        return new JAXBElement<ClaimToString>(_ClaimToString_QNAME, ClaimToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimToStringResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimToStringResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "claimToStringResponse")
    public JAXBElement<ClaimToStringResponse> createClaimToStringResponse(ClaimToStringResponse value) {
        return new JAXBElement<ClaimToStringResponse>(_ClaimToStringResponse_QNAME, ClaimToStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimValidation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimValidation }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "claimValidation")
    public JAXBElement<ClaimValidation> createClaimValidation(ClaimValidation value) {
        return new JAXBElement<ClaimValidation>(_ClaimValidation_QNAME, ClaimValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimValidationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimValidationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "claimValidationResponse")
    public JAXBElement<ClaimValidationResponse> createClaimValidationResponse(ClaimValidationResponse value) {
        return new JAXBElement<ClaimValidationResponse>(_ClaimValidationResponse_QNAME, ClaimValidationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createClaim")
    public JAXBElement<CreateClaim> createCreateClaim(CreateClaim value) {
        return new JAXBElement<CreateClaim>(_CreateClaim_QNAME, CreateClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createClaimResponse")
    public JAXBElement<CreateClaimResponse> createCreateClaimResponse(CreateClaimResponse value) {
        return new JAXBElement<CreateClaimResponse>(_CreateClaimResponse_QNAME, CreateClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocExistance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocExistance }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "docExistance")
    public JAXBElement<DocExistance> createDocExistance(DocExistance value) {
        return new JAXBElement<DocExistance>(_DocExistance_QNAME, DocExistance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocExistanceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocExistanceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "docExistanceResponse")
    public JAXBElement<DocExistanceResponse> createDocExistanceResponse(DocExistanceResponse value) {
        return new JAXBElement<DocExistanceResponse>(_DocExistanceResponse_QNAME, DocExistanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getClaim")
    public JAXBElement<GetClaim> createGetClaim(GetClaim value) {
        return new JAXBElement<GetClaim>(_GetClaim_QNAME, GetClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getClaimResponse")
    public JAXBElement<GetClaimResponse> createGetClaimResponse(GetClaimResponse value) {
        return new JAXBElement<GetClaimResponse>(_GetClaimResponse_QNAME, GetClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimSize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClaimSize }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getClaimSize")
    public JAXBElement<GetClaimSize> createGetClaimSize(GetClaimSize value) {
        return new JAXBElement<GetClaimSize>(_GetClaimSize_QNAME, GetClaimSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimSizeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClaimSizeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getClaimSizeResponse")
    public JAXBElement<GetClaimSizeResponse> createGetClaimSizeResponse(GetClaimSizeResponse value) {
        return new JAXBElement<GetClaimSizeResponse>(_GetClaimSizeResponse_QNAME, GetClaimSizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocContent }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocContent")
    public JAXBElement<GetDocContent> createGetDocContent(GetDocContent value) {
        return new JAXBElement<GetDocContent>(_GetDocContent_QNAME, GetDocContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocContentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocContentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocContentResponse")
    public JAXBElement<GetDocContentResponse> createGetDocContentResponse(GetDocContentResponse value) {
        return new JAXBElement<GetDocContentResponse>(_GetDocContentResponse_QNAME, GetDocContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocSignature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocSignature }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocSignature")
    public JAXBElement<GetDocSignature> createGetDocSignature(GetDocSignature value) {
        return new JAXBElement<GetDocSignature>(_GetDocSignature_QNAME, GetDocSignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocSignatureResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocSignatureResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocSignatureResponse")
    public JAXBElement<GetDocSignatureResponse> createGetDocSignatureResponse(GetDocSignatureResponse value) {
        return new JAXBElement<GetDocSignatureResponse>(_GetDocSignatureResponse_QNAME, GetDocSignatureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocUserId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocUserId }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocUserId")
    public JAXBElement<GetDocUserId> createGetDocUserId(GetDocUserId value) {
        return new JAXBElement<GetDocUserId>(_GetDocUserId_QNAME, GetDocUserId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocUserIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocUserIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocUserIdResponse")
    public JAXBElement<GetDocUserIdResponse> createGetDocUserIdResponse(GetDocUserIdResponse value) {
        return new JAXBElement<GetDocUserIdResponse>(_GetDocUserIdResponse_QNAME, GetDocUserIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentbyId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentbyId }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocumentbyId")
    public JAXBElement<GetDocumentbyId> createGetDocumentbyId(GetDocumentbyId value) {
        return new JAXBElement<GetDocumentbyId>(_GetDocumentbyId_QNAME, GetDocumentbyId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentbyIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentbyIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocumentbyIdResponse")
    public JAXBElement<GetDocumentbyIdResponse> createGetDocumentbyIdResponse(GetDocumentbyIdResponse value) {
        return new JAXBElement<GetDocumentbyIdResponse>(_GetDocumentbyIdResponse_QNAME, GetDocumentbyIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentsByClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentsByClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocumentsByClaim")
    public JAXBElement<GetDocumentsByClaim> createGetDocumentsByClaim(GetDocumentsByClaim value) {
        return new JAXBElement<GetDocumentsByClaim>(_GetDocumentsByClaim_QNAME, GetDocumentsByClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentsByClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentsByClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocumentsByClaimResponse")
    public JAXBElement<GetDocumentsByClaimResponse> createGetDocumentsByClaimResponse(GetDocumentsByClaimResponse value) {
        return new JAXBElement<GetDocumentsByClaimResponse>(_GetDocumentsByClaimResponse_QNAME, GetDocumentsByClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUuid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUuid }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getUuid")
    public JAXBElement<GetUuid> createGetUuid(GetUuid value) {
        return new JAXBElement<GetUuid>(_GetUuid_QNAME, GetUuid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUuidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUuidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getUuidResponse")
    public JAXBElement<GetUuidResponse> createGetUuidResponse(GetUuidResponse value) {
        return new JAXBElement<GetUuidResponse>(_GetUuidResponse_QNAME, GetUuidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "isEmployee")
    public JAXBElement<IsEmployee> createIsEmployee(IsEmployee value) {
        return new JAXBElement<IsEmployee>(_IsEmployee_QNAME, IsEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsEmployeeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsEmployeeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "isEmployeeResponse")
    public JAXBElement<IsEmployeeResponse> createIsEmployeeResponse(IsEmployeeResponse value) {
        return new JAXBElement<IsEmployeeResponse>(_IsEmployeeResponse_QNAME, IsEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsInsured }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsInsured }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "isInsured")
    public JAXBElement<IsInsured> createIsInsured(IsInsured value) {
        return new JAXBElement<IsInsured>(_IsInsured_QNAME, IsInsured.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsInsuredResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsInsuredResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "isInsuredResponse")
    public JAXBElement<IsInsuredResponse> createIsInsuredResponse(IsInsuredResponse value) {
        return new JAXBElement<IsInsuredResponse>(_IsInsuredResponse_QNAME, IsInsuredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "readDocument")
    public JAXBElement<ReadDocument> createReadDocument(ReadDocument value) {
        return new JAXBElement<ReadDocument>(_ReadDocument_QNAME, ReadDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReadDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "readDocumentResponse")
    public JAXBElement<ReadDocumentResponse> createReadDocumentResponse(ReadDocumentResponse value) {
        return new JAXBElement<ReadDocumentResponse>(_ReadDocumentResponse_QNAME, ReadDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValidation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureValidation }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "signatureValidation")
    public JAXBElement<SignatureValidation> createSignatureValidation(SignatureValidation value) {
        return new JAXBElement<SignatureValidation>(_SignatureValidation_QNAME, SignatureValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValidationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureValidationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "signatureValidationResponse")
    public JAXBElement<SignatureValidationResponse> createSignatureValidationResponse(SignatureValidationResponse value) {
        return new JAXBElement<SignatureValidationResponse>(_SignatureValidationResponse_QNAME, SignatureValidationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Size }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Size }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "size")
    public JAXBElement<Size> createSize(Size value) {
        return new JAXBElement<Size>(_Size_QNAME, Size.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SizeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "sizeResponse")
    public JAXBElement<SizeResponse> createSizeResponse(SizeResponse value) {
        return new JAXBElement<SizeResponse>(_SizeResponse_QNAME, SizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateDocument")
    public JAXBElement<UpdateDocument> createUpdateDocument(UpdateDocument value) {
        return new JAXBElement<UpdateDocument>(_UpdateDocument_QNAME, UpdateDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateDocumentResponse")
    public JAXBElement<UpdateDocumentResponse> createUpdateDocumentResponse(UpdateDocumentResponse value) {
        return new JAXBElement<UpdateDocumentResponse>(_UpdateDocumentResponse_QNAME, UpdateDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserValidation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserValidation }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "userValidation")
    public JAXBElement<UserValidation> createUserValidation(UserValidation value) {
        return new JAXBElement<UserValidation>(_UserValidation_QNAME, UserValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserValidationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserValidationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "userValidationResponse")
    public JAXBElement<UserValidationResponse> createUserValidationResponse(UserValidationResponse value) {
        return new JAXBElement<UserValidationResponse>(_UserValidationResponse_QNAME, UserValidationResponse.class, null, value);
    }

}
