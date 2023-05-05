package ur.courseproject.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ur.courseproject.dtos.HomeRequest;
import ur.courseproject.entities.HomeEntity;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface HomeMapper {

    HomeRequest homeEntityToHomeRequest(HomeEntity homeEntity);
}
