package ur.courseproject.seviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ur.courseproject.dtos.HomeInfoRequest;
import ur.courseproject.dtos.HomeSloganRequest;
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
    public HomeSloganRequest getSloganById(Long id) {
        return homeMapper.homeEntityToHomeSloganRequest(homeRepo.findById(id).orElseThrow(()->new InfoNotFoundException("Info is not found "+ id)));
    }

    @Override
    public HomeInfoRequest getInfoById(Long id) {
        return homeMapper.homeEntityToHomeInfoRequest(homeRepo.findById(id).orElseThrow(()->new InfoNotFoundException("Info is not found "+ id)));
    }
}
