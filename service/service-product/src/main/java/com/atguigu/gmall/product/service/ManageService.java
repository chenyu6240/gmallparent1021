package com.atguigu.gmall.product.service;
/* *      1，平台属性可以挂在一级分类、二级分类和三级分类
         *      2，查询一级分类下面的平台属性，传：category1Id，0，0；   取出该分类的平台属性
         *      3，查询二级分类下面的平台属性，传：category1Id，category2Id，0；
         *         取出对应一级分类下面的平台属性与二级分类对应的平台属性
         *      4，查询三级分类下面的平台属性，传：category1Id，category2Id，category3Id；
         *         取出对应一级分类、二级分类与三级分类对应的平台属性
**/

import com.atguigu.gmall.model.product.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ManageService {
    /**
     * 获取所有一级分类数据
     * @return
     */
    List<BaseCategory1> getBaseCategory1();

    /**
     * 根据一级分类id，获取所有二级分类数据
     * @param category1Id
     * @return
     */
    List<BaseCategory2> getBaseCategory2(Long category1Id);

    /**
     * 根据二级分类id，获取所有三级分类数据
     * @param category2Id
     * @return
     */
    List<BaseCategory3> getBaseCategory3(Long category2Id);

    /**
     * 根据分类id，获取平台属性列表
     * @param category1Id
     * @param category2Id
     * @param category3Id
     * @return
     */
    List<BaseAttrInfo> getBaseAttrInfoList(Long category1Id,Long category2Id,Long category3Id);

    /**
     * 保存平台属性
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 根据平台属性id 获取平台属性值集合
     * @param attrId
     * @return
     */
    List<BaseAttrValue> getAttrValueList(Long attrId);

    /**
     * 根据平台属性id 获取平台属性值集合
     * @param attrId
     * @return
     */
    BaseAttrInfo getBaseAttrInfo(Long attrId);
}
