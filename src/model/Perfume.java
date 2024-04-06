package model;

import java.time.Instant;

public class Perfume {
    private Long perId;
    private String perName;
    private Double perPrice;
    private Integer perQuantity;
    private Instant perCreatedTime;
    private Instant perUpdatedTime;

    public Perfume() {
    }

    public Perfume(Long perId, String perName, Double perPrice, Integer perQuantity, Instant perCreatedTime, Instant perUpdatedTime) {
        this.perId = perId;
        this.perName = perName;
        this.perPrice = perPrice;
        this.perQuantity = perQuantity;
        this.perCreatedTime = perCreatedTime;
        this.perUpdatedTime = perUpdatedTime;
    }

    public Long getPerId() {
        return perId;
    }

    public void setPerId(Long perId) {
        this.perId = perId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public Double getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(Double perPrice) {
        this.perPrice = perPrice;
    }

    public Integer getPerQuantity() {
        return perQuantity;
    }

    public void setPerQuantity(Integer perQuantity) {
        this.perQuantity = perQuantity;
    }

    public Instant getPerCreatedTime() {
        return perCreatedTime;
    }

    public void setPerCreatedTime(Instant perCreatedTime) {
        this.perCreatedTime = perCreatedTime;
    }

    public Instant getPerUpdatedTime() {
        return perUpdatedTime;
    }

    public void setPerUpdatedTime(Instant perUpdatedTime) {
        this.perUpdatedTime = perUpdatedTime;
    }
    public static Perfume parse(String record) {
        String[] fields = record.split(", ");
        long perId = Long.parseLong(fields[0]);
        String perName = fields[1];
        double perPrice = Double.parseDouble(fields[2]);
        int perQuantity = Integer.parseInt(fields[3]);
        Instant perCreatedTime = Instant.parse(fields[4]);
        String temp = fields[5];
        Instant perUpdatedTime = null;
        if (temp != null && !temp.equals("null")) {
            perCreatedTime = Instant.parse(temp);
        }
        return new Perfume(perId, perName, perPrice, perQuantity, perCreatedTime, perUpdatedTime);
    }
}
