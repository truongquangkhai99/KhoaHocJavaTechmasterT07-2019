package com.company;

public class Ticket {
    private String ticketId;
    private String userName, passportId;
    private Date startDate, endDate;
    private Integer areaCode; // from 1 to 64

    public Ticket(String ticketId, String userName, String passportId, Integer areaCode) {
        this.ticketId = ticketId;
        this.userName = userName;
        this.passportId = passportId;
        this.areaCode = areaCode;
    }
    public Boolean checkValid() {
        return false;
    }
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }
}
