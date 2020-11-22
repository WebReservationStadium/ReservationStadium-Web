package th.ac.ku.reservation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Date;
import java.sql.Time;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReservedStadium {

    private int id;

    private int userId;
    private Date day;
    private Time start;
    private Time end;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "reservedStadium{" +
                "id=" + id +
                ", userId=" + userId +
                ", day=" + day +
                ", start=" + start +
                ", end=" + end +
                ", status=" + status +
                '}';
    }
}
