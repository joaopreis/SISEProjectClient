package com.insure.client;


import com.insure.client.gen.ClaimDataStore;
import com.insure.client.gen.ClaimDataStoreService;
import com.insure.client.gen.Exception;
import com.insure.client.gen.Exception_Exception;

import javax.swing.*;
import javax.xml.ws.BindingProvider;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main extends JFrame {
    public static void main(String args[]) throws Exception, java.lang.Exception {

        System.out.println("Project template - client");
        ClaimDataStoreService claimDataService=new ClaimDataStoreService();
        final ClaimDataStore claimDataStore= (ClaimDataStore) claimDataService.getClaimDataStorePort();
        String url="http://localhost:8090/docstorage";
        url = JOptionPane.showInputDialog(null,"Insert the server url",url);

        ((BindingProvider) claimDataStore).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                url);

        runClaimDataStore(claimDataStore);


    }

    public static void runClaimDataStore(ClaimDataStore claimDataStore) throws java.lang.Exception {
        final ImageIcon icon1=new ImageIcon("C:\\Users\\joaoporeis\\Desktop\\insure_logo_correction_1.png");
        JFrame frame=new JFrame();
        JOptionPane.showMessageDialog(frame,"","INSURE",JOptionPane.INFORMATION_MESSAGE,icon1);
        String userId=JOptionPane.showInputDialog(frame,"Insert your user Id:");

        int user=Integer.parseInt(userId);




        while(true){

            try{
                int i;
                if (claimDataStore.isEmployee(user)){
                    Object[] objects={"Add Document","Retrieve Documents","Read Document","Update Document (For testing reasons)",
                            "Add Tampered Document","Exit"};
                    i=JOptionPane.showOptionDialog(frame,"Choose the operation","Insure Claim Data Store",
                            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,objects,objects[0]);
                    i++;
                }else{
                    Object[] objects={"Create Claim","Add Document","Retrieve Documents","Read Document","Update Document (For testing reasons)",
                            "Add Tampered Document", "Exit"};
                    i=JOptionPane.showOptionDialog(frame,"Choose the operation","Insure Claim Data Store",
                            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,objects,objects[0]);

                }

                //Exit application
                if (i==6){
                    break;
                }

                //Create Claim
                if (i==0){
                    String description=JOptionPane.showInputDialog("Insert the claim description (Mandatory)");
                    while (description.equals("")){
                        description=JOptionPane.showInputDialog("Insert the claim description (Mandatory)");
                    }
                    int uuid=claimDataStore.createClaim(description,user);
                    String claim= claimDataStore.claimToString(uuid);
                    JOptionPane.showMessageDialog(frame, "Claim created successfully: "+ claim);
                }

                //Add Document to Claim
                if (i==1){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    int id=Integer.parseInt(uuid);

                    String fileName=JOptionPane.showInputDialog("Insert the name of the file");
                    while (fileName.equals("")){
                        fileName=JOptionPane.showInputDialog("Insert the claim description (Mandatory)");
                    }
                    String content=JOptionPane.showInputDialog("Insert the content of the document");
                    while (content.equals("")){
                        content=JOptionPane.showInputDialog("Insert the claim description (Mandatory)");
                    }

                    String pathprivatekey="keys\\privateKeys\\user"+user+"\\user"+user+"PrivateKey";
                    Signature signature=new Signature(content);

                    String Hash=signature.makeHash(content);
                    String assinatura=signature.encriptarMessage(Hash,pathprivatekey);

                    //Wsimport.bat -s ..\src -keep -p com.insure.client http://localhost:8090/docstorage?wsdl
                    claimDataStore.addDocToClaim(id, fileName, content, user, assinatura);
                    JOptionPane.showMessageDialog(frame, "Document added successfully");
                }

                //Retrieve documents
                if (i==2){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    int cid=Integer.parseInt(uuid);
                    JOptionPane.showMessageDialog(frame, claimDataStore.getDocumentsByClaim(cid));
                }

                //Read document
                if(i==3){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    String docId=JOptionPane.showInputDialog("Insert the document identifier");
                    int cid=Integer.parseInt(uuid);
                    int did=Integer.parseInt(docId);
                    if (!documentValidation(claimDataStore,cid,did)){
                        JOptionPane.showMessageDialog(frame,"Your document has been tempered.");
                        System.out.println("teste");
                    }else{
                        JOptionPane.showMessageDialog(frame,claimDataStore.readDocument(cid,did));
                    }
                }

                //Update document
                if(i==4){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    String docId=JOptionPane.showInputDialog("Insert the document identifier");
                    int cid=Integer.parseInt(uuid);
                    int did=Integer.parseInt(docId);
                    claimDataStore.updateDocument(cid,did,"This content has been tampered!");
                }

                if(i==5){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    int id=Integer.parseInt(uuid);

                    String fileName=JOptionPane.showInputDialog("Insert the name of the file");
                    String content=JOptionPane.showInputDialog("Insert the content of the document");
/////////////////////////////////////////////////////////////////////
                    //vou buscar o content e faço o encrypted hash que vai passar como input do adddoctoclaim
                    //o adddoc to claim vai chamar o claim.add que depois valida do lado do server e apenas cria se correr bem
                    String pathprivatekey="keys\\privateKeys\\user"+user+"\\user"+user+"PrivateKey";
                    Signature signature=new Signature(content);

                    String Hash=signature.makeHash(content);
                    String assinatura=signature.encriptarMessage(Hash,pathprivatekey);
//////////////////////////////////////////////////////////////////////
                    //Wsimport.bat -s ..\src -keep -p com.insure.client http://localhost:8090/docstorage?wsdl
                    claimDataStore.addTamperedDocToClaim(id, fileName, content, user, assinatura);
                    JOptionPane.showMessageDialog(null, "Document added successfully");
                }

            } catch (Exception | Exception_Exception | NoSuchAlgorithmException | UnsupportedEncodingException e) {
                JOptionPane.showMessageDialog(frame, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    public static boolean documentValidation(ClaimDataStore db,int cid,int did) throws Exception, java.lang.Exception {
        int userId = db.getDocUserId(cid, did);
        System.out.println(userId);
        String content = db.getDocContent(cid, did);
        System.out.println(content);
        String signature = db.getDocSignature(cid, did);
        System.out.println(signature);
        Signature hashContent = new Signature(content);
        String contentHashed = hashContent.makeHash(content);
        System.out.println(contentHashed);
        Signature desencryptSignature = new Signature(signature);
        String signatureDesencypted = desencryptSignature.desencriptarMessage("keys\\publicKeys\\user"+userId+"PublicKey", signature);
        System.out.println(signatureDesencypted);
        if (!contentHashed.equals(signatureDesencypted)) {
            System.out.println("False");
            return false;
        }
        System.out.println("True");
        return true;
    }



}