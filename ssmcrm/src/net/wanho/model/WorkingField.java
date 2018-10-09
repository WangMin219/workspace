package net.wanho.model;

public class WorkingField {
    private Integer fieldId;

    private String fieldName;

    public WorkingField(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }
}