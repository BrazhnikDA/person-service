package liga.medical.personservice.core.dto;

import liga.medical.dto.MessageType;

public class RabbitMessageDto {
    Integer id;
    Integer personDataId;
    MessageType type;
    String description;

    public RabbitMessageDto() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getPersonDataId() {
        return personDataId;
    }

    public MessageType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPersonDataId(Integer personDataId) {
        this.personDataId = personDataId;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RabbitMessageDto{" +
                "id=" + id +
                ", personDataId=" + personDataId +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }
}

