package ur.courseproject.services;

import ur.courseproject.dtos.HomeRequest;
import ur.courseproject.entities.HomeEntity;

public interface HomeService {

    HomeRequest getSloganById(Long id);

    HomeRequest getInfoById(Long id);
}
