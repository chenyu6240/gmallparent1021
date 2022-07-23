package com.atguigu.gmall.product.mapper;

import com.atguigu.gmall.model.product.BaseAttrInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BaseAttrInfoMapper extends BaseMapper<BaseAttrInfo> {
    /**
     * 根据分类id 查询平台属性集合
     *mabatis 在使用xml进行查询的时候，如果传递单个参数，直接使用参数名称即可或者使用#{0}
     * 如果是多个参数 使用注解@param映射，xml中使用名称来获取！
     * @param category1Id
     * @param category2Id
     * @param category3Id
     * @return
     */
    List<BaseAttrInfo> selectBaseAttrInfoList(@Param("category1Id") Long category1Id,
                                              @Param("category2Id")Long category2Id,
                                              @Param("category3Id")Long category3Id);
}
