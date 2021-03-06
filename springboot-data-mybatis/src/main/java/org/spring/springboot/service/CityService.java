package org.spring.springboot.service;

import org.spring.springboot.domain.City;

/**
 * 城市业务逻辑接口类
 * <p>
 * Created by mongoding on 07/02/2017.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findCityByName(String cityName);
}
