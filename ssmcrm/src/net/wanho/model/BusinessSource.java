package net.wanho.model;

public class BusinessSource {
    private Integer sourceId;

    private String sourceName;

    public BusinessSource(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }
}