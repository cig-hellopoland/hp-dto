package pl.hellopoland.dto;

import java.util.Date;

public class SalesRowDTO {

    public Long bookingId;
    public Date purchaseDate;
    public Date eventDate;

    public String customerName;
    public String customerEmail;

    public String status;

    public String hash;

    public String sightEventName;
    public String objectName;
    public String partnerName;
    public Long partnerId;

    public SalesRowDTO(Long bookingId,
                       Date purchaseDate,
                       Date eventDate,
                       String customerName,
                       String customerEmail,
                       String status,
                       String serialNumber,
                       String sightEventName,
                       String objectName,
                       String partnerName,
                       Long partnerId) {
        this.bookingId = bookingId;
        this.purchaseDate = purchaseDate;
        this.eventDate = eventDate;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.hash = serialNumber;
        this.sightEventName = sightEventName;
        this.objectName = objectName;
        this.partnerName = partnerName;
        this.partnerId = partnerId;
    }

    public SalesRowDTO(Long bookingId,
                       Date purchaseDate,
                       Date eventDate,
                       String customerName,
                       String customerEmail,
                       String status,
                       String serialNumber,
                       String sightEventName,
                       String objectName) {
        this(
                bookingId,
                purchaseDate,
                eventDate,
                customerName,
                customerEmail,
                status,
                serialNumber,
                sightEventName,
                objectName,
                null,
                null
        );
    }
}