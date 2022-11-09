package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.PersonData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonDataMapper {
    @Select("SELECT " +
            "id, " +
            "last_name as lastName, " +
            "first_name as firstName, " +
            "birth_dt as birthDt, " +
            "age, " +
            "sex, " +
            "contact_id as contactId, " +
            "medical_card_id as medicalCardId, " +
            "parent_id as parentId " +
            "FROM person_data;")
    List<PersonData> getListPersonData();

    @Insert("INSERT INTO contact (id, phone_number, email, profile_link) " +
            "VALUES (#{id}, #{phoneNumber}, #{email}, #{profileLink})")
    int addPersonData(PersonData personData);
}
