package com.wh.bean;

public class Product_type {
    private Integer typeId;

    private String typeName;

    private String typeDescription;

    private Integer parentTypeId;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription == null ? null : typeDescription.trim();
    }

    public Integer getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(Integer parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
}