package com.tlw.pd.pdm;

import com.tlw.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;

public class PhysicalDomain extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public String DataType;
    @XmlElement(namespace = "attribute")
    public String Length;

}