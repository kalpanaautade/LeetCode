package IAM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Objects;

public class AddCertInTrustStore {
    public static void addX509CertificateToTrustStore(String certPath, String certAlias, String storePath, String storePassword, String storeType)
            throws FileNotFoundException, KeyStoreException, CertificateException, IOException, NoSuchAlgorithmException {

        char[] storePasswordCharArr = Objects.requireNonNull(storePassword, "").toCharArray();

        KeyStore keystore;
        try (FileInputStream storeInputStream = new FileInputStream(storePath);
             FileInputStream certInputStream = new FileInputStream(certPath)) {
            keystore = KeyStore.getInstance(storeType);
            keystore.load(storeInputStream, storePasswordCharArr);

            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            Certificate certificate = certificateFactory.generateCertificate(certInputStream);

            keystore.setCertificateEntry(certAlias, certificate);
        } finally {
        }

        try (FileOutputStream storeOutputStream = new FileOutputStream(storePath)) {
            keystore.store(storeOutputStream, storePasswordCharArr);
            System.out.println("Done Successfully");
        } finally {

            System.out.println("Done Successfully.");
        }
    }
    public static void main(String[] args) throws CertificateException, KeyStoreException, IOException, NoSuchAlgorithmException {
        addX509CertificateToTrustStore( "C:\\IAM\\Cert\\iwaswidmvmap11.cer", "pingcert", "C:\\Program Files\\Zulu\\zulu-11\\lib\\security\\cacerts", "changeit", "JKS");
    }
}
