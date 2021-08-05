package Library;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


public class RentalVoucher {
    private static Long genId = 1L;
    private Long id;
    private String code;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private List<LineItem> lineItems;

    public RentalVoucher(String code, LocalDateTime dateStart, LocalDateTime dateEnd, List<LineItem> lineItems) {
        this.id =genId++;
        this.code = code;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.lineItems = lineItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @Override
    public String toString() {
        return "RentalVoucher{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", lineItems=" + lineItems +
                '}';
    }
}
