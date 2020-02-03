
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
    private final static QName _ClaimToString_QNAME = new QName("http://server.insure.com/", "claimToString");
    private final static QName _ClaimToStringResponse_QNAME = new QName("http://server.insure.com/", "claimToStringResponse");
    private final static QName _CreateClaim_QNAME = new QName("http://server.insure.com/", "createClaim");
    private final static QName _CreateClaimResponse_QNAME = new QName("http://server.insure.com/", "createClaimResponse");
    private final static QName _GetClaim_QNAME = new QName("http://server.insure.com/", "getClaim");
    private final static QName _GetClaimResponse_QNAME = new QName("http://server.insure.com/", "getClaimResponse");
    private final static QName _GetDocumentsByClaim_QNAME = new QName("http://server.insure.com/", "getDocumentsByClaim");
    private final static QName _GetDocumentsByClaimResponse_QNAME = new QName("http://server.insure.com/", "getDocumentsByClaimResponse");
    private final static QName _GetUuid_QNAME = new QName("http://server.insure.com/", "getUuid");
    private final static QName _GetUuidResponse_QNAME = new QName("http://server.insure.com/", "getUuidResponse");
    private final static QName _Size_QNAME = new QName("http://server.insure.com/", "size");
    private final static QName _SizeResponse_QNAME = new QName("http://server.insure.com/", "sizeResponse");
    private final static QName _UpdateClaim_QNAME = new QName("http://server.insure.com/", "updateClaim");
    private final static QName _UpdateClaimResponse_QNAME = new QName("http://server.insure.com/", "updateClaimResponse");

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
     * Create an instance of {@link UpdateClaim }
     * 
     */
    public UpdateClaim createUpdateClaim() {
        return new UpdateClaim();
    }

    /**
     * Create an instance of {@link UpdateClaimResponse }
     * 
     */
    public UpdateClaimResponse createUpdateClaimResponse() {
        return new UpdateClaimResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateClaim")
    public JAXBElement<UpdateClaim> createUpdateClaim(UpdateClaim value) {
        return new JAXBElement<UpdateClaim>(_UpdateClaim_QNAME, UpdateClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateClaimResponse")
    public JAXBElement<UpdateClaimResponse> createUpdateClaimResponse(UpdateClaimResponse value) {
        return new JAXBElement<UpdateClaimResponse>(_UpdateClaimResponse_QNAME, UpdateClaimResponse.class, null, value);
    }

}
