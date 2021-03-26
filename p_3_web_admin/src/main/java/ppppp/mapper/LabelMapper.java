package ppppp.mapper;

import org.apache.ibatis.annotations.Mapper;
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
}
