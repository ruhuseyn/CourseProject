package ur.courseproject.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ur.courseproject.dtos.HomeInfoRequest;
import ur.courseproject.dtos.HomeSloganRequest;
import ur.courseproject.entities.HomeEntity;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface HomeMapper {

    HomeInfoRequest homeEntityToHomeInfoRequest(HomeEntity homeEntity);

    HomeSloganRequest homeEntityToHomeSloganRequest(HomeEntity homeEntity);
}
