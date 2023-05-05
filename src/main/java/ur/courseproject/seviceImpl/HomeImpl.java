package ur.courseproject.seviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ur.courseproject.dtos.HomeRequest;
import ur.courseproject.entities.HomeEntity;
import ur.courseproject.exceptions.InfoNotFoundException;
import ur.courseproject.mappers.HomeMapper;
import ur.courseproject.repositories.HomeRepo;
import ur.courseproject.services.HomeService;

@Service
@RequiredArgsConstructor
public class HomeImpl implements HomeService {

    private final HomeRepo homeRepo;
    private final HomeMapper homeMapper;
    @Override
    public HomeRequest getSloganById(Long id) {
        return homeMapper.homeEntityToHomeRequest(homeRepo.findById(id).orElseThrow(()->new InfoNotFoundException("Info is not found "+ id)));
    }

    @Override
    public HomeRequest getInfoById(Long id) {
        return homeMapper.homeEntityToHomeRequest(homeRepo.findById(id).orElseThrow(()->new InfoNotFoundException("Info is not found "+ id)));
    }
}
