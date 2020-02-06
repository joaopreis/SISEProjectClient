
package com.insure.client.gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClaimDataStore", targetNamespace = "http://server.insure.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClaimDataStore {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "size", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.Size")
    @ResponseWrapper(localName = "sizeResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.SizeResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/sizeRequest", output = "http://server.insure.com/ClaimDataStore/sizeResponse")
    public int size();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateClaim")
    @ResponseWrapper(localName = "createClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/createClaimRequest", output = "http://server.insure.com/ClaimDataStore/createClaimResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/createClaim/Fault/Exception")
    })
    public int createClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "docExistance", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.DocExistance")
    @ResponseWrapper(localName = "docExistanceResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.DocExistanceResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/docExistanceRequest", output = "http://server.insure.com/ClaimDataStore/docExistanceResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/docExistance/Fault/Exception")
    })
    public boolean docExistance(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClaimSize", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetClaimSize")
    @ResponseWrapper(localName = "getClaimSizeResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetClaimSizeResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/getClaimSizeRequest", output = "http://server.insure.com/ClaimDataStore/getClaimSizeResponse")
    public int getClaimSize(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.insure.client.gen.Document
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDocumentbyId", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetDocumentbyId")
    @ResponseWrapper(localName = "getDocumentbyIdResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetDocumentbyIdResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/getDocumentbyIdRequest", output = "http://server.insure.com/ClaimDataStore/getDocumentbyIdResponse")
    public Document getDocumentbyId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ReadDocument")
    @ResponseWrapper(localName = "readDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ReadDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/readDocumentRequest", output = "http://server.insure.com/ClaimDataStore/readDocumentResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/readDocument/Fault/Exception")
    })
    public String readDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "claimToString", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ClaimToString")
    @ResponseWrapper(localName = "claimToStringResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ClaimToStringResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/claimToStringRequest", output = "http://server.insure.com/ClaimDataStore/claimToStringResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/claimToString/Fault/Exception")
    })
    public String claimToString(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "userValidation", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.UserValidation")
    @ResponseWrapper(localName = "userValidationResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.UserValidationResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/userValidationRequest", output = "http://server.insure.com/ClaimDataStore/userValidationResponse")
    public boolean userValidation(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "claimValidation", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ClaimValidation")
    @ResponseWrapper(localName = "claimValidationResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ClaimValidationResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/claimValidationRequest", output = "http://server.insure.com/ClaimDataStore/claimValidationResponse")
    public boolean claimValidation(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.insure.client.gen.Claim
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetClaim")
    @ResponseWrapper(localName = "getClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/getClaimRequest", output = "http://server.insure.com/ClaimDataStore/getClaimResponse")
    public Claim getClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addDocToClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.AddDocToClaim")
    @ResponseWrapper(localName = "addDocToClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.AddDocToClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/addDocToClaimRequest", output = "http://server.insure.com/ClaimDataStore/addDocToClaimResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/addDocToClaim/Fault/Exception")
    })
    public void addDocToClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUuid", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetUuid")
    @ResponseWrapper(localName = "getUuidResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetUuidResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/getUuidRequest", output = "http://server.insure.com/ClaimDataStore/getUuidResponse")
    public int getUuid();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "claimExistence", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ClaimExistence")
    @ResponseWrapper(localName = "claimExistenceResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ClaimExistenceResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/claimExistenceRequest", output = "http://server.insure.com/ClaimDataStore/claimExistenceResponse")
    public boolean claimExistence(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "signatureValidation", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.SignatureValidation")
    @ResponseWrapper(localName = "signatureValidationResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.SignatureValidationResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/signatureValidationRequest", output = "http://server.insure.com/ClaimDataStore/signatureValidationResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/signatureValidation/Fault/Exception")
    })
    public boolean signatureValidation(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addTamperedDocToClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.AddTamperedDocToClaim")
    @ResponseWrapper(localName = "addTamperedDocToClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.AddTamperedDocToClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/addTamperedDocToClaimRequest", output = "http://server.insure.com/ClaimDataStore/addTamperedDocToClaimResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/addTamperedDocToClaim/Fault/Exception")
    })
    public void addTamperedDocToClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDocumentsByClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetDocumentsByClaim")
    @ResponseWrapper(localName = "getDocumentsByClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetDocumentsByClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/getDocumentsByClaimRequest", output = "http://server.insure.com/ClaimDataStore/getDocumentsByClaimResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server.insure.com/ClaimDataStore/getDocumentsByClaim/Fault/Exception")
    })
    public String getDocumentsByClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDocUserId", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetDocUserId")
    @ResponseWrapper(localName = "getDocUserIdResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetDocUserIdResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/getDocUserIdRequest", output = "http://server.insure.com/ClaimDataStore/getDocUserIdResponse")
    public int getDocUserId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isEmployee", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.IsEmployee")
    @ResponseWrapper(localName = "isEmployeeResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.IsEmployeeResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/isEmployeeRequest", output = "http://server.insure.com/ClaimDataStore/isEmployeeResponse")
    public boolean isEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDocContent", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetDocContent")
    @ResponseWrapper(localName = "getDocContentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetDocContentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/getDocContentRequest", output = "http://server.insure.com/ClaimDataStore/getDocContentResponse")
    public String getDocContent(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.UpdateDocument")
    @ResponseWrapper(localName = "updateDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.UpdateDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/updateDocumentRequest", output = "http://server.insure.com/ClaimDataStore/updateDocumentResponse")
    public void updateDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDocSignature", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetDocSignature")
    @ResponseWrapper(localName = "getDocSignatureResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.GetDocSignatureResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/getDocSignatureRequest", output = "http://server.insure.com/ClaimDataStore/getDocSignatureResponse")
    public String getDocSignature(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
