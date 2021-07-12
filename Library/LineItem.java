package Library;

public class LineItem {
    private String id;
    private Integer quatity;

    public LineItem(String id, Integer quatity) {
        this.id = id;
        this.quatity = quatity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getQuatity() {
        return quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "id='" + id + '\'' +
                ", quatity=" + quatity +
                '}';
    }
}
