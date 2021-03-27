package ppppp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import ppppp.bean.Label;
import ppppp.mapper.LabelMapper;
import ppppp.mapper.LabelMapperPlug;
import ppppp.service.LabelService;

/**
 * @author lppppp
 * @create 2021-03-27 10:51
 */
@Service
public class LabelServiceImpl extends ServiceImpl<LabelMapperPlug, Label> implements LabelService {
}
