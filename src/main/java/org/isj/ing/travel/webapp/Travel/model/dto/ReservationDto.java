package org.isj.ing.travel.webapp.Travel.model.dto;

@ApiModel()
public class ReservationDto extends AbstractDto<Long> {
    private Long id;

    public ReservationDto() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}