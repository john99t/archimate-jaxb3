package com.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import org.opengroup.archimate31.ModelType;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

public class UnMarshallTest {

    public static final String ARCHIMATE_JAXB_PACKAGE = "org.opengroup.archimate31";

    @Test
    public void unmarshalModelMetadata() throws JAXBException, URISyntaxException {
        var context = JAXBContext.newInstance(ARCHIMATE_JAXB_PACKAGE);
        var element = (JAXBElement) context.createUnmarshaller().unmarshal(getFileFromResource("Basic_Model.xml"));
        assertEquals(ModelType.class, element.getDeclaredType());

        var model = (ModelType)element.getValue();
        assertEquals("Example of a basic model with two elements and a relationship", model.getDocumentation().get(0).getValue());
        assertNull(model.getViews());
        assertEquals(2, model.getElements().getElement().size());
        assertEquals(1, model.getRelationships().getRelationship().size());
    }

    private File getFileFromResource(String fileName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            // failed if files have whitespaces or special characters
            //return new File(resource.getFile());
            return new File(resource.toURI());
        }

    }
}
