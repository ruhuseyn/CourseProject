package ur.courseproject.services;

import ur.courseproject.dtos.HomeInfoRequest;
import ur.courseproject.dtos.HomeSloganRequest;

public interface HomeService {

    HomeSloganRequest getSloganById(Long id);

    HomeInfoRequest getInfoById(Long id);
}
