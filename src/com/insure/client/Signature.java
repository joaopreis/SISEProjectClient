package com.insure.client;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class Signature {

    private String message;

    private PrivateKey privatekey;
    private PublicKey publickey;




    public Signature(String message){
        //basicamente guardamos apenas a mensagem que queremos encriptar ou desencriptar
        // e guardamos a path da chave que vamos usar
        this.message=message;
    }

    //este metodo pega na mensagem que queremos enviar e cria o seu hash baseado no sha-256
    public String makeHash(String message) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest digest=MessageDigest.getInstance("SHA-256");
        return Base64.getEncoder().encodeToString(digest.digest(message.getBytes("UTF-8")));
    }

    public String encriptarMessage(String hashmessage,String filename) throws java.lang.Exception, Exception {
        AsymEncryptPriv PrivateEncrypt= new AsymEncryptPriv();
        this.privatekey=PrivateEncrypt.getPrivate(filename);
        return PrivateEncrypt.encryptText(hashmessage,privatekey);

    }
    public String desencriptarMessage(String filename, String encryptedHash) throws java.lang.Exception, Exception {
        AsymDecryptPub privateDesencrypt= new AsymDecryptPub();
        publickey=privateDesencrypt.getPublic(filename);
        return privateDesencrypt.decryptText(encryptedHash,publickey);
    }




}

