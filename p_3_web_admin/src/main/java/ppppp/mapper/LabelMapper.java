package ppppp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import ppppp.bean.Label;

/**
 * @author lppppp
 * @create 2021-03-26 22:51
 */
@Service
@Mapper
public interface LabelMapper {
    public Label getLabel(Long labelId);

    // mapper 纯注解开发
    @Select("select * from t_label where labelId = #{labelId}")
    public Label getLabelByAnno(Long labelId);
}
