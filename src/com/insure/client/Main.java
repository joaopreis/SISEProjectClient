package com.insure.client;


import com.insure.client.gen.ClaimDataStore;
import com.insure.client.gen.ClaimDataStoreService;
import com.insure.client.gen.Exception_Exception;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.xml.ws.BindingProvider;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame {
    public static void main(String args[]) throws Exception, java.lang.Exception {
        //Wsimport.bat -s ..\src -keep -p com.insure.client.gen http://localhost:8090/docstorage?wsdl

        System.out.println("Project template - client");
        ClaimDataStoreService claimDataService=new ClaimDataStoreService();
        final ClaimDataStore claimDataStore= (ClaimDataStore) claimDataService.getClaimDataStorePort();
        String url="http://localhost:8090/docstorage";
        //url = JOptionPane.showInputDialog(null,"Insert the server url",url);

        ((BindingProvider) claimDataStore).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                url);

        runClaimDataStore(claimDataStore);


    }

    public static void runClaimDataStore(ClaimDataStore claimDataStore) throws java.lang.Exception {

        File errormessage = new File("addons"+System.getProperty("file.separator")+"Windows Error.wav");
        File Logoff = new File("addons"+System.getProperty("file.separator")+"Windows Logoff Sound.wav");
        File Login = new File("addons"+System.getProperty("file.separator")+"Windows Logon.wav");

        final ImageIcon icon1=new ImageIcon("addons"+System.getProperty("file.separator")+"insure_logo_correction_1.png");
        JFrame frame=new JFrame();
        Object[] initial={"Continue","Exit"};
        boolean menu=true;
        String userId;
        int user=-1;

        while (menu){
            int n=JOptionPane.showOptionDialog(frame,"Welcome to ClaimDataStore",
                    "InSure",JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,icon1,initial,initial[0]);

            if (n==1){
                menu=false;
                PlaySound(Logoff);
                break;
            }
            if(n==0){
                userId=JOptionPane.showInputDialog(frame,"Insert your user Id (Number):");
                while(userId!=null){
                    while(userId.equals("")){
                        userId=JOptionPane.showInputDialog(frame,"Insert your user Id (Mandatory)");

                        if (userId==null){
                            break;
                        }
                    }
                    if(userId==null){
                        break;
                    }

                    user=Integer.parseInt(userId);
                    break;
                }
                if (user!=-1) {

                    if (claimDataStore.isEmployee(user) | claimDataStore.isInsured(user)) {
                        PlaySound(Login);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid user", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }



        while(menu){

            try{
                int i;
                if (claimDataStore.isEmployee(user)){
                    Object[] objects={"Add Document","Retrieve Documents","Read Document","Read Claim","Update Document (For testing reasons)",
                            "Add Tampered Document","Exit"};
                    i=JOptionPane.showOptionDialog(frame,"Choose the operation","InSure Claim Data Store",
                            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,objects,objects[0]);
                    i++;
                }else{
                    Object[] objects={"Create Claim","Add Document","Retrieve Documents","Read Document","Read Claim",
                            "Update Document (For testing reasons)",
                            "Add Tampered Document", "Exit"};
                    i=JOptionPane.showOptionDialog(frame,"Choose the operation","Insure Claim Data Store",
                            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,objects,objects[0]);

                }

                //Exit application
                if (i==7){

                    PlaySound(Logoff);
                    break;
                }

                //Create Claim
                if (i==0){
                    createClaim(claimDataStore, frame, user);
                }

                //Add Document to Claim
                if (i==1) {
                    addDocumentToClaim(claimDataStore, frame, user);
                }



                //Retrieve documents
                if (i==2){
                    retrieveDocuments(claimDataStore, frame,user);
                }

                //Read document
                if(i==3){
                    readDocument(claimDataStore, errormessage, frame, user);
                }

                //Read Claim
                if(i==4){

                    readClaim(claimDataStore, frame, user);

                }

                //Update document
                if(i==5) {

                    updateDocument(claimDataStore);
                }

                //Tampering Test
                if(i==6) {
                    addTamperedDocument(claimDataStore, user);

                }

            } catch (Exception e) {
                PlaySound(errormessage);
                JOptionPane.showMessageDialog(frame, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    public static void addTamperedDocument(ClaimDataStore claimDataStore, int user) throws java.lang.Exception {
        String uuid = JOptionPane.showInputDialog("Insert the claim identifier");
        while (uuid != null) {
            while (uuid.equals("")) {
                uuid = JOptionPane.showInputDialog("Insert the claim identifier (Mandatory)");
                if (uuid == null) {
                    break;
                }
            }
            if (uuid == null) {
                break;
            }
            int id = Integer.parseInt(uuid);

            String fileName = JOptionPane.showInputDialog("Insert the name of the file");
            if (fileName == null) {
                break;
            }
            while (fileName.equals("")) {
                fileName = JOptionPane.showInputDialog("Insert the name of the file (Mandatory)");
                if (fileName == null) {
                    break;
                }
            }
            if (fileName == null) {
                break;
            }

            String content = JOptionPane.showInputDialog("Insert the content of the document");
            if (content == null) {
                break;
            }
            while (content.equals("")) {
                content = JOptionPane.showInputDialog("Insert the content of the document (Mandatory)");
                if (content == null) {
                    break;
                }
            }

            if (content == null) {
                break;
            }

            String pathprivatekey = "keys"+System.getProperty("file.separator")+"privateKeys"+System.getProperty("file.separator")+
                    "user" + user + System.getProperty("file.separator")+"user" + user + "PrivateKey";
            Signature signature = new Signature(content);

            String Hash = signature.makeHash(content);
            String assinatura = signature.encriptarMessage(Hash, pathprivatekey);

            claimDataStore.addTamperedDocToClaim(id, fileName, content, user, assinatura);
            JOptionPane.showMessageDialog(null, "Document added successfully");
            break;
        }
    }

    public static void updateDocument(ClaimDataStore claimDataStore) throws Exception_Exception, Exception_Exception {
        String uuid = JOptionPane.showInputDialog("Insert the claim identifier");
        while (uuid != null) {
            while (uuid.equals("")) {
                uuid = JOptionPane.showInputDialog("Insert the claim identifier (Mandatory)");
                if (uuid == null) {
                    break;
                }
            }
            if (uuid == null) {
                break;
            }

            String docId = JOptionPane.showInputDialog("Insert the document identifier");
            if (docId == null) {
                break;
            }
            while (docId.equals("")) {
                docId = JOptionPane.showInputDialog("Insert the document identifier");
                if (docId == null) {
                    break;
                }
            }

            if (docId == null) {
                break;
            }

            int cid = Integer.parseInt(uuid);
            int did = Integer.parseInt(docId);
            claimDataStore.updateDocument(cid, did, "This content has been tampered!");
            break;
        }
    }

    public static void readClaim(ClaimDataStore claimDataStore, JFrame frame, int user) throws Exception_Exception {
        String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
        while (uuid!=null){
            while (uuid.equals("")){
                uuid=JOptionPane.showInputDialog("Insert the claim identifier (Mandatory)");
                if(uuid==null){
                    break;
                }
            }
            if (uuid==null){
                break;
            }
            int cid=Integer.parseInt(uuid);
            JOptionPane.showMessageDialog(frame,claimDataStore.claimToString(cid,user));
            break;
        }
    }

    public static void readDocument(ClaimDataStore claimDataStore, File errormessage, JFrame frame, int user) throws Exception, java.lang.Exception {
        String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
        while(uuid!=null) {
            while (uuid.equals("")) {
                uuid = JOptionPane.showInputDialog("Insert the claim identifier (Mandatory)");
                if (uuid == null) {
                    break;
                }
            }
            if (uuid==null){
                break;
            }

            String docId = JOptionPane.showInputDialog("Insert the document identifier");
            if (docId==null){
                break;
            }
            while (docId.equals("")){
                docId = JOptionPane.showInputDialog("Insert the document identifier (Mandatory)");
                if (docId==null){
                    break;
                }
            }
            if (docId==null){
                break;
            }

            int cid = Integer.parseInt(uuid);
            int did = Integer.parseInt(docId);
            if (claimDataStore.docExistance(cid,did)) {
                if (!documentValidation(claimDataStore, cid, did)) {
                    JOptionPane.showMessageDialog(frame, "Your document has been tempered.");
                    System.out.println("teste");
                } else {
                    JOptionPane.showMessageDialog(frame, claimDataStore.readDocument(cid, did, user));
                }
            }else{
                PlaySound(errormessage);
                JOptionPane.showMessageDialog(frame, "The document does not exist","Error",JOptionPane.ERROR_MESSAGE);

                }
            break;
        }
    }

    public static void retrieveDocuments(ClaimDataStore claimDataStore, JFrame frame,int user) throws Exception_Exception {
        String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
        while(uuid!=null) {
            while (uuid.equals("")) {
                uuid = JOptionPane.showInputDialog("Insert the claim identifier (Mandatory)");
                if (uuid == null) {
                    break;
                }
            }
            if(uuid==null){
                break;
            }

            int cid = Integer.parseInt(uuid);
            JOptionPane.showMessageDialog(frame, claimDataStore.getDocumentsByClaim(cid,user));
            break;
        }
    }

    public static void addDocumentToClaim(ClaimDataStore claimDataStore, JFrame frame, int user) throws java.lang.Exception {
        String uuid = JOptionPane.showInputDialog("Insert the claim identifier");
        while (uuid != null) {
            while (uuid.equals("")) {
                uuid = JOptionPane.showInputDialog("Insert the claim identifier");
                if (uuid == null) {
                    break;
                }
            }
            if (uuid == null) {
                break;
            }


            int id = Integer.parseInt(uuid);

            String fileName = JOptionPane.showInputDialog("Insert the name of the file");
            if (fileName == null) {
                break;
            }
            while (fileName.equals("")) {
                fileName = JOptionPane.showInputDialog("Insert the name of the file (Mandatory)");
                if (fileName == null) {
                    break;
                }
            }
            if (fileName == null) {
                break;
            }

            String content = JOptionPane.showInputDialog("Insert the content of the document");
            if (content == null) {
                break;
            }
            while (content.equals("")) {
                content = JOptionPane.showInputDialog("Insert the content of the document (Mandatory)");
                if (content == null) {
                    break;
                }
            }

            if (content == null) {
                break;
            }


            String pathprivatekey = "keys"+System.getProperty("file.separator")+"privateKeys"+System.getProperty("file.separator")+"user" + user +
                    System.getProperty("file.separator")+"user" + user + "PrivateKey";
            Signature signature = new Signature(content);

            String Hash = signature.makeHash(content);
            String assinatura = signature.encriptarMessage(Hash, pathprivatekey);

            claimDataStore.addDocToClaim(id, fileName, content, user, assinatura);
            JOptionPane.showMessageDialog(frame, "Document added successfully");
            break;
        }
    }

    public static void createClaim(ClaimDataStore claimDataStore, JFrame frame, int user) throws Exception_Exception {
        String description=JOptionPane.showInputDialog("Insert the claim description");
        while (description!=null) {
            while (description.equals("")) {
                description = JOptionPane.showInputDialog("Insert the claim description (Mandatory)");
                if (description==null){
                    break;
                }
            }
            if(description==null){
                break;
            }
            int uuid = claimDataStore.createClaim(description, user);
            String claim = claimDataStore.claimToString(uuid,user);
            JOptionPane.showMessageDialog(frame, "Claim created successfully: " + claim);
            break;
        }
    }

    public static boolean documentValidation(ClaimDataStore db,int cid,int did) throws Exception, java.lang.Exception {
        int userId = db.getDocUserId(cid, did);
        String content = db.getDocContent(cid, did);
        String signature = db.getDocSignature(cid, did);
        Signature hashContent = new Signature(content);
        String contentHashed = hashContent.makeHash(content);
        Signature desencryptSignature = new Signature(signature);
        String signatureDesencypted = desencryptSignature.desencriptarMessage("keys"+System.getProperty("file.separator")+
                "publicKeys"+System.getProperty("file.separator")+"user"+userId+"PublicKey", signature);
        return (contentHashed.equals(signatureDesencypted));
    }

    static void PlaySound(File sound){
        try{
            Clip clip= AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();


            Thread.sleep(clip.getMicrosecondLength()/5000);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



