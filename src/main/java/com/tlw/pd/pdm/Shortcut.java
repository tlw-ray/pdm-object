package com.tlw.pd.pdm;

import com.tlw.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;

public class Shortcut extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public String TargetStereotype;
    @XmlElement(namespace = "attribute")
    public String TargetID;
    @XmlElement(namespace = "attribute")
    public String TargetClassID;
}
