package fcr.model;

public class ExpImitation {
    private Integer id;

    private Integer subjectId;

    private String imiContent;

    private String imiResult;

    private String imiTime;

    private String imiDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getImiContent() {
        return imiContent;
    }

    public void setImiContent(String imiContent) {
        this.imiContent = imiContent == null ? null : imiContent.trim();
    }

    public String getImiResult() {
        return imiResult;
    }

    public void setImiResult(String imiResult) {
        this.imiResult = imiResult == null ? null : imiResult.trim();
    }

    public String getImiTime() {
        return imiTime;
    }

    public void setImiTime(String imiTime) {
        this.imiTime = imiTime == null ? null : imiTime.trim();
    }

    public String getImiDate() {
        return imiDate;
    }

    public void setImiDate(String imiDate) {
        this.imiDate = imiDate == null ? null : imiDate.trim();
    }
}