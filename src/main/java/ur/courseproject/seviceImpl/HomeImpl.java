package ur.courseproject.seviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ur.courseproject.entities.HomeEntity;
import ur.courseproject.exceptions.InfoNotFoundException;
import ur.courseproject.repositories.HomeRepo;
import ur.courseproject.services.HomeService;

@Service
@RequiredArgsConstructor
public class HomeImpl implements HomeService {

    private final HomeRepo homeRepo;
    @Override
    public HomeEntity getSloganById(Long id) {
        return homeRepo.findById(id).orElseThrow(()->new InfoNotFoundException("Info is not found "+ id));
    }

    @Override
    public HomeEntity getInfoById(Long id) {
        return homeRepo.findById(id).orElseThrow(()->new InfoNotFoundException("Info is not found "+ id));
    }
}
