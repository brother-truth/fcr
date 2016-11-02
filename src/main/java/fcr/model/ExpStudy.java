package fcr.model;

public class ExpStudy {
    private Integer id;

    private Integer subjectId;

    private String cintent;

    private Integer time;

    private String date;

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

    public String getCintent() {
        return cintent;
    }

    public void setCintent(String cintent) {
        this.cintent = cintent == null ? null : cintent.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }
}