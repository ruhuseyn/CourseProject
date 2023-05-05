package ur.courseproject.services;

import ur.courseproject.entities.HomeEntity;

public interface HomeService {

    HomeEntity getSloganById(Long id);

    HomeEntity getInfoById(Long id);
}
