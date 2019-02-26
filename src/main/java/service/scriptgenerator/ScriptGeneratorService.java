package service.scriptgenerator;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public interface ScriptGeneratorService
{

    public void generateScriptFiles(String testcaseFilePath, String scriptFolderPath)
            throws EncryptedDocumentException, IOException;

}
