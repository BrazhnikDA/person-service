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
            "type as type " +
            "FROM signals;")
    List<SignalsData> getListSignals();

    @Insert("INSERT INTO signals (id, person_data_id, description, type) " +
            "VALUES (#{id}, #{personDataId}, #{description, jdbcType=VARCHAR}, #{type, jdbcType=VARCHAR});")
    int addSignal(SignalsData signalsData);
}
