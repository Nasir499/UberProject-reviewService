CREATE TABLE booking_review
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    created_at datetime     NOT NULL,
    updated_at datetime     NOT NULL,
    content    VARCHAR(255) NOT NULL,
    rating DOUBLE NULL,
    booking_id BIGINT       NOT NULL,
    CONSTRAINT pk_booking_review PRIMARY KEY (id)
);

ALTER TABLE booking_review
    ADD CONSTRAINT uc_booking_review_booking UNIQUE (booking_id);

ALTER TABLE booking_review
    ADD CONSTRAINT FK_BOOKING_REVIEW_ON_BOOKING FOREIGN KEY (booking_id) REFERENCES booking (id);
