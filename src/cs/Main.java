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
                    try {
                        //Wsimport.bat -s ..\src -keep -p com.insure.client http://localhost:8090/docstorage?wsdl
                        claimDataStore.addDocToClaim(id, fileName, content, user, assinatura);
                        JOptionPane.showMessageDialog(null, "Document added successfully");
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                }

                if (method.equals("3")){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    int cid=Integer.parseInt(uuid);

                    JOptionPane.showMessageDialog(null, claimDataStore.getDocumentsByClaim(cid));
                }

            } catch (Exception e){

            }
        }
    }

    public boolean retrieveDocumentsValidation(ClaimDataStore db,int cid) throws Exception {
        int size= db.getClaimSize(cid);
        for (int i=1;i<=size;i++) {
            int userId = db.getDocUserId(cid, i);
            String content = db.getDocContent(cid, i);
            String signature = db.getDocSignature(cid, i);

            Signature hashContent = new Signature(content);
            String contentHashed = hashContent.makeHash(content);
            Signature desencryptSignature = new Signature(signature);
            String signatureDesencypted = desencryptSignature.desencriptarMessage("keys\\server\\user" + userId + "PublicKey", signature);
            if (!contentHashed.equals(signatureDesencypted)) {
                return false;
            }
        }
        return true;


        }

    }


}