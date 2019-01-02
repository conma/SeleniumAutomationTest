package service;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public interface ScriptGeneratorService
{

    public void scriptGenerator(String testcaseFilePath, String scriptFolderPath)
            throws EncryptedDocumentException, IOException;

}
