package tw.waterballsa.gaas.saboteur.spring.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.waterballsa.gaas.saboteur.app.usecases.WalkingSkeletonUseCase;

@AllArgsConstructor
@RestController
public class WalkingSkeletonController {
    private final WalkingSkeletonUseCase usecase;

    @GetMapping("/walking-skeleton")
    public String walk() {
        return usecase.execute();
    }
}
