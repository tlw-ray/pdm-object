package top.xskr.pd.pdm;

import top.xskr.pd.pdm.abs.PdArtifical;

import javax.xml.bind.annotation.XmlElement;

public class Relationship extends PdArtifical {
    @XmlElement(namespace = "attribute")
    public String Entity1ToEntity2RoleCardinality;
    @XmlElement(namespace = "attribute")
    public String Entity2ToEntity1RoleCardinality;
}
