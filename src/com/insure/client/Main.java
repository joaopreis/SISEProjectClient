package com.insure.client;

import com.insure.client.gen.AtomicInteger;
import com.insure.client.gen.Claim;
import com.insure.client.gen.ClaimDataStore;
import com.insure.client.gen.ClaimDataStoreService;

import javax.swing.*;
import javax.xml.ws.BindingProvider;
import java.security.Signature;

public class Main {
    public static void main(String args[]){
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

                    String pathprivatekey="keys\\privateKeys\\user"+user+"\\user"+user+"PrivateKey";





                    String fileName=JOptionPane.showInputDialog("Insert the name of the file");
                    String content=JOptionPane.showInputDialog("Insert the content of the document");
                    claimDataStore.addDocToClaim(id, fileName,content,user);
                    JOptionPane.showMessageDialog(null, "Document added successfully");
                }

                if (method.equals("3")){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    int id=Integer.parseInt(uuid);
                    JOptionPane.showMessageDialog(null, claimDataStore.getDocumentsByClaim(id));
                }

            } catch (Exception e){

            }
        }
    }


}