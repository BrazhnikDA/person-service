package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.SignalsData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SignalsMapper {

    @Select("SELECT " +
            "id, " +
            "person_data_id as personDataID, " +
            "description as description, " +
            "FROM signals;")
    List<SignalsData> getListSignals();

    @Insert("INSERT INTO contact (id, person_data_id, description) " +
            "VALUES (#{id}, #{personDataID}, #{description}")
    int addSignal(SignalsData signalsData);
}
