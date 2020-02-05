package cs;

import com.sun.org.apache.bcel.internal.generic.NameSignatureInstruction;
import cs.insure.client.Claim;
import cs.insure.client.ClaimDataStore;
import cs.insure.client.ClaimDataStoreService;
import cs.insure.client.Exception_Exception;

import javax.swing.*;
import javax.xml.ws.BindingProvider;


public class Main {
    public static void main(String args[]) throws Exception_Exception {

        System.out.println("Project template - client");
        ClaimDataStoreService claimDataService=new ClaimDataStoreService();
        final ClaimDataStore claimDataStore= (ClaimDataStore) claimDataService.getClaimDataStorePort();
        String url="http://localhost:8090/docstorage";
        url = JOptionPane.showInputDialog(null,"Insert the server url",url);

        ((BindingProvider) claimDataStore).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                url);

        runClaimDataStore(claimDataStore);


    }

    public static void runClaimDataStore(ClaimDataStore claimDataStore){
        String userId=JOptionPane.showInputDialog("Insert your user Id:");
        int user=Integer.parseInt(userId);

        while(true){
            try{
                String method=JOptionPane.showInputDialog("Insert the operation:"+"\n"+
                        "[1] Create Claim" + "\n" +
                        "[2] Add Document"+"\n"+
                        "[3] Retrieve Documents"+"\n"+
                        "[4] Read Document"+"\n"+
                        "[5] Update Document (For testing reasons only!)"+"\n"+
                        "Exit");
                if (method.equals("Exit")){
                    break;
                }
                if (method.equals("1")){
                    String description=JOptionPane.showInputDialog("Insert the claim description");
                    int uuid=claimDataStore.createClaim(description,user);
                    String claim= claimDataStore.claimToString(uuid);
                    JOptionPane.showMessageDialog(null, "Claim created successfully: "+ claim);
                }
                if (method.equals("2")){
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
                    claimDataStore.addDocToClaim(id, fileName, content, user, assinatura);
                    JOptionPane.showMessageDialog(null, "Document added successfully");

                }

                if (method.equals("3")){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    int cid=Integer.parseInt(uuid);
                    JOptionPane.showMessageDialog(null, claimDataStore.getDocumentsByClaim(cid));
                }

                if(method.equals("4")){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    String docId=JOptionPane.showInputDialog("Insert the document identifier");
                    int cid=Integer.parseInt(uuid);
                    int did=Integer.parseInt(docId);
                    if (!documentValidation(claimDataStore,cid,did)){
                        JOptionPane.showMessageDialog(null,"Your document has been tempered.");
                        System.out.println("teste");
                    }else{
                        JOptionPane.showMessageDialog(null,claimDataStore.readDocument(cid,did));
                    }
                }

                if(method.equals("5")){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    String docId=JOptionPane.showInputDialog("Insert the document identifier");
                    int cid=Integer.parseInt(uuid);
                    int did=Integer.parseInt(docId);
                    claimDataStore.updateDocument(cid,did,"This content has been tampered!");
                }

            } catch (Exception e){JOptionPane.showMessageDialog(null,e.getMessage());

            }
        }
    }

    public static boolean documentValidation(ClaimDataStore db,int cid,int did) throws Exception {
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