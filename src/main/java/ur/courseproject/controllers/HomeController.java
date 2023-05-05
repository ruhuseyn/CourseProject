package ur.courseproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ur.courseproject.dtos.HomeRequest;
import ur.courseproject.entities.HomeEntity;
import ur.courseproject.seviceImpl.HomeImpl;

@Controller
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {

    private final HomeImpl homeImpl;

    @GetMapping("/slogan")
    public HomeRequest getSloganById(Long id){
        return homeImpl.getSloganById(id);
    }

    @GetMapping("/info")
    public HomeRequest getInfoById(Long id){
        return homeImpl.getInfoById(id);
    }
}
